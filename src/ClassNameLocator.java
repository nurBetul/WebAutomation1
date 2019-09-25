import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
    static WebDriver sadi;

    public static void main(String[] args) throws InterruptedException {
        invokeChromeBrowser();
        sadi.get("http://www.thy.com/");
        Thread.sleep(3000);
        sadi.findElement(By.className("thyHeaderLink")).click();


    }

    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nurbe\\Downloads\\chromedriver_win32\\chromedriver.exe");
        sadi = new ChromeDriver();
    }
}
