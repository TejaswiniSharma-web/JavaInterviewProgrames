package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class MouseHover extends BaseTest {
    @Test
    public void mouseHover(){
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions actions=new Actions(driver);
        WebElement imageMouseHover=driver.findElement(By.xpath("(//div[@class='figure'])[2]"));
        actions.moveToElement(imageMouseHover).perform();
    }
}
