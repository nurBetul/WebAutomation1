import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvokeOperaBrowser {

    public static void main(String args[]){
        String path = "Users\\nurbe\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe";
        OperaOptions options = new OperaOptions();
        options.setBinary("C:\\Users\\nurbe\\AppData\\Local\\Programs\\Opera\\63.0.3368.94\\opera.exe");
        System.setProperty("webdriver.opera.driver",path);
        WebDriver driver = new OperaDriver(options);
        driver.get("http://www.google.com");
    }
}
