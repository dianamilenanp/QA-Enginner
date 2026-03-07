package Pages;

import Hooks.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CambiarContrasenaPage {
    private WebDriver driver;

    //region
    public By cambiarContrasenaOpt  = By.xpath("//a[@href='#/settings']");
    public By contrasenaActualTxt  = By.name("oldPassword");
    public By contraseñaNuevaTxt  = By.name("newPassword");
    public By confirmacionTxt  = By.name("confirmPassword");
    public By cambiarBtn  = By.xpath("//button[text()='Cambiar contraseña']");
    public By modalConfirmacion  = By.xpath("//div[@id='confirmModal']//button");
    public By olvidoContrasenaBtn  = By.xpath("//button[text()='¿Olvidó su contraseña?']");
    public By cerrarBtn  = By.xpath("//button[text()='Cerrar']");
    public By emailTxt  = By.name("emailRC");

    //endregion
    public CambiarContrasenaPage() {
        this.driver = BrowserDriver.driver;
    }
    public void presionarCambiarContrasena() {
        driver.findElement(cambiarContrasenaOpt).click();
    }
    public void ingresarContrasenaActual() {
        driver.findElement(contrasenaActualTxt).sendKeys("Abc123-+");
    }
    public void ingresarContrasenaNueva() {
        driver.findElement(contraseñaNuevaTxt).sendKeys("Abc123-+");
    }
    public void ingresarConfirmacion() {
        driver.findElement(confirmacionTxt).sendKeys("Abc123-+");
    }
    public void presionarCambiar() {
        driver.findElement(cambiarBtn).click();
    }
    public void mostrarModalConfirmacion() {
        driver.findElement(modalConfirmacion).isDisplayed();
    }
    public void presionarOlvidoContrasena() {
        driver.findElement(olvidoContrasenaBtn).click();
    }
    public void ingresarEmail() {
        driver.findElement(emailTxt).click();
        driver.findElement(emailTxt).sendKeys("test@test.com");
    }
   public void presionarCerrar() {
        driver.findElement(cerrarBtn).click();
    }
}
