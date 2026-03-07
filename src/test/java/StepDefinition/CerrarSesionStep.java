package StepDefinition;

import Pages.CerrarSesionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CerrarSesionStep {
    private WebDriver driver;
    CerrarSesionPage CerrarSesionPage = new CerrarSesionPage();

    public CerrarSesionStep() {

    }


    @When("Se hace clic en el menu")
    public void se_hace_clic_en_el_menu() {
        CerrarSesionPage.presionarMenu();
    }
    @When("Se hace clic en salir")
    public void se_hace_en_salir() {
        CerrarSesionPage.presionarCerrarSesion();
    }
    @Then("El sistema direcciona al login")
    public void el_sistema_direcciona_al_login() {
        CerrarSesionPage.mostrarLogin();
    }
}
