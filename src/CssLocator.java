import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssLocator {
    public static void main(String[] args) throws InterruptedException {

        Browsers myBrowser = new Browsers();
        WebDriver sadi = myBrowser.invokeChromeBrowser();
        sadi.get("http://www.amazon.com");
        Thread.sleep(2000);
        sadi.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("cups");


    }


}
