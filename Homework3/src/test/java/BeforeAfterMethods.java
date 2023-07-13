import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static java.lang.Thread.sleep;

public class BeforeAfterMethods {
    protected WebDriver driver;

    @BeforeMethod
    public void beforeLaunchingBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void AfterOpeningBrowser() throws InterruptedException {
        sleep(4000);
        driver.close();

    }
}
