package Homework4;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.*;

public class TestExpandingTest {
    WebDriver driver = new ChromeDriver();

    //table[@id="table2"]//td[text()='jsmith@gmail.com']/../td//a[2]
    //table[@id='table2']//td[@class="last-name"]
    @Test
    public void testFindEmails() {
        driver.get("https://practice.expandtesting.com/tables");
        List<WebElement> emailList = driver.findElements(By.xpath("//table[@id='table2']//td[@class='last-name']"));
        for (WebElement email:emailList) {
            System.out.println(email.getText());
        }
        WebElement deleteEmail=driver.findElement(By.xpath(  "//table[@id=\"table2\"]//td[text()='jsmith@gmail.com']/../td//a[2]\n"));
        deleteEmail.click();

    }
}
