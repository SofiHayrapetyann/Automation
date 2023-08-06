package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import static java.lang.Thread.sleep;

public class BaseTest{
    public WebDriver driver;

    @BeforeSuite
    public void setup() {
//        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    public void configuringBeforeRun(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }
   @BeforeMethod
   public void maximize(){
        driver.manage().window().maximize();
    }

    @AfterClass
    public void afterTestEnds() throws InterruptedException {
        sleep(3000);
        driver.close();
    }

    @AfterSuite
    public void TheEnd(){
        driver.quit();
    }
}