import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class IFrameDragDrop {
    public static void main(String[] args) {
        Browsers myBrowser = new Browsers();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        Actions myActions = new Actions(driver);
        WebElement source = driver.findElement((By.id("draggable")));
        WebElement target = driver.findElement(By.id("droppable"));
        myActions.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();
    }
}
