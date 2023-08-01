package Homework6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonTest extends BaseTestAmazon {

    String Url = "https://www.amazon.com/";

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver.get(Url);
        driver.manage().window().maximize();
        Thread.sleep(8000);
    }

    @Test
    public void checkAmountOfNmbrsWhileSearching() {
        WebElement allButton = driver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']//div[@class='nav-search-scope nav-sprite']"));
        allButton.click();
        WebElement bookButton=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(bookButton);
        select.selectByValue("search-alias=stripbooks-intl-ship");
        WebElement searchElm = driver.findElement(By.xpath("//div//input[@id='twotabsearchtextbox']"));
        searchElm.sendKeys("Mark Twain");
        WebElement searchButton = driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//input[@id]"));
        searchButton.click();
        List<WebElement> amountOfBooks1 = driver.findElements(By.xpath("//div[@class='sg-col-inner']//div[contains(@class,'mall a-spacing-top-small' )]//h2"));
        WebElement resultOfBooks = driver.findElement(By.xpath("//div//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]"));
        result = resultOfBooks.getText();
        Assert.assertEquals(calculateAmountOfItems(amountOfBooks1), takeAmountFromXpath(result));
    }
}
