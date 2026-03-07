package Hooks;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.Scenario;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BrowserDriver {
    public static WebDriver driver;
    public static ChromeOptions options;
    public static String ambiente;

    private BrowserDriver() {
    }

    @Before
    public static void setUp(Scenario scenario) {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
            options = new ChromeOptions();
            // options.addArguments("--headless"); // Ejecutar en modo headless
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--window-size=1920,1080");

            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            try {
                ambiente="https://test.com.co/#/";
                driver.get(ambiente);
                System.out.println("Página abierta exitosamente. con hooks");

                String logo = Paths.get("src/test/resources/Files/logo.PNG").toAbsolutePath().toString();
                byte[] fileContent = Files.readAllBytes(Paths.get(logo));
                String base64Image = Base64.getEncoder().encodeToString(fileContent);
                scenario.attach(Base64.getDecoder().decode(base64Image), "image/png", "Logo: ");
                System.out.println("logo adjunto");

            } catch (Exception e) {
                System.out.println("Hubo un problema al intentar abrir la página: " + e.getMessage());
            }
        }else {
            System.out.println("no entro al hook before");
        }

    }

    @After
    public static void tearDown(Scenario scenario) throws IOException {
        if (driver != null) {
            String screenshotName = scenario.getName().replaceAll(" ", "_")+ "_" + System.currentTimeMillis();
            String filePath = "src/test/resources/Screenshots/" + screenshotName + ".png";

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
            try {
            FileUtils.copyFile(scrFile, new File(filePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            scenario.attach(Base64.getDecoder().decode(base64Screenshot), "image/png", "Captura de pantalla: " + scenario.getName() + "_" + System.currentTimeMillis());
            System.out.println("Cerrando el navegador.");
            driver.quit();
            driver = null;

        }
    }

}

