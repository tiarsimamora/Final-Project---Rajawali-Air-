package rajawaliair.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import rajawaliair.generateData;
import rajawaliair.keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class orderPage {
    protected WebDriver webDriver;
    public orderPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "/html/body/div/section/div[2]/div[2]/div/div[1]/button")
    private static WebElement choose_ticket;

    @FindBy(xpath = "/html/body/div/section/div[2]/div/div/div[4]/div[1]/div[4]/div[2]/button")
    private static WebElement selectButton;

    @FindBy(xpath = "/html/body/div[1]/section/div[2]/div/div[2]/div/div/div[1]/input[2]")
    private static WebElement genderType;

    @FindBy(name = "fullName")
    private static WebElement fullName;
    @FindBy(name = "email")
    private static WebElement email;
    @FindBy(name = "phoneNumber")
    private static WebElement phoneNumber;

    @FindBy(xpath = "/html/body/div[1]/section/div[2]/div/div[3]/div/div[1]/div/div/div[1]/input")
    private static WebElement checkBox;


    @FindBy(xpath = "/html/body/div[1]/section/div[2]/div/button")
    private static WebElement nextButton;

    @FindBy(xpath = "/html/body/div/section/div[2]/div/div[1]/div/div/button/div")
    private static WebElement addBaggageButton;

    @FindBy(xpath = "/html/body/div/section/div[2]/div/div/div/div/button[1]")
    private static WebElement zeroBaggageButton;

    @FindBy(xpath = "/html/body/div/section/div[3]/button")
    private static WebElement saveButton;

    @FindBy(xpath = "/html/body/div/section/div[2]/div/div[3]/div/div/button/div")
    private static WebElement addMealsButton;

    @FindBy(id = "8cf9fba4-1cb6-468a-adec-40f18e2b52a2")
    private static WebElement FirstMeaslButton;

    @FindBy(xpath = "/html/body/div/section/div[3]/div/div[2]/button")
    private static WebElement saveMealsButton;
    @FindBy(xpath = "/html/body/div/section/div[2]/div/div[4]/div[1]/div/div[2]/div[2]/span/input")
    private static WebElement insuranceButton;

    @FindBy(xpath = "/html/body/div/section/div[3]/div/div/button")
    private static WebElement paymentButton;

    @FindBy(xpath = "/html/body/div/section/div[2]/div/div[2]/div[2]/div[1]/div/span/input")
    private static WebElement choosePayment;


    @FindBy(xpath = "/html/body/div/section/div[2]/div/div[2]/button")
    private static WebElement Payment;

    @FindBy(xpath = "//*[@id=\"root\"]/section/div[2]/div/div[2]/button")
    private static WebElement IconCompleteOrder;

    @FindBy(xpath = "/html/body/div/section/div[2]/div/div[1]/div/div/div/div[1]/div[1]")
    private static WebElement baggaeicon;
//    /html/body/div/section/div[2]/div/div[1]/div/div/div/div[1]/div[1]

    //

    public void doOrder(){

        choose_ticket.click();
        selectButton.click();
        genderType.click();
        keyword.inputText(fullName, "Tester");
        keyword.inputText(phoneNumber, "081243456789");
        keyword.inputText(email, "Tester@gmail.com");
        checkBox.click();
        nextButton.click();
        keyword.waitFor(1);
    }


    public void doAddOnsOrder(){

        addBaggageButton.click();
        keyword.waitFor(1);
        zeroBaggageButton.click();
        keyword.waitFor(1);
        saveButton.click();
        addMealsButton.click();
        keyword.waitFor(1);
        FirstMeaslButton.click();
        keyword.waitFor(1);
        saveMealsButton.click();
        keyword.waitFor(1);
        Payment.click();
    }


    public static void verifyIconCompleteOrder(){

        keyword.validate_element_is_visible_and_enabled(IconCompleteOrder);
        keyword.waitFor(2);
    }


}
