import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

    public static WebDriver nur;
    public static void main(String args[]){
        invokeChromeBrowser();
        nur.get("http://www.facebook.com");
        nur.findElement(By.name("firstname")).sendKeys("Nur");
        nur.findElement(By.name("lastname")).sendKeys("Yaz");

    }

    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nurbe\\Downloads\\chromedriver_win32\\chromedriver.exe");
        nur = new ChromeDriver();


    }
}
