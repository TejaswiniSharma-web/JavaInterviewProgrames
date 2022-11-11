package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTest {
    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement DebitAmount =driver.findElement(By.xpath(" (//li[@id='fourth'])[1]"));
        Thread.sleep(2000);
        WebElement CreditAmount= driver.findElement(By.xpath("//ol[@id='amt7']"));
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        act.dragAndDrop(DebitAmount,CreditAmount).build().perform();
        Thread.sleep(2000);
        WebElement debitSide=driver.findElement(By.xpath("//li[@id='credit2']"));
        Thread.sleep(2000);
        WebElement creditSide=driver.findElement(By.xpath("//ol[@id='bank']"));
        Thread.sleep(2000);
        act.dragAndDrop(debitSide,creditSide).build().perform();
        Thread.sleep(2000);
        WebElement creditSideAccount=driver.findElement(By.xpath("//li[@id='credit1']"));
        Thread.sleep(2000);
        WebElement debitSideAccount=driver.findElement(By.xpath("//ol[@id='loan']"));
        Thread.sleep(2000);
        act.dragAndDrop(creditSideAccount,debitSideAccount).build().perform();
        Thread.sleep(2000);
        WebElement debitSideAmount=driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
        Thread.sleep(2000);
        WebElement creditSide2Amount=driver.findElement(By.xpath("//ol[@id='amt8']"));
        Thread.sleep(2000);
        act.dragAndDrop(debitSideAmount,creditSide2Amount).build().perform();
        /*WebElement from =driver.findElement(By.xpath("//div/header[text()='A']"));
        Thread.sleep(2000);
        WebElement to =driver.findElement(By.xpath("//div/header[text()='B']"));
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        Thread.sleep(2000);
        act.dragAndDrop(from,to).build().perform();*/
    }
}
