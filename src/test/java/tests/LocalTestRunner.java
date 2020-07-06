package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

public class LocalTestRunner {
    private String url = "https://app.03cbbecd7bce47f68cc8.uaenorth.aksapp.io";
    private WebDriver driver;

    protected WebDriver launch() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        return driver;
    }
    protected WebDriver getDriver() throws InterruptedException {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            launch();
            Thread.sleep(2000);
        }
        return driver;
    }
    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
    }
}
