import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;


public class LaunchChrome {
    WebDriver driver;
    @BeforeClass
    public void beforeLaunchingBrowser(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        driver=new ChromeDriver();
    }


    @Test
    public void launchChrome() {
        driver.get("chrome://version");
    }
    @AfterClass
    public void afterLaunchingChrome() throws InterruptedException {
        sleep(4000);
        driver.close();

    }
}
