package Pages;

import Hooks.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Pages.MetodosPage.*;
import static org.junit.Assert.assertEquals;

public class DescargarDocumentosPage {
    private WebDriver driver;

    //region
    public By tarjetas = By.xpath("(//app-tarjetas//div/strong//span)[1]");
    String tipo="PDF";
    public By descargarBtn = By.xpath("//button//span[contains(text(), '"+tipo+"')] | //li//button[contains(text(), '"+tipo+"')] ");

    //endregion
    public DescargarDocumentosPage() {
        this.driver = BrowserDriver.driver;
    }

    public void seleccionarDocumentos() {
        driver.findElement(tarjetas).click();
    }
    public void descargarDocumento(String documento) {
        tipo=documento;
        descargarBtn = By.xpath("//button//span[contains(text(), '"+tipo+"')] | //li//button[contains(text(), '"+tipo+"')] ");
        driver.findElement(descargarBtn).click();
    }
}
