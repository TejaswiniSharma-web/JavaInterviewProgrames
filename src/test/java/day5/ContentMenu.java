package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContentMenu extends BaseTest {
    @Test
    public void ContentMenu() throws InterruptedException {
        driver.get(" https://the-internet.herokuapp.com/context_menu");
        Thread.sleep(2000);
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//div[@id='hot-spot']"))).contextClick().build().perform();
    }
}
