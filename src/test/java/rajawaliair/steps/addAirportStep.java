package rajawaliair.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rajawaliair.driverManager;
import rajawaliair.generateData;
import rajawaliair.pages.airportPageAdmin;

public class addAirportStep {

    private airportPageAdmin getAirportPageAdmin() {
        return new airportPageAdmin(driverManager.getInstance().getDriver());
    }

    @When("admin adds airport data")
    public void adminAddsAirportData() {
        getAirportPageAdmin().doAddAirport();
    }

    @Then("admin can view new airport data successfully added")
    public void verifyCanViewNewDataAirportAdded() {
        getAirportPageAdmin().verifyNewAirportsuccessfullyAdded();
    }


    @When("admin do edit airport data")
    public void adminDoEditAirportData() {
        getAirportPageAdmin().doEditDataAirport();
    }

    @Then("admin can view new airport data successfully edited")
    public void verifyCanViewNewDataEdited() {
        getAirportPageAdmin().verifyNewAirportsuccessfullyEdit();
    }

    @When("admin delete airport data")
    public void doDeleteDataAirport() {
        getAirportPageAdmin().doDeleteNewAirport();
    }

    @Then("airport data will be deleted")
    public void verifySuccessfullyDelete() {
        getAirportPageAdmin().verifyElementNotPresent();
    }
}
