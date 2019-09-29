import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        Browsers myBrowser = new Browsers();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(1000);
        driver.findElement(By.id("package-departing-hp-package")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.datepicker-paging.datepicker-next.btn-paging.btn-secondary.next")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[data-year='2019'][data-month='10'][data-day='29']")).click();
    }
}
