import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        Browsers myBrowser = new Browsers();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Butter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Cheese']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Milk']")).click();
        int count = driver.findElements(By.cssSelector("input[type='radio']")).size();
        System.out.println("the number of radio buttons are: " + count);
        for(int i=0; i<count; i++){
            driver.findElements(By.cssSelector("input[type='radio']")).get(i).click();
            Thread.sleep(2000);

        }



    }
}
