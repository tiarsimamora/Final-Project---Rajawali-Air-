package rajawaliair.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rajawaliair.driverManager;
import rajawaliair.pages.homePage;
import rajawaliair.pages.orderPage;

public class orderStep {
    private homePage gethomePage() {
        return new homePage(driverManager.getInstance().getDriver());
    }
    private orderPage getorderPage() {
        return new orderPage(driverManager.getInstance().getDriver());
    }

    @When("user search ticket")
    public void selectSourceAirport() {
        gethomePage().doSelectFromAirport();
        gethomePage().doSelectToAirport();
        gethomePage().doSelectDate();
        gethomePage().doSelectDetailPassenger();
        gethomePage().doFinishSearchTicket();
    }
    @And("user choose ticket")
    public void chooseTicket() {

        getorderPage().doOrder();
    }

    @And("user add-on baggage, meals and insurance")
    public void addOns() {

        getorderPage().doAddOnsOrder();
    }

    @Then("user is on select ticket type page")
    public void userDirectToSelectTicketPage() {
        new orderPage(driverManager.getInstance().getDriver());
        orderPage.verifyIconCompleteOrder();

    }
}
