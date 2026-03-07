package StepDefinition;

import Pages.CrearUsuariosPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CrearUsuariosStep {

    CrearUsuariosPage CrearUsuariosPage = new CrearUsuariosPage();

    public CrearUsuariosStep() {
    }

    @When("Se hace clic en usuarios")
    public void se_hace_clic_en_usuarios() {
        CrearUsuariosPage.seleccionarUsuarios();
    }
    @When("Se hace clic en crear usuario")
    public void se_hace_clic_en_crear_usuario() throws InterruptedException {
        CrearUsuariosPage.presionarCrearUsuario();
    }
}
