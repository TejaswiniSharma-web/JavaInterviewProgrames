package day5;
/*@Author:Tejaswini sharma
* */
import day3.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CheckAndUncheckBoxes extends BaseTest {
    @Test
    public void checkAndUncheck() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(2000);
      List<WebElement> elements= driver.findElements(By.xpath("//form/input"));

      System.out.println(elements.size());

        for (WebElement checkboxes:elements) {
            if(!checkboxes.isSelected()){
                checkboxes.click();
            }

        }

    }

}
