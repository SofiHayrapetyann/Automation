package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;


public class DemogaTest extends  BaseDemoga{
    @Test
    public void checkTextIsChanged(){
        driver.get(BASEURL);
        WebElement dragMeElm=driver.findElement(By.xpath("//div/div[@id='draggable']"));
        WebElement beforeDrop=driver.findElement(By.xpath("//div/div[@id='droppable']/p"));
        String beforeDropText=beforeDrop.getText();
        WebElement dropElm=driver.findElement(By.xpath("//div//div[@id='droppable']"));
        Actions dragMe=new Actions(driver);
        dragMe.dragAndDrop(dragMeElm,dropElm).build().perform();
        WebElement afterDrop=driver.findElement(By.xpath("//div/div[@id='droppable']/p"));
       String afterDropText=afterDrop.getText();
        Assert.assertNotEquals(afterDropText,beforeDropText);

    }
}
