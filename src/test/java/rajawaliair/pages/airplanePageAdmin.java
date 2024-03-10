package rajawaliair.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import rajawaliair.keyword;

import java.time.Duration;

public class airplanePageAdmin {

    protected WebDriver webDriver;

    public airplanePageAdmin(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }


    @FindBy(xpath = "/html/body/div[1]/div/div[1]/nav/div/div/div/div[2]/a[3]")
    private static WebElement AirplaneMenu;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/button")
    private WebElement AddAirplaneButton;

    @FindBy(id = "airplaneCode")
    private WebElement txt_airplaneCode;

    @FindBy(id = "economySeats")
    private WebElement txt_economySeats;

    @FindBy(id = "businessSeats")
    private WebElement txt_businessSeats;

    @FindBy(id = "firstSeats")
    private WebElement txt_firstSeats;

    @FindBy(id = "economySeatsPerCol")
    private WebElement txt_economySeatsPerCol;

    @FindBy(id = "businessSeatsPerCol")
    private WebElement txt_businessSeatsPerCol;

    @FindBy(id = "firstSeatsPerCol")
    private WebElement txt_firstSeatsPerCol;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/section/div[2]/button[2]")
    private WebElement createButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[2]")
    private WebElement newAirplaneAdded;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[6]/div/button[1]")
    private WebElement editButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[6]/div/button[2]")
    private WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/div/dialog/div/div[2]/form/div/button[2]")
    private WebElement deleteButtonOnPopUp;

    public void doAddAirplane() {
        AirplaneMenu.click();
        AddAirplaneButton.click();
        txt_airplaneCode.sendKeys("TES2");
        txt_economySeats.sendKeys("30");
        txt_businessSeats.sendKeys("15");
        txt_firstSeats.sendKeys("5");
        txt_economySeatsPerCol.sendKeys("4");
        txt_businessSeatsPerCol.sendKeys("4");
        txt_firstSeatsPerCol.sendKeys("4");
        createButton.click();
        keyword.waitFor(2);
    }

    public void verifyNewAirplaneAddedSuccessfully() {
        String actual = newAirplaneAdded.getText();
        Assert.assertEquals(actual, "TES2");
    }

    public void doEditAirplane() {
        AirplaneMenu.click();
        editButton.click();
        keyword.waitFor(1);
        txt_airplaneCode.clear();
        txt_airplaneCode.sendKeys("EDIT");
        keyword.waitFor(1);
        txt_economySeats.clear();
        txt_economySeats.sendKeys("30");
        keyword.waitFor(1);
        txt_businessSeats.clear();
        txt_businessSeats.sendKeys("20");
        keyword.waitFor(1);
        txt_firstSeats.clear();
        txt_firstSeats.sendKeys("10");
        keyword.waitFor(1);
        txt_economySeatsPerCol.clear();
        txt_economySeatsPerCol.sendKeys("6");
        keyword.waitFor(1);
        txt_businessSeatsPerCol.clear();
        txt_businessSeatsPerCol.sendKeys("6");
        keyword.waitFor(1);
        txt_firstSeatsPerCol.clear();
        txt_firstSeatsPerCol.sendKeys("6");
        keyword.waitFor(1);
        createButton.click();
        keyword.waitFor(2);
    }

    public void verifyNewAirplaneEditedSuccessfully() {
        String actual = newAirplaneAdded.getText();
        Assert.assertEquals(actual, "EDIT");
    }

    public void doDeleteNewAirplane() {
        AirplaneMenu.click();
        deleteButton.click();
        keyword.waitFor(1);
        deleteButtonOnPopUp.click();
        keyword.waitFor(2);
    }

    public void verifyElementNotPresent() {

        String bodyText = newAirplaneAdded.getText();

        Assert.assertFalse(bodyText.contains("Sukarni Kartodiwirjo Airport"), "Spam Message Text Is Not Present");

    }


}
