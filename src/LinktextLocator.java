import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextLocator {
    public static WebDriver driver;

    public static void main(String[] args) {
        String expectedValue = "Sizin İçin Buradayız!";

    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nurbe\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public boolean isResultTrue(String expectedValue){

        String resultValue = driver.findElement(By.xpath("//*[@id=\"sf-recase-query\"]/h2")).getText();
        return resultValue.equals(expectedValue);
    }
}
