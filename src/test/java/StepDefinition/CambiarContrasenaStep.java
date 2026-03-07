package StepDefinition;

import Pages.CambiarContrasenaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CambiarContrasenaStep {
    private WebDriver driver;
    CambiarContrasenaPage CambiarContrasenaPage = new CambiarContrasenaPage();
    public CambiarContrasenaStep() {
    }
    @When("Se hace clic en cambiar contrasena")
    public void se_hace_clic_en_cambiar_contrasena() {
        CambiarContrasenaPage.presionarCambiarContrasena();
    }
    @When("Se ingresa la antigua contrasena")
    public void se_ingresa_la_antigua_contrasena() {
        CambiarContrasenaPage.ingresarContrasenaActual();
    }
    @When("Se ingresa la nueva contrasena")
    public void se_ingresa_la_nueva_contrasena() {
        CambiarContrasenaPage.ingresarContrasenaNueva();
        CambiarContrasenaPage.ingresarConfirmacion();
        CambiarContrasenaPage.presionarCambiar();
    }
    @Then("Se actualiza correctamente y direcciona al login")
    public void se_actualiza_correctamente_y_direcciona_al_login() {
        CambiarContrasenaPage.mostrarModalConfirmacion();
    }

    @Given("Se hace clic en olvidar contrasena")
    public void se_hace_clic_en_olvidar_contrasena() {
        CambiarContrasenaPage.presionarOlvidoContrasena();
    }
    @When("Se ingresa el email")
    public void se_ingresa_el_email() {
        CambiarContrasenaPage.ingresarEmail();

    }
    @Then("El sistema valida la identidad y envia un correo electronico")
    public void el_sistema_valida_la_identidad_y_envia_un_correo_electronico() {
        CambiarContrasenaPage.presionarCerrar();

    }

}
