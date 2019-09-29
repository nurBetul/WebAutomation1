import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        Browsers myBrowser = new Browsers();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        //set the timeout for explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("tab-flight-tab-hp"))));
        driver.findElement(By.id("tab-flight-tab-hp")).click();
        //click hotel button
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tab-hotel-tab-hp")));
        driver.findElement(By.id("tab-hotel-tab-hp")).click();
        //click bundle and save
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']"))));
        driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']")).click();
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("hotel-destination-hp-hotel"))));
        System.out.println("The input of hotel is invisible");





    }
}
