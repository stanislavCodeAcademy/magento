package productsTests;

import org.example.pages.HomePage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HomePageProductsTests extends BaseTest {



    @Test
    public void addProductToCartTest() {

        HomePage homePage = new HomePage(driver);
//        homePage.waitForNumberOfHotSellerProductsToBe(6);
        Assertions.assertEquals(6, homePage.getNumberOfHotSellerProducts());
        homePage.addItemToCart(0);
    }

}
