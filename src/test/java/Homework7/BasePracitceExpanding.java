package Homework7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePracitceExpanding   extends BaseTest.BaseTest {

     String BASEURL ="https://practice.expandtesting.com/webpark";

     public static int takeAmountOfMoney(String text) {
          String[] array = text.split(".00€");
          return Integer.parseInt(array[0]);
     }


}
