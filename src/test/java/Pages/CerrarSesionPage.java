package Pages;

import Hooks.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CerrarSesionPage {
    private WebDriver driver;

    //region
    public By menuDdwn = By.xpath("//li[@class='nav-item dropdown']//a[@id='navbarDropdown']");
    public By cerrarSesionOpt = By.xpath("//a[@href='#/']");
    public By paginaInicio = By.name("user");

    //endregion
    public CerrarSesionPage() {
        this.driver = BrowserDriver.driver;
    }
    public void presionarMenu() {
        driver.findElement(menuDdwn).click();
    }
    public void presionarCerrarSesion() {
        driver.findElement(cerrarSesionOpt).click();
    }
    public void mostrarLogin() {
        driver.findElement(paginaInicio).isDisplayed();
    }

}
