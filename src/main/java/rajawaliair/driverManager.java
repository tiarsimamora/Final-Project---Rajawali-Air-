package rajawaliair;

import org.openqa.selenium.WebDriver;

public class driverManager {

    private static final driverManager instance = new driverManager();
    ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private driverManager() {
    }

    public static driverManager getInstance() {
        return instance;
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void setDriver(WebDriver webDriver) {
        driver.set(webDriver);
    }
}
