package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortDropdown  {
    protected WebDriver driver;

    @BeforeClass
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void openDropDownr(){

        driver.get("https://www.wikipedia.org/");

      List<WebElement> languages=driver.findElements(By.xpath("//select[@name='language']/option"));
        for (WebElement ele:languages) {
            System.out.println(ele.getText());
            ArrayList<String> al= new    ArrayList<>();
            Collections.sort(al);

        }
    }

}
