package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait extends BaseTest {
    @Test
    public void explicitWait() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebDriverWait wait =new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Remove']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enable']"))).click();
    }
}
////a[text()='LambdaTest.txt']