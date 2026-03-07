package StepDefinition;

import Pages.DescargarDocumentosPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DescargarDocumentosStep {
    private WebDriver driver;
    DescargarDocumentosPage DescargarDocumentosPage = new  DescargarDocumentosPage();

    public DescargarDocumentosStep() {
    }

    @When("Se selecciona el documento")
    public void se_selecciona_el_documento() {
        DescargarDocumentosPage.seleccionarDocumentos();
    }
    @When("Se hace clic en el boton descargar {string}")
    public void se_hace_clic_en_el_boton_descargar(String string) {
        DescargarDocumentosPage.descargarDocumento(string);
    }
    @Then("El sistema descarga el archivo en el ordenador")
    public void el_sistema_descarga_el_archivo_en_el_ordenador() {

    }


}
