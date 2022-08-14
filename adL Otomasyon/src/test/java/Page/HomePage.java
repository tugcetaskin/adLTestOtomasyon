package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By searchBoxLocator = By.cssSelector("input[class='input js-search-desktop']");
    By searchLocator = By.cssSelector("input[class='input js-search-input search__box-input h-100 pz-input__action']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct() {
        click(searchBoxLocator);
        type(searchLocator,"Elbise");
        find(searchLocator).sendKeys(Keys.ENTER);
    }
}
