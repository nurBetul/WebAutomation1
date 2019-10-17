import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RelativeAbsoluteXpath {
    public static void main(String[] args) throws InterruptedException {
        Browsers myBrowser = new Browsers();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//form[@id='gcw-packages-form-hp-package']/section/div/div/div/div/label/input")).sendKeys("Atlanta");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='hero-banner']/div/div/section/div/div[2]/div[2]/section[3]/form/section/div/div[2]/div/div/label/input")).sendKeys("Las Vegas");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='datepicker-close']/child::button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).sendKeys("20/10/2019");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='package-returning-hp-package']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='datepicker-close']/child::button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='package-returning-hp-package']")).sendKeys("24/10/2019");





    }
}
