package day5;

import day3.BaseTest;
import org.testng.annotations.Test;

public class RefreshPage extends BaseTest {
    @Test
    public void refreshPage() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
    }
}
