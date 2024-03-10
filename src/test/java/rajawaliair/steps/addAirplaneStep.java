package rajawaliair.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rajawaliair.driverManager;
import rajawaliair.pages.airplanePageAdmin;

public class addAirplaneStep {

    private airplanePageAdmin getAirplanePageAdmin() {
        return new airplanePageAdmin(driverManager.getInstance().getDriver());
    }

    @When("admin adds airplane data")
    public void addAirplaneData() {
        getAirplanePageAdmin().doAddAirplane();
    }

    @Then("admin can view new airplane data successfully added")
    public void verifyCanViewNewDataAirportAdded() {
        getAirplanePageAdmin().verifyNewAirplaneAddedSuccessfully();
    }

    @When("admin do edit airplane data")
    public void adminDoEditAirplaneData() {
        getAirplanePageAdmin().doEditAirplane();
    }

    @Then("admin can view new airplane data successfully edited")
    public void verifyCanViewNewDataEdited() {
        getAirplanePageAdmin().verifyNewAirplaneEditedSuccessfully();
    }

    @When("admin delete airplane data")
    public void doDelteDataAirplane() {
        getAirplanePageAdmin().doDeleteNewAirplane();
    }

    @Then("airplane data will be deleted")
    public void verifySuccessfullyDelte() {
        getAirplanePageAdmin().verifyElementNotPresent();
    }
}
