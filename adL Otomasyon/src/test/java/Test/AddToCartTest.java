package Test;

import Base.BaseTest;
import Page.CartPage;
import Page.HomePage;
import Page.ProductDetailPage;
import Page.ProductPage;
import org.junit.jupiter.api.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void startTest() {

        HomePage homePage = new HomePage(driver);
        homePage.searchProduct();

        ProductPage productPage = new ProductPage(driver);
        productPage.selectProduct();

        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addToCart();
        productDetailPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.deleteTheProduct();
    }
}
