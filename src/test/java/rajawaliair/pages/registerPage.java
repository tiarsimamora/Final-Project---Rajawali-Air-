package rajawaliair.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import rajawaliair.keyword;

import java.time.Duration;

public class registerPage {
    protected WebDriver webDriver;

    public registerPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "fullName")
    private static WebElement input_fullName;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[5]/input")
    private static WebElement input_email;

    @FindBy(id = "phoneNumber")
    private static WebElement input_phoneNumber;

    @FindBy(id = "password")
    private static WebElement input_password;
    @FindBy(id = "confirmPassword")
    private static WebElement input_confirmPassword;

    @FindBy(xpath = "/html/body/div/div/div[2]/button")
    private static WebElement signUp_button;

    @FindBy(xpath = "/html/body/div/div/div[3]/button")
    private static WebElement verify_button;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[5]/p")
    private static WebElement error_alert;
    public void doUserRegister() {
//        keyword.inputText(input_fullName, "");
//        keyword.tapElement(input_fullName);
//        keyword.waitFor(1);
        keyword.inputText(input_fullName, "Tester");
//        keyword.inputText(input_email, "");
//        keyword.tapElement(input_email);
//        keyword.waitFor(1);
        keyword.inputText(input_email, "email1234@gmail.com");
//        keyword.inputText(input_phoneNumber, "");
//        keyword.tapElement(input_phoneNumber);
//        keyword.waitFor(1);
        keyword.inputText(input_phoneNumber, "085465433212");
//        keyword.inputText(input_password, "");
//        keyword.tapElement(input_password);
//        keyword.waitFor(1);
        keyword.inputText(input_password, "password");
//        keyword.inputText(input_confirmPassword, "");
//        keyword.tapElement(input_confirmPassword);
//        keyword.waitFor(1);
        keyword.inputText(input_confirmPassword, "password");
        keyword.tapElement(signUp_button );

    }

    public void doUserFailRegister() {
        keyword.inputText(input_fullName, "");
        keyword.tapElement(input_fullName);
        keyword.waitFor(1);
        keyword.inputText(input_fullName, "Tester");
        keyword.inputText(input_email, "");
        keyword.tapElement(input_email);
        keyword.waitFor(1);
        keyword.inputText(input_email, "email1234gmail.com");
        keyword.inputText(input_phoneNumber, "");
        keyword.tapElement(input_phoneNumber);
        keyword.waitFor(1);
        keyword.inputText(input_phoneNumber, "085465433212");
        keyword.inputText(input_password, "");
        keyword.tapElement(input_password);
        keyword.waitFor(1);
        keyword.inputText(input_password, "password");
        keyword.inputText(input_confirmPassword, "");
        keyword.tapElement(input_confirmPassword);
        keyword.waitFor(1);
        keyword.inputText(input_confirmPassword, "password");
        keyword.tapElement(signUp_button);
    }

    public static void verifyOTPButtonExist(){
        keyword.validate_element_is_visible_and_enabled(verify_button);
    }

    public static void verifyErrorAlertRegisterExist(String expectedMessage){
        String actual = error_alert.getText();
        Assert.assertEquals(actual,expectedMessage );
    }
}
