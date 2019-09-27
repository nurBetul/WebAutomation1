import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonWholeFoodsTC {
    public static void main(String[] args) {
        Browsers myBrowser = new Browsers();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.amazon.com");
        driver.findElement(By.xpath("//a[contains(text(), 'Whole Foods')))]])")).click();

    }
}
