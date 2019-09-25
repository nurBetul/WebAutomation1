import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathLocator {

    public static void main(String []args) throws InterruptedException {
        Browsers myBrowser = new Browsers();
        WebDriver naci = myBrowser.invokeChromeBrowser();
        naci.get("http://www.facebook.com");
        Thread.sleep(3000);
        naci.findElement(By.xpath("//input[@type='email']")).sendKeys("gmail.com");
        Thread.sleep(2000);
        naci.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcde");
        Thread.sleep(1000);
        naci.findElement(By.xpath("//input[contains(@name,'irst')]")).sendKeys("puldum oni");



    }

}
