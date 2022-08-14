package Page;

import Base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By selectSizeLocator = By.xpath("//div[@class='option__texts']/span[text()='XS']");
    By addToCartButtonLocator = By.xpath("//div[@class='buttons d-none d-sm-block']/button[1]");
    By cartIconLocator = By.cssSelector("span[class='js-mini-basket-total-quantity mini-basket__quantity']");
    By goToCartLocator = By.cssSelector("a[class='btn pz-btn btn-block primary']");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        Assertions.assertTrue(isDisplayed(addToCartButtonLocator),"Not on the product detail page!");
        click(selectSizeLocator);
        wait(3);
        click(addToCartButtonLocator);
        wait(3);
    }

    public int cartCount() {
        String cartCount = find(cartIconLocator).getText();
        return Integer.parseInt(cartCount);
    }

    public boolean isCartCountIncreased() {
        return cartCount()==1;
    }

    public void goToCart() {
        Assertions.assertTrue(isCartCountIncreased(),"The cart count is not increased!");
        click(goToCartLocator);
    }
}
