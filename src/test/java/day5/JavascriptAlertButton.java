package day5;

import day3.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavascriptAlertButton extends BaseTest {
    @Test
    public void javascriptAlert(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert simpleAlert= driver.switchTo().alert();
        simpleAlert.accept();
    }

}
