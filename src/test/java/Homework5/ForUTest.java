package Homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class ForUTest {
    private String actualName;
    private String actualPrice;
    private String expectedTitle;
    private String expectedPrice;
    private String totalPrice1;
    private String expectedName1;
    private String expectedPrice1;
    WebDriver driver = new ChromeDriver();
    String Url;

    @BeforeMethod
    public void setUp() {
        Url = "https://4u.am/en/";
    }

    @Test
    public void testAddToBasket() throws InterruptedException {
        driver.get(Url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement realName = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='swiper-slide']//div/p//a[@href='/hy/product/zartucic-kupong']")));
        WebElement realPrice = driver.findElement(By.xpath("//div[@id='offer1']//div[@class='swiper-slide'][1]//div[contains(@class, 'price_basket')]" +
                "/p/span/span"));
        WebElement basketElement = driver.findElement(By.xpath("//div[@id='offer1']//div[@class='swiper-slide'][1]//div[@class='item_basket']"));
        basketElement.click();
        WebElement toBasketElm = driver.findElement(By.xpath("//div[@id='basketIcon']"));
        toBasketElm.click();
        WebElement expectedName = driver.findElement(By.xpath("//div[@class='spinner_flex']//a//h4"));
        WebElement expectedPrice = driver.findElement(By.xpath("//p/span[@id='pricedfb6164402e24b9f0f795b242d26916d']"));
        WebElement totalPrice = driver.findElement(By.xpath("//span[@id = 'cartTotalPrice']"));
        actualName = realName.getText();
        actualPrice = realPrice.getText();
        expectedName1 = expectedName.getText();
        expectedPrice1 = expectedPrice.getText();
        totalPrice1 = totalPrice.getText();
    }

    @Test(dataProvider = "real_ExpectedData")
    public void checkOutComparisons(String actual, String expected) {
        Assert.assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] real_ExpectedData() {
        return new Object[][]{
                {actualName, expectedName1},
                {actualPrice, expectedPrice1},
                {expectedPrice, totalPrice1}
        };
    }
}
