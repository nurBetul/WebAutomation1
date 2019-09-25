import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
    WebDriver sadi;

    public WebDriver invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nurbe\\Downloads\\chromedriver_win32\\chromedriver.exe");
        sadi = new ChromeDriver();
        return sadi;
    }
}
