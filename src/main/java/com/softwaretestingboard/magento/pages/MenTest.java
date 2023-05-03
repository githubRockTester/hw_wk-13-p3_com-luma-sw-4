package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utilities;
import org.openqa.selenium.By;

public class MenTest extends Utilities {
    By menMenu = By.id("ui-id-5");
    By bottomsMenu = By.id("ui-id-18");
    By pantsMenu = By.id("ui-id-23");
    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By pentsSize = By.id("option-label-size-143-item-175");
    By pentsColour = By.id("option-label-color-93-item-49");
    By addToCart = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]");
    By headerText = By.xpath("//div[@class='message-success success message']");
    By shopingCart = By.xpath("//a[@class='action showcart']");
    By verifyTextShopingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By verifyName = By.xpath("//strong[@class='product-item-name']");
    By verifySize = By.xpath("//span[normalize-space()='32']");
    By verifyColour = By.xpath("(//span[normalize-space()='Black'])[1]");
    By showDetails = By.xpath("//span[contains(text(),'See Details')]");

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottomsMenu() {
        mouseHoverToElement(bottomsMenu);
    }

    public void clickOnPants() {
        mouseHoverToElementAndClick(pantsMenu);
    }

    public void mouseHoverOnProduct() {
        mouseHoverToElementAndClick(cronusYogaPant);
    }

    public void mouseHoverOnSize() {
        mouseHoverToElementAndClick(pentsSize);
    }

    public void mouseHoverOnColour() {
        mouseHoverToElementAndClick(pentsColour);
    }

    public void clickOnAddToCart() {
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifyTextInHeader() {
        return getTextFromElement(headerText);
    }

    public void clickOnshopingCart() {
        mouseHoverToElementAndClick(shopingCart);
    }

    public String verifyTextShopingCart() {
        return getTextFromElement(verifyTextShopingCart);
    }

    public String verifyProductName() {
        return getTextFromElement(verifyName);
    }
    public void clickOnShowDetails(){
        clickOnElement(showDetails);
    }

    public String verifyProductSize() {
        return getTextFromElement(verifySize);
    }

    public String verifyProductColour() {
        return getTextFromElement(verifyColour);
    }
}
