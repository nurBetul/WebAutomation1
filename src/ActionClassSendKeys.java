import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassSendKeys {
    public static void main(String[] args) {
        Browsers myBrowser = new Browsers();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.amazon.com");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        Actions myAction = new Actions(driver);
        myAction.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().perform();
        myAction.sendKeys("shoes").perform();
        myAction.moveToElement(driver.findElement(By.cssSelector("input[type='submit']"))).click().perform();
    }
}
