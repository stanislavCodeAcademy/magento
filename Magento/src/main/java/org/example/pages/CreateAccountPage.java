package org.example.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CreateAccountPage extends BasePage {


    @FindBy(css = "#firstname")
    private WebElement firstNameInput;

    @FindBy(css = "#lastname")
    private WebElement lastNameInput;

    @FindBy(css = "#email_address")
    private WebElement emailAddressInput;

    @FindBy(css = "#password")
    private WebElement passwordInput;

    @FindBy(css = "#password-confirmation")
    private WebElement passConfirmationInput;

    @FindBy(css = "#form-validate > div > div.primary > button")
    private WebElement createAccount;



    public CreateAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        enterText(firstNameInput, firstName);
    }
    public void enterLastName(String lastName) {
        enterText(lastNameInput, lastName);
    }

    public void enterEmail(String email) {
        enterText(emailAddressInput, email);
    }
    public void enterPassword(String pass) {
        enterText(passwordInput, pass);
    }

    public void enterPasswordConf(String pass) {
        enterText(passConfirmationInput, pass);
    }

    public void createAccount() {
        click(createAccount);
    }

}

