import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;


public class EnterGoogleAmazon extends BeforeAfterMethods {
    void setUp() {
        WebDriverManager.chromedriver().setup();
    }
    @Test
    public void enteringAmazon() throws InterruptedException {
        driver.get("https://www.amazon.com/");
    }


    @Test
    public void enteringGoogle() throws InterruptedException {
        driver.get("https://www.google.com/?hl=RU");

    }
}


