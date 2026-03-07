package Pages;
import Hooks.BrowserDriver;
import org.openqa.selenium.*;

public class IniciarSesionPage {
    private WebDriver driver;
    public By usuarioTxt = By.xpath("//input[@name='user']");
    public By contrasenaTxt = By.xpath("//input[@name='password']");
    public By ingresarBtn = By.xpath("//button[text()='Ingresar']");
    public By usuarioIncorrectoToaster = By.className("alert-danger");
    public By home = By.className("lead");

    public IniciarSesionPage() {
        this.driver = BrowserDriver.driver;
    }

    public void ingresarUsuario(String usuario) {
        driver.findElement(usuarioTxt).sendKeys(usuario);
    }
    public void ingresarContrasena(String contrasena) {
        driver.findElement(contrasenaTxt).sendKeys(contrasena);
    }
    public void presionarIngresar() {
        driver.findElement(ingresarBtn).click();
    }
    public void mostrarToasterIncorrecto() {
        driver.findElement(usuarioIncorrectoToaster).isDisplayed();
    }
    public void mostrarHome() {
        driver.findElement(home).isDisplayed();
    }
}
