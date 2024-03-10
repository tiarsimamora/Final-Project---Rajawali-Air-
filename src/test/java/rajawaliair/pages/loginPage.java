package rajawaliair.pages;

import rajawaliair.keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class loginPage {
    protected WebDriver webDriver;

    public loginPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "email")
    private static WebElement input_email;

    @FindBy(id = "password")
    private static WebElement input_password;

    @FindBy(xpath = "/html/body/div/div/div[3]/button")
    private static WebElement login_button;

    @FindBy(xpath = "/html/body/div/div/div[3]/div[2]/p")
    private static WebElement error_alert;

    @FindBy(xpath = "/html/body/div/div/div[3]/div[4]/p")
    private static WebElement error_alert_passw;

    public void userLogin(String email, String password) {
        keyword.inputText(input_email, email);
        keyword.inputText(input_password, password);
        keyword.tapElement(login_button);
    }

    public static void verifyErrorAlertExist(String expectedMessage){
        String actual = error_alert.getText();
        Assert.assertEquals(actual,expectedMessage );
    }

    public static void verifyErrorAlertPassExist(String expectedMessage){
        String actual = error_alert_passw.getText();
        Assert.assertEquals(actual,expectedMessage );
    }
}
