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
    public void checkIfTheAmountIsCorrect() throws InterruptedException {
        driver.get(BASE_URL);
WebElement parkingLot= driver.findElement(By.xpath("//div[@class='form-group']//select[@id='parkingLot']"));
Select selectParkingLOt=new Select(parkingLot);
selectParkingLOt.selectByVisibleText("Short-Term Parking");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
        WebElement entryDateElm=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"form-group\"]//input[@id=\"entryDate\"]")));
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
calculateButton.click();
WebElement cost=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='result']//p/b[@id='resultValue']")));
String costOfParking=cost.getText();
Assert.assertEquals(takeAmountOfMoney(costOfParking),calculateCostOfParking(5));
    }


}
