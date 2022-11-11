package day5;

import day3.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tc_Lg_001 extends BaseTest {
    @Test
    public void openUrl() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        Thread.sleep(2000);
        String actalText=driver.findElement(By.xpath("//label[text()='Username']")).getText();
        String expectedText="Username";
        Assert.assertEquals(actalText,expectedText);
        System.out.println("Actual tetxt"+actalText);
        System.out.println("Excpected Text"+expectedText);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        Thread.sleep(2000);
        String actalPassword =driver.findElement(By.xpath("//label[text()='Password']")).getText();
        String expcectedPassword="Password";
        Assert.assertEquals(actalPassword,expcectedPassword);
        System.out.println("Actual password:"+actalPassword);
        System.out.println("Expected password"+expcectedPassword);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button/i[@class='fa fa-2x fa-sign-in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a/i[text()=' Logout']")).click();
    }
}
