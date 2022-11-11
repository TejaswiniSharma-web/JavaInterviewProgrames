package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe extends BaseTest {
    @Test
    public void iframe(){
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Hello world");
      


    }
}
