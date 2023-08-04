package Homework7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class PractiseExpandingTestingTest extends  BasePracitceExpanding{
    @Test
    public void CheckIfTheAmountIsCorrect() throws InterruptedException {
        driver.get(BASEURL);
WebElement parkingLot= driver.findElement(By.xpath("//div[@class='form-group']//select[@id='parkingLot']"));
Select selectParkingLOt=new Select(parkingLot);
selectParkingLOt.selectByVisibleText("Short-Term Parking");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
        WebElement entryDateElm=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"form-group\"]//input[@id=\"entryDate\"]")));
//WebElement dayElm=driver.findElement(By.xpath("//div[@style='top: 347.219px; left: " +
//        "152.5px; right: auto;']//div[@class='dayContainer']//span[@aria-label='August 8, 2023']"));
//        WebElement dayElement=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@style='top: 433.219px; left: 152.5px; right: auto;']//div[@class='dayContainer']//" +
//        "span[@aria-label='August 13, 2023']")));
        WebElement exitDateElm=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='form-group']//input[@placeholder='Exit Date']")));
        WebElement entryTime= driver.findElement(By.xpath("//input[@id='entryTime']"));
        WebElement exitTime= driver.findElement(By.xpath("//input[@id='exitTime']"));
        WebElement calculateButton=driver.findElement(By.xpath("//div[@id='actions']//button[@class='btn btn-primary mt-3']"));
WebElement entryDate= driver.findElement(By.xpath("//div[@class='form-group']/input[@placeholder='Entry Date']"));
entryDate.clear();
entryDate.sendKeys("2023-08-8");
exitDateElm.clear();
exitDateElm.sendKeys("2023-08-08");
entryTime.clear();
entryTime.sendKeys("10:00");
exitTime.clear();
exitTime.sendKeys("15:00");
//Actions entryDatee= new Actions(driver);
//Actions exitDate =new Actions(driver);
//entryDatee.moveToElement(entryDateElm).clickAndHold().click(dayElm).release().build().perform();
//exitDate.moveToElement(exitDateElm).clickAndHold().click(dayElement).release().build().perform();
calculateButton.click();
Thread.sleep(300);
WebElement cost=driver.findElement(By.xpath("//div[@id='result']//p/b[@id='resultValue']"));
String costOfParking=cost.getText();
Assert.assertEquals(takeAmountOfMoney(costOfParking),10);
    }


}
