package rajawaliair.steps;

import io.cucumber.java.en.And;
import rajawaliair.driverManager;
import rajawaliair.pages.homePage;
import rajawaliair.pages.loginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchStep {

    //    @When("user click source aiport")
//    public void clickSourceAirport() {
//        WebElement sourceAirport = driver.findElement(By.id("sourceAirport"));
//        sourceAirport.click();
//    }
    private homePage gethomePage() {
        return new homePage(driverManager.getInstance().getDriver());
    }
    @When("user selects source airport")
    public void selectSourceAirport() {
        gethomePage().doSelectFromAirport();
    }

    @And("user selects destination airport")
    public void selectDestinationAirport() {
        gethomePage().doSelectToAirport();
    }

    @And ("user select departure date")
    public void SelectDate() {
        gethomePage().doSelectDate();
    }
    @And ("user select passenger")
    public void SelectDetailPassenger() {
        gethomePage().doSelectDetailPassenger();
    }
    @And ("user click on search button")
    public void FinishSearchTicket() {
        gethomePage().doFinishSearchTicket();
    }

    @Then("user is on ticket page")
    public void userDirectToTicketPage() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.verifyIconFilterExist();

    }

}
