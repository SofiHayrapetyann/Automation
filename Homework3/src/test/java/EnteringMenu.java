import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class EnteringMenu extends BeforeAfterMethods {
    @Test
    public void enteringMenu() {
        driver.get("https://menu.am/?filters=free-delivery");
        driver.findElement(By.className("badge")).click();
    }

}

