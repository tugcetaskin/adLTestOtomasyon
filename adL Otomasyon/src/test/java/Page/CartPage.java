package Page;

import Base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    By deleteProductLocator = By.cssSelector("a[class='js-basket-item-remove-button show-icon pz-button__action']");
    By deleteLocator = By.cssSelector(".js-basket-item-delete");
    By confirmCartLocator = By.cssSelector("span[class='d-flex align-items-center py-1 justify-content-center']");
    By isTheCartEmpty = By.cssSelector("div[class='empty-basket js-empty-basket']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void deleteTheProduct() {
        Assertions.assertTrue(isDisplayed(confirmCartLocator),"Not on the cart page!");
        click(deleteProductLocator);
        click(deleteLocator);
        Assertions.assertTrue(isDisplayed(isTheCartEmpty),"The cart is not empty!");
    }
}
