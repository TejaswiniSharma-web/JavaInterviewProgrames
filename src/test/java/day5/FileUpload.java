package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FileUpload  extends BaseTest{
    @Test
    public void uploadFile() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploadFile=driver.findElement(By.xpath("//form/input[@id='file-upload']"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("file-upload")).sendKeys("/Applications/JavaInterviewPrograms/Files/Refrence.pdf");
        Thread.sleep(2000);
        driver.findElement(By.id("file-submit")).click();
    }
}
