import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsCapitalLetters {
    public static void main(String[] args) {
        Browsers sadi = new Browsers();
        WebDriver naci = sadi.invokeChromeBrowser();
        naci.get("http://www.facebook.com");
        naci.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions myActions = new Actions(naci);
        WebElement myElement = naci.findElement(By.cssSelector("input#email"));
        Action act = myActions.moveToElement(myElement).click().keyDown(myElement, Keys.SHIFT).sendKeys("nur betul").keyUp(myElement, Keys.SHIFT).build();
        act.perform();
    }
}
