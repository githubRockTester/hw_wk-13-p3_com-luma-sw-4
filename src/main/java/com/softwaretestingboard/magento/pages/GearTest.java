package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utilities;
import org.openqa.selenium.By;

public class GearTest extends Utilities {
    By gearMenu = By.id("ui-id-6");

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    By bagsMenu = By.id("ui-id-25");

    public void mouseHoverOnBagsMenu() {
        mouseHoverToElementAndClick(bagsMenu);
    }

    By clickOnProduct = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void clickOnProduct() {
        mouseHoverToElementAndClick(clickOnProduct);
    }

    By verifyProductName = By.xpath("//span[@class='base']");

    public String verifyProductName() {
        return getTextFromElement(verifyProductName);
    }

    By changeQuantity = By.xpath("//input[@value='1']");

    public void changeQuantityTo3() {
        clearAndSendTextToElement(changeQuantity, "3 ");
    }

    By addToCart = By.xpath("//span[normalize-space()='Add to Cart']");

    public void clickOnAddToCart() {
        mouseHoverToElementAndClick(addToCart);
    }

    By verifyText = By.xpath("//div[@class='message-success success message']");

    public String verifyTextInHeader() {
        return getTextFromElement(verifyText);
    }

    By clickOnShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnShopingCart() {
        mouseHoverToElementAndClick(clickOnShoppingCart);
    }

    By reVerifyProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    public String reVerifyProductName() {
        return getTextFromElement(reVerifyProductName);
    }

    By verifyQuantity = By.xpath("(//input[@class='input-text qty'])[1]");

    public String verifyProductQauantity() {
        String quantity = driver.findElement(verifyQuantity).getAttribute("value");
        return quantity;
    }

    By verifyPrice = By.xpath("//td[@class='col subtotal']//span[@class='cart-price']");

    public String verifyProductPrice() {
        return getTextFromElement(verifyPrice);
    }

    By changeQuantityTo5 = By.xpath("//input[@value='3']");

    public void changeQuantityTo5() {
        clearAndSendTextToElement(changeQuantityTo5, "5");
    }

    By updateShoppingCart = By.xpath("//button[@title='Update Shopping Cart']");

    public void clickOnUpdate() {
        mouseHoverToElementAndClick(updateShoppingCart);
    }

    By reVerifyPrice = By.xpath("//td[@class='col subtotal']//span[@class='cart-price']");

    public String verifyUpdatedPrice() {
        return getTextFromElement(reVerifyPrice);
    }
}
