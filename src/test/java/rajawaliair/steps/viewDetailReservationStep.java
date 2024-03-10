package rajawaliair.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rajawaliair.driverManager;
import rajawaliair.pages.homePageAdmin;

public class viewDetailReservationStep {

    private homePageAdmin getHomePageAdmin() {
        return new homePageAdmin (driverManager.getInstance().getDriver());
    }
    @When("admin click detail reservation")
    public void adminClickDetailReservation() {
        getHomePageAdmin().doViewDetail();
    }

    @Then("admin can view detail reservation")
    public void verifyCanViewDetailReservation() {
        getHomePageAdmin().verifyShowDetailSuccessfully();
    }

}
