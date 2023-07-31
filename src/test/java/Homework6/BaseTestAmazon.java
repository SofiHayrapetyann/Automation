package Homework6;

import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class BaseTestAmazon extends BaseTest.BaseTest {
    protected String result;

    public static int calculateAmountOfItems(List<WebElement> list) {
        int i = 0;
        for (WebElement element : list) {
            i++;
        }
        return i;
    }

    public static int takeAmountFromXpath(String text) {
        String[] array = text.split(" ");
        String[] array2 = array[0].split("-");
        return Integer.parseInt(array2[1]);
    }
}


