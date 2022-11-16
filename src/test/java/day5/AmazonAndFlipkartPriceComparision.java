package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonAndFlipkartPriceComparision  extends BaseTest {
    @Test
    public void priceComparision() throws InterruptedException {
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        Thread.sleep(2000);
        WebElement element= driver.findElement(By.xpath("(//span[text()='54,990'])[1]"));
        System.out.println(element.getText());
        Thread.sleep(2000);
        driver.get("https://www.flipkart.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone", Keys.ENTER);
        Thread.sleep(2000);
        WebElement ele= driver.findElement(By.xpath("(//div[text()='₹40,999'])[1]"));
        Thread.sleep(2000);
        
            String amazonPrice = element.getText().replace("", "₹");

            String flipkartPrice = ele.getText().replace("", "₹");


        System.out.println(element);
        System.out.println(ele);

        int amazonFinalPrice =Integer.parseInt(amazonPrice);
        int flipkartFinalPrice=Integer.parseInt(flipkartPrice);
        if (amazonFinalPrice>=flipkartFinalPrice){
            System.out.println("Print amazon price is cheaper"+amazonFinalPrice);
        }else{
            System.out.println("Flipkart Price is cheaper"+flipkartFinalPrice);
        }
    }

    }

//span[text()='₹54,990']