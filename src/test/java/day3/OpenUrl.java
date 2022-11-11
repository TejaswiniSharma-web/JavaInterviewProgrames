package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
// how to linked list
public class OpenUrl extends BaseTest {
    @Test
    public void openUrl() throws InterruptedException {
        driver.findElement(By.linkText("Platform")).click();
        Thread.sleep(2000);

    }
}
//