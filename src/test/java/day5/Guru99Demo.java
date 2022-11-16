package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Guru99Demo extends BaseTest {
    @Test
    public void openUrl() throws InterruptedException {
        driver.get("http://demo.guru99.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("sharmatejaswini1991@gmail.com");
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
    }
}
