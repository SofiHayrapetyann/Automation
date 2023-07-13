import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestSaucedemoLogin extends BeforeAfterMethods {
    @Test(dataProvider = "usersList")
    public void login(String username) {
        driver.get(" https://www.saucedemo.com/");
        WebElement newElement = driver.findElement(By.name("user-name"));
        WebElement newElement1 = driver.findElement(By.name("password"));
        newElement.sendKeys(username);
        newElement1.sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

    }

    @DataProvider
    public static Object[][] usersList() {
        return new Object[][]{
                {"standard_user"},
                {"locked_out_user"},
                {"problem_user"},
                {"performance_glitch_user"}
        };
    }
}
