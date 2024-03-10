package rajawaliair.steps;

import rajawaliair.driverManager;
import rajawaliair.pages.loginPage;
import rajawaliair.pages.registerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.java.en.When;

public class signUpStep {

    private registerPage userSignUp() {
        return new registerPage (driverManager.getInstance().getDriver());
    }

    @When("user register using valid data")

    public void userRegister() {

        userSignUp().doUserRegister();
    }

    @Then("user direct to OTP verify screen")
    public void userDirectToinputOTPScreen() {
        new registerPage(driverManager.getInstance().getDriver());
        registerPage.verifyOTPButtonExist();

    }

    @When("user register using email1234gmail.com")

    public void userFailRegister() {

        userSignUp().doUserFailRegister();
    }

    @Then("error exist with value {string}")
    public void errorAlertExistRegister(String message) {
        new registerPage(driverManager.getInstance().getDriver());
        registerPage.verifyErrorAlertRegisterExist(message);

    }
}
