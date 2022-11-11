package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FloatingMenu extends BaseTest {
    @Test
    public void floatingMenu(){
        driver.get("https://the-internet.herokuapp.com/floating_menu");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Home']")).click();

        driver.findElement(By.xpath("//a[text()='News']")).click();

        driver.findElement(By.xpath("//a[text()='Contact']")).click();

        driver.findElement(By.xpath("//a[text()='About']")).click();
    }
}
