import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestSaucedemoLogin extends BeforeAfterMethods {
    static String url="https://www.saucedemo.com/";
    @Test(dataProvider = "usersList")
    public void loginTest(String username,String url) {
        driver.get(" https://www.saucedemo.com/");
        WebElement newElement = driver.findElement(By.name("user-name"));
        WebElement newElement1 = driver.findElement(By.name("password"));
        newElement.sendKeys(username);
        newElement1.sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        Assert.assertEquals(url, driver.getCurrentUrl());
        logoutTest();

    }

    @DataProvider
    public static Object[][] usersList() {
        return new Object[][]{
                {"standard_user",url+"inventory.html"},
                {"locked_out_user",url},
                {"problem_user",url+"inventory.html"},
                {"performance_glitch_user",url+"inventory.html"}
        };
    }
}
