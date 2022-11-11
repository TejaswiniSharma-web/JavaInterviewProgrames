package day5;

import day3.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown extends BaseTest {
   @Test
    public void dropDown() throws InterruptedException {
       driver.get("https://the-internet.herokuapp.com/dropdown");
       Thread.sleep(2000);
       Select dropDownMenu=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
       Thread.sleep(2000);
       dropDownMenu.selectByVisibleText("Option 2");
       List<WebElement> elements=driver.findElements(By.xpath("//select/option"));
       for (WebElement dropDownElement:elements){
           System.out.println(dropDownElement.getText());
       }
   }
}
