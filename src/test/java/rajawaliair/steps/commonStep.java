package rajawaliair.steps;

import rajawaliair.keyword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class commonStep {

    @Given("user navigate to url {string}")
    public void navigateToUrl(String url) {
        keyword.navigateToUrl(url);
    }
    @And("user take screenshot {string}")
    public void userTakeScreenshot(String namaFile) {
        keyword.take_screenshot(namaFile);
    }
}
