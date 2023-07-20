import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import static java.lang.Thread.sleep;

public class BeforeAfterMethods {
    protected WebDriver driver;
    @BeforeClass
    public void beforeLaunchingBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }
    @AfterClass
    public void AfterOpeningBrowser() throws InterruptedException {
        sleep(4000);
        driver.close();

    }
}
