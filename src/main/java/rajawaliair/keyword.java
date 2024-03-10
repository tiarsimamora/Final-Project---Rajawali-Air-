package rajawaliair;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class keyword {

    public static void navigateToUrl(String url) {
        driverManager.getInstance().getDriver().get(url);
    }

    public static void tapElement(WebElement webElement) {
        wait_element_to_be_displayed(webElement);
        webElement.click();
    }

    public static void inputText(WebElement webElement, String value) {
        wait_element_to_be_displayed(webElement);
        webElement.sendKeys(value);
    }
    public static void clearText(WebElement webElement) {
        wait_element_to_be_displayed(webElement);
        webElement.clear();
    }
    public static void uploadFile(WebElement fileInput, String filePath) {
        wait_element_to_be_displayed(fileInput);
        fileInput.sendKeys(filePath);
    }

    public static void validate_element_is_visible_and_enabled(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driverManager.getInstance().getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(webElement));

        if (!webElement.isDisplayed() || !webElement.isEnabled()) {
            System.out.println("element not visible or enabled");
            throw new ElementNotInteractableException(webElement.toString());
        }
    }

    public static void wait_element_to_be_displayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driverManager.getInstance().getDriver(), Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void assert_current_url(String expectedUrl) {
        String actualUrl = driverManager.getInstance().getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public static void selectOption(WebElement webElement, String value) {
        wait_element_to_be_displayed(webElement);
        Select dropdown = new Select(webElement);
        dropdown.selectByValue(value);
    }

    public static void take_screenshot(String fileName) {
        try {
            TakesScreenshot screenshot = ((TakesScreenshot) driverManager.getInstance().getDriver());
            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File("reports/screenshots" + File.separator + fileName + "." + fileType.PNG.name());

            FileUtils.copyFile(sourceFile, destinationFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitFor(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
