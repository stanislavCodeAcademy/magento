package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    private static final String hotSellerProductsCssLocator = "li.product-item";
    private static final String createAccountCssLocator = "div.header a[href='https://magento.softwaretestingboard.com/customer/account/create/']";

    @FindBy(css = hotSellerProductsCssLocator)
    private List<WebElement> hotSellerProducts;

    @FindBy(css = createAccountCssLocator)
    private WebElement createAccountLink;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addItemToCart(Integer index) {
        waitForElementsToBeVisible(By.cssSelector(hotSellerProductsCssLocator));
        WebElement productToAdd = hotSellerProducts.get(index);
        click(productToAdd);

    }

    public Integer getNumberOfHotSellerProducts() {
        waitForElementsToBeVisible(By.cssSelector(hotSellerProductsCssLocator));
        return hotSellerProducts.size();
    }

    public void waitForNumberOfHotSellerProductsToBe(Integer expectedNumber) {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(hotSellerProductsCssLocator),expectedNumber ));
    }

    public void clickOnCreateAccountLink() {
        click(createAccountLink);

    }
}
