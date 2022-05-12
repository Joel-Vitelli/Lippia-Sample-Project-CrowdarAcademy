package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.AutomationPracticeService;

public class AutomationPracticeSteps extends PageSteps {

    @Given("El usuario se encuentra en la web Automation Practice")
    public void elUsuarioSeEncuentraEnLaWebAutomationPractice() {
        AutomationPracticeService.navegarWeb();
    }

    @When("^El usuario clickea el botón \"(.*)\" del menú$")
    public void elUsuarioClickeaElBotónDelMenú(String myAccountButton) {
        AutomationPracticeService.clickMyAccount();
    }

    @And("^El usuario ingresa su username \"(.*)\"$")
    public void elUsuarioIngresaSuUsername(String username) {
        AutomationPracticeService.competarUsername(username);
    }

    @And("^El usuario ingresa su pasword \"(.*)\"$")
    public void elUsuarioIngresaSuPasword(String password) {
        AutomationPracticeService.competarPassword(password);
    }

    @And("^El usuario clickea el botón \"(.*)\"$")
    public void elUsuarioClickeaElBotón(String loginButton) {
        AutomationPracticeService.clickLoginBtn();
    }

    @Then("El usuario verifica que ingreso correctamente a la web")
    public void elUsuarioVerificaQueIngresoCorrectamenteALaWeb() {
        AutomationPracticeService.verificarLogin();
    }
}
