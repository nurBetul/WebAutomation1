import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class InvokeOperaBrowser {
    WebDriver driver;

    public WebDriver invokeOperaBrowser(){
        System.setProperty("webdriver.oppera.driver","C:\\Users\\nurbe\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
        driver = new OperaDriver();
        return driver;
    }


}
