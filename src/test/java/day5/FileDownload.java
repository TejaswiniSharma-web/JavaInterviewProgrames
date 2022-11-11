package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileDownload extends BaseTest {
    @Test
    public void fileDownload(){
        driver.get("https://the-internet.herokuapp.com/download");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='LambdaTest.txt']")).click();
    }

}
