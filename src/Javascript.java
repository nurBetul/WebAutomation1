import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Javascript {
    public static void main(String[] args) throws InterruptedException {
        Browsers myBrowser = new Browsers();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector("input[type=button]")).click();
        String expectedValue = "Are you sure you want to give us the deed to your house?";
        if(expectedValue.equals(driver.switchTo().alert().getText())){
            driver.switchTo().alert().accept();
        }


    }
}
