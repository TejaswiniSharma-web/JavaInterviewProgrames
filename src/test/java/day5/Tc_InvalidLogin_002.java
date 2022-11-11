package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_InvalidLogin_002  extends BaseTest {
    @Test
    public void testinvalidCredentials() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tosmith");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuprSecretPassword");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button/i[@class='fa fa-2x fa-sign-in']")).click();
    }
}
