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

public class  homePage {

    protected WebDriver webDriver;

    public homePage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/button[1]")
    private static WebElement notif_icon;

//    @FindBy(xpath = "//*[@id='root']/div[1]/div/form/div[1]/div[2]/div[1]/div/label/div[2]/select']")
//    private static WebElement source_airport;
//    @FindBy(xpath = "/html/body/div/div[1]/div/form/div[1]/div[2]/div[1]/div/label/div[2]/select/option[2]")
//    private static WebElement halim_airport;


    @FindBy(xpath = "/html/body/div/div[1]/div/form/div[1]/div[2]/div[2]/label/div[2]")
    private static WebElement destination_airport;
    //
    @FindBy(xpath = "/html/body/div/div[1]/div/form/div[1]/div[2]/div[3]/label/input")
    private static WebElement departure_date;
    @FindBy(xpath = "/html/body/div/div[1]/div/form/div[1]/div[2]/div[5]/label/div[2]")
    private static WebElement passenger_class;
    //
    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div")
    private static WebElement passenger_popup;
    //
    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[1]/div/div[2]/input")
    private static WebElement adult_input;
    //
    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[1]/div/div[2]/button[2]")
    private static WebElement adult_add_button;
    //
    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[2]/div")
    private static WebElement economy_button;
    //
    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div/table/tbody/tr[5]/td[2]/button")
    private static WebElement buttonDone;
//

    @FindBy(xpath = "/html/body/div/div[1]/div/form/div[1]/div[2]/div[5]/label/div[2]/input")
    private static WebElement passengerDetail;

    @FindBy(xpath = "/html/body/div/div[1]/div/form/div[2]/button")
    private static WebElement search_button;

    @FindBy(xpath = "/html/body/div/div[1]/div/form/div[1]/div[2]/div[3]/label/input")
    private static WebElement inputDate;

    @FindBy(xpath = "/html/body/div/section/div[3]/button[1]")
    private static WebElement filterIcon;


    //
//
    public static void verifyNotifIconExist(){

        keyword.validate_element_is_visible_and_enabled(notif_icon);
    }

    public void doselectDestinationAirport() {
        Select destination = new Select(destination_airport);
        destination.selectByValue("I Gusti Ngurah Rai International Airport");
    }

    public void tapFromDropdown(){
        WebElement elementOpen = webDriver.findElement(By.name("sourceAirportId"));
        elementOpen.click();
    }

    public void selectAirport(){
        WebElement elementOpen = webDriver.findElement(By.xpath("/html/body/div/div[1]/div/form/div[1]/div[2]/div[1]/div/label/div[2]/select/option[9]"));
        elementOpen.click();
    }
    public void doSelectFromAirport(){
        tapFromDropdown();
        selectAirport();
    }


    public void tapToDropdown(){
        WebElement elementOpen = webDriver.findElement(By.name("destAirportId"));
        elementOpen.click();
    }
    public void selectToAirport(){
        WebElement elementOpen = webDriver.findElement(By.xpath("/html/body/div/div[1]/div/form/div[1]/div[2]/div[2]/label/div[2]/select/option[11]"));
        elementOpen.click();
    }
    public void doSelectToAirport(){
        tapToDropdown();
        selectToAirport();
    }


    public void doSelectDate() {
        inputDate.sendKeys(generateData.getDateNow());
    }

    public void tapPassenger() {
        passengerDetail.click();
    }

    public void SelectDetailPass() {
        adult_add_button.click();
        economy_button.click();

    }
    public void tapDoneButton() {
        buttonDone.click();
    }
    public void doSelectDetailPassenger(){
        tapPassenger();
        SelectDetailPass();
        tapDoneButton();
    }

    public void doFinishSearchTicket() {
        search_button.click();
    }

    public static void verifyIconFilterExist(){

        keyword.validate_element_is_visible_and_enabled(filterIcon);
        keyword.waitFor(2);
    }


}
