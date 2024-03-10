package rajawaliair.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class homePageAdmin {

    protected WebDriver webDriver;

    public homePageAdmin(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/p")
    private WebElement detailReservationShow;


    public void doViewDetail() {
        WebElement elementOpen = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/div/div[1]/table/tbody/tr[1]/td[5]/div/button"));
        elementOpen.click();
    }

    public void verifyShowDetailSuccessfully() {
        String actual = detailReservationShow.getText();
        Assert.assertEquals(actual, "Ticket Details");
    }
}