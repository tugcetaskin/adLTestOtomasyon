package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {
        waitFiveSec(locator);
        return driver.findElement(locator);
    }

    public void click(By locator) {
        find(locator).click();
    }

    public void type(By locator , String text) {
        find(locator).sendKeys(text);
    }

    public boolean isDisplayed(By locator) {
        waitFiveSec(locator);
        return find(locator).isDisplayed();
    }

    public List<WebElement> findAll(By locator) {
        waitFiveSec(locator);
        return driver.findElements(locator);
    }

    public void waitFiveSec(By locator) {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void wait (int seconds) {
        try {
            Thread.sleep(seconds*1000);

        }catch (Exception e){

        }
    }
}
