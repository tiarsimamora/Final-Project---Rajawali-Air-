package rajawaliair.steps;

import rajawaliair.driverManager;
import rajawaliair.pages.homePage;
import rajawaliair.pages.loginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {
    @When("user login using {string}")
    public void loginAs(String credentialType) {

        String email;
        String password;

        switch (credentialType) {
            case "admin@gmail.com" -> {
                email = "admin@gmail.com";
                password = "adminadmin";
            }
            case "admin1@gmail.com" -> {
                email = "admin1@gmail.com";
                password = "adminadmin";
            }
            case "admin.qa@gmail.com" -> {
                email = "admin@gmail.com";
                password = "wrongpass";
            }
            default -> throw new RuntimeException("credential type doesn't exist");
        }
        loginPage loginPage = new loginPage(driverManager.getInstance().getDriver());
        loginPage.userLogin(email, password);
    }
    @Then("user direct to dashboard screen")
    public void userDirectToDashboardScreen() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.verifyNotifIconExist();

    }

    @Then("error alert exist with value {string}")
    public void errorAlertExist(String message) {
        new loginPage(driverManager.getInstance().getDriver());
        loginPage.verifyErrorAlertExist(message);

    }

    @Then("password error alert exist with value {string}")
    public void errorAlertExist2(String message) {
        new loginPage(driverManager.getInstance().getDriver());
        loginPage.verifyErrorAlertPassExist(message);

    }
}
