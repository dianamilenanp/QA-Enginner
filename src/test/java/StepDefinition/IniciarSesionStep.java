package StepDefinition;
import Pages.IniciarSesionPage;
import io.cucumber.java.en.*;

public class IniciarSesionStep   {
    IniciarSesionPage iniciarSesionPage = new IniciarSesionPage();
    public IniciarSesionStep() {
    }

    @Given("Se ingresa un usuario {string} y una contraseña {string}")
    public void se_ingresa_un_usuario_y_una_contraseña(String usuario, String contrasena) {
        iniciarSesionPage.ingresarUsuario(usuario);
        iniciarSesionPage.ingresarContrasena(contrasena);
    }
    @When("Se hace clic en el boton de iniciar sesion")
    public void se_hace_clic_en_el_boton_de_iniciar_sesion() throws InterruptedException {
        iniciarSesionPage.presionarIngresar();
        Thread.sleep(8000);
    }
    @Then("El sistema valida el usuario y direcciona a la pagina de inicio")
    public void el_sistema_valida_el_usuario_y_direcciona_a_la_pagina_de_inicio() {
        iniciarSesionPage.mostrarHome();
        System.out.println("home exitoso");
    }
    @Then("El sistema valida el usuario e indica que las credenciales no son correctas")
    public void el_sistema_valida_el_usuario_e_indica_que_las_credenciales_no_son_correctas() {
        iniciarSesionPage.mostrarToasterIncorrecto();
    }

}
