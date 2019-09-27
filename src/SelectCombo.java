import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCombo {

    public static void main(String[] args) throws InterruptedException {
        Browsers myBrowser = new Browsers();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        Select s = new Select(driver.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")));
        Thread.sleep(1000);
        s.selectByValue("p");
        Thread.sleep(1000);
        s.selectByIndex(0);
        Thread.sleep(1000);
        s.selectByVisibleText("Business");
        Thread.sleep(1000);
    }

}
