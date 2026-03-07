package Pages;

import Hooks.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Pages.MetodosPage.*;
import static org.junit.Assert.assertEquals;

public class CrearUsuariosPage {
    private WebDriver driver;

    //region
    public By usuariosOpt = By.xpath("//a[@href='#/users']");
    public By usuariosBtn = By.className("fa-users");
    public By usuarioBtn = By.className("fa-user-plus");
    public By nombreTxt = By.id("first-name-user");
    String usuario="";

    //endregion
    public CrearUsuariosPage() {
        this.driver = BrowserDriver.driver;
    }
    public void seleccionarUsuarios() {
        driver.findElement(usuariosOpt).click();
    }
    public void presionarCrearUsuario() throws InterruptedException {
        esClickeable(1,usuariosBtn);
        clickearHastaExistir(usuarioBtn, nombreTxt);
    }
}
