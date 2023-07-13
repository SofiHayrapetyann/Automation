import org.testng.annotations.Test;


public class EnterGoogleAmazon extends BeforeAfterMethods {

    @Test
    public void enteringAmazon() {
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void enteringGoogle() {
        driver.get("https://www.google.com/?hl=RU");
    }
}


