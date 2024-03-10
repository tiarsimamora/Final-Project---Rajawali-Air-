package rajawaliair.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import rajawaliair.generateData;
import rajawaliair.keyword;

import java.time.Duration;

public class flightPageAdmin {

    protected WebDriver webDriver;

    public flightPageAdmin(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/nav/div/div/div/div[2]/a[4]")
    private static WebElement FlightMenu;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/button")
    private static WebElement AddFlightButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[1]/select")
    private WebElement source_airport;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[2]/select")
    private WebElement destination_airport;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[3]/select")
    private WebElement airplane_dropdown;

    @FindBy(id = "sourceTerminal")
    private WebElement txt_sourceterminal;

    @FindBy(id = "destinationTerminal")
    private WebElement txt_destinationterminal;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[3]/td[2]")
    private WebElement newFlightAdded;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[6]/div/button[1]")
    private WebElement editButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[11]/div/button[2]")
    private WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/div/dialog/div/div[2]/form/div/button[2]")
    private WebElement deleteButtonOnPopUp;

    @FindBy(id = "thumbnailUrl")
    private WebElement fileInput;
    @FindBy(id = "departureDate")
    private WebElement inputDepartureDate;

    @FindBy(id = "arrivalDate")
    private WebElement inputArrivalDate;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[8]/input")
    private WebElement EconomyPriceInput;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[9]/input")
    private WebElement BusinessPriceInput;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[10]/input")
    private WebElement FirstPriceInput;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[11]/input")
    private WebElement DiscInput;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[12]/input")
    private WebElement PointInput;


    //source
    public void tapFromDropdown(){
        WebElement elementOpen = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[1]/select"));
        elementOpen.click();
    }
    public void selectFromAirport(){
        WebElement elementOpen = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[1]/select/option[5]"));
        elementOpen.click();
    }
    //destination
    public void tapToDropdown(){
        WebElement elementOpen = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[2]/select"));
        elementOpen.click();
    }
    public void selectToAirport(){
        WebElement elementOpen = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[2]/select/option[3]"));
        elementOpen.click();
    }

    //airplane
    public void tapAirplaneDropdown(){
        WebElement elementOpen = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[3]/select"));
        elementOpen.click();
    }
    public void selectAirplane(){
        WebElement elementOpen = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[3]/select/option[2]"));
        elementOpen.click();
    }

    //submit
    public void submitFlight(){
        WebElement elementOpen = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/section/div/div[14]/button[2]"));
        elementOpen.click();
    }
    public void doAddFlight() {
        FlightMenu.click();
        AddFlightButton.click();
        tapFromDropdown();
        selectFromAirport();
        tapToDropdown();
        selectToAirport();
        tapAirplaneDropdown();
        selectAirplane();
        txt_sourceterminal.sendKeys("3A");
        txt_destinationterminal.sendKeys("3B");
        inputDepartureDate.sendKeys(generateData.getDateNow()+Keys.ARROW_RIGHT+"1230P");
        inputArrivalDate.sendKeys(generateData.getDateNow()+Keys.ARROW_RIGHT+"1330P");
        EconomyPriceInput.sendKeys("300000");
        BusinessPriceInput.sendKeys("500000");
        FirstPriceInput.sendKeys("1000000");
        DiscInput.sendKeys("0");
        fileInput.sendKeys("C:\\Users\\ASUS\\Downloads\\rajawaliair-icon\\rajawaliair.jpg");
        submitFlight();
    }

    public void verifyNewFlightsuccessfullyAdded() {
        String actual = newFlightAdded.getText();
        Assert.assertEquals(actual, "Soekarno Hatta International");
    }

//    public void doEditDataFlight() {
//        editButton.click();
//        keyword.waitFor(1);
//        txt_AirportName.clear();
//        keyword.waitFor(1);
//        txt_AirportName.sendKeys("Sukarni Kartodiwirjo Airport");
//        keyword.waitFor(1);
//        txt_Country.clear();
//        keyword.waitFor(1);
//        txt_Country.sendKeys("Indonesia");
//        keyword.waitFor(1);
//        txt_City.clear();
//        keyword.waitFor(1);
//        txt_City.sendKeys(generateData.getCity());
//        keyword.waitFor(1);
//        txt_cityCode.clear();
//        keyword.waitFor(1);
//        txt_cityCode.sendKeys(generateData.generateCityCode());
//        keyword.waitFor(1);
//        submitButton.click();
//        keyword.waitFor(1);
//    }
//
//    public void verifyNewFlightsuccessfullyEdit() {
//        String actual = newFlightAdded.getText();
//        Assert.assertEquals(actual, "Sukarni Kartodiwirjo Airport");
//    }

    public void doDeleteNewFligth() {
        FlightMenu.click();
        deleteButton.click();

        deleteButtonOnPopUp.click();
        keyword.waitFor(2);
    }

    public void verifyElementNotPresent() {

        String bodyText = newFlightAdded.getText();

        Assert.assertFalse(bodyText.contains("Halim Perdanakusuma International Airport"), "Spam Message Text Is Not Present");

    }



}
