import org.testng.annotations.Test;


public class EnteringFacebookApple extends BeforeAfterMethods {
    @Test
    public void enteringApple() {
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void enteringFacebook() {
        driver.get("https://www.facebook.com/");
    }


}
