package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

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