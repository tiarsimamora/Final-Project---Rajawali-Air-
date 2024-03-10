package rajawaliair.steps;//package rajawaliair.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rajawaliair.driverManager;
import rajawaliair.generateData;
import rajawaliair.pages.flightPageAdmin;

public class addFlightStep {

    private flightPageAdmin getFlightPageAdmin() {
        return new flightPageAdmin (driverManager.getInstance().getDriver());
    }

    @When("admin adds flight data")
    public void adminAddsFlightData() {
        getFlightPageAdmin().doAddFlight();
    }

    @Then("admin can view new flight data successfully added")
    public void verifyCanViewNewDataFlightAdded() {
        getFlightPageAdmin().verifyNewFlightsuccessfullyAdded();
    }


//    @When("admin do edit airport data")
//    public void adminDoEditAirportData() {
//        getAirportPageAdmin().doEditDataAirport();
//    }
//
//    @Then("admin can view new airport data successfully edited")
//    public void verifyCanViewNewDataEdited() {
//        getAirportPageAdmin().verifyNewAirportsuccessfullyEdit();
//    }
//
    @When("admin delete flight data")
    public void doDeleteDataAirport() {
        getFlightPageAdmin().doDeleteNewFligth();
    }

    @Then("flight data will be deleted")
    public void verifySuccessfullyDelete() {
        getFlightPageAdmin().verifyElementNotPresent();
    }
}
