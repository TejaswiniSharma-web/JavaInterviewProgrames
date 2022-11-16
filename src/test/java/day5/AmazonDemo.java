package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import java.util.List;

public class AmazonDemo extends BaseTest {
    @Test
        public void openUr () throws InterruptedException {
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        List<WebElement>elements=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement element1:elements){
            System.out.println(element1.getText());

        }
    }
}