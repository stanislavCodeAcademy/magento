package createAccountTests;

import org.example.pages.CreateAccountPage;
import org.example.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import productsTests.BaseTest;

public class CreateAccountTests extends BaseTest {

    @Test
    public void createAccountSuccefully() {

        HomePage homePage = new HomePage(driver);
        homePage.clickOnCreateAccountLink();

        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.enterFirstName("Stan");
        createAccountPage.enterLastName("THe man");
        createAccountPage.enterEmail("stanTheMan@gmail.com");
        createAccountPage.enterPassword("Stan!567");
        createAccountPage.enterPasswordConf("Stan!567");
        createAccountPage.createAccount();
    }
}
