package Page;

import Base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPage extends BasePage {

    By productListLocator = By.cssSelector("div[class='swiper-slide list-slider-item__slide swiper-slide-active']");
    By filterLocator = By.cssSelector("select[class='js-collapse-filters filter-item__select']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> findAllProduct() {
        return findAll(productListLocator);
    }

    public int selectRandomProduct() {
        Random random = new Random();
        int i = random.nextInt(48);
        return i;
    }

    public void selectProduct() {
        Assertions.assertTrue(isDisplayed(filterLocator),"Not on the product page!");
        findAllProduct().get(selectRandomProduct()).click();
    }
}
