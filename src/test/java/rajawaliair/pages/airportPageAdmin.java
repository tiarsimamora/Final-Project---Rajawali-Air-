package rajawaliair.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import rajawaliair.generateData;
import rajawaliair.keyword;

import java.time.Duration;

public class airportPageAdmin {

    protected WebDriver webDriver;

    public airportPageAdmin(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }


    @FindBy(xpath = "/html/body/div[1]/div/div[1]/nav/div/div/div/div[2]/a[2]")
    private static WebElement AirportMenu;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/button")
    private static WebElement AddAirportButton;

    @FindBy(id = "name")
    private WebElement txt_AirportName;

    @FindBy(id = "country")
    private WebElement txt_Country;

    @FindBy(id = "city")
    private WebElement txt_City;

    @FindBy(id = "cityCode")
    private WebElement txt_cityCode;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/section/div/div[5]/button[2]")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[2]")
    private WebElement newAirportAdded;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[6]/div/button[1]")
    private WebElement editButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[6]/div/button[2]")
    private WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/div/dialog/div/div[2]/form/div/button[2]")
    private WebElement deleteButtonOnPopUp;



    public void doAddAirport() {
        AirportMenu.click();
        AddAirportButton.click();
        txt_AirportName.sendKeys("Tarumanegara Airport");
        txt_Country.sendKeys("Indonesia");
        txt_City.sendKeys(generateData.getCity());
        txt_cityCode.sendKeys(generateData.generateCityCode());
        submitButton.click();

    }

    public void verifyNewAirportsuccessfullyAdded() {
        String actual = newAirportAdded.getText();
        Assert.assertEquals(actual, "Tarumanegara Airport");
    }

    public void doEditDataAirport() {
        AirportMenu.click();
        editButton.click();
        keyword.waitFor(1);
        txt_AirportName.clear();
        keyword.waitFor(1);
        txt_AirportName.sendKeys("Sukarni Kartodiwirjo Airport");
        keyword.waitFor(1);
        txt_Country.clear();
        keyword.waitFor(1);
        txt_Country.sendKeys("Indonesia");
        keyword.waitFor(1);
        txt_City.clear();
        keyword.waitFor(1);
        txt_City.sendKeys(generateData.getCity());
        keyword.waitFor(1);
        txt_cityCode.clear();
        keyword.waitFor(1);
        txt_cityCode.sendKeys(generateData.generateCityCode());
        keyword.waitFor(1);
        submitButton.click();
        keyword.waitFor(1);
    }

    public void verifyNewAirportsuccessfullyEdit() {
        String actual = newAirportAdded.getText();
        Assert.assertEquals(actual, "Sukarni Kartodiwirjo Airport");
    }

    public void doDeleteNewAirport() {
        AirportMenu.click();
        deleteButton.click();
        keyword.waitFor(1);
        deleteButtonOnPopUp.click();
        keyword.waitFor(2);
    }

    public void verifyElementNotPresent() {

        String bodyText = newAirportAdded.getText();

        Assert.assertFalse(bodyText.contains("Sukarni Kartodiwirjo Airport"), "Spam Message Text Is Not Present");

    }



}
