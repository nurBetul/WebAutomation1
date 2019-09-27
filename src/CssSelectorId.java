import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CssSelectorId {
    public static void main(String[] args) throws InterruptedException {
        Browsers myBrowser = new Browsers();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        Thread.sleep(2000);
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#package-origin-hp-package")).sendKeys("Atlanta");
        Thread.sleep(1000);
        for(int i=0; i<4; i++){
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input#package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        }
        driver.findElement(By.cssSelector("input#package-origin-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#package-destination-hp-package")).sendKeys("Las Vegas");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#package-destination-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#package-destination-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#package-departing-hp-package")).sendKeys("28/09/2019");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#package-returning-hp-package")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#package-returning-hp-package")).sendKeys("30/09/2019");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#partialHotelBooking-hp-package")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("select#package-advanced-preferred-class-hp-package")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("select#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("select#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("select#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("select#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#search-button-hp-package")).click();





    }
}
