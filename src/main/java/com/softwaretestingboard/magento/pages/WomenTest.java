package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WomenTest extends Utilities {
    By womenMenu = By.id("ui-id-4");
    By topsMenu = By.id("ui-id-9");
    By jacketsMenu = By.id("ui-id-11");
    By filterByProductName = By.xpath("(//option[@value='name'][normalize-space()='Product Name'])[1]");
    By filterByPrice = By.xpath("//strong[@class='product name product-item-name']//a");
    By defaultOrder = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");
    By alphabeticalOrder = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]/option[2]");


    //Step 1
    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverToTops() {
        mouseHoverToElement(topsMenu);
    }

    public void clickOnJackets() {
        mouseHoverToElementAndClick(jacketsMenu);
    }

    public void sortByProductName() {
        clickOnElement(filterByProductName);
    }

    public void sortByPrice() {
        clickOnElement(filterByPrice);
    }

    public void verifyProductsSortedAToZ() {
        List<WebElement> products = driver.findElements(defaultOrder);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        products = driver.findElements(alphabeticalOrder);
        ArrayList<String> afterSortByAToZProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByAToZProductsName.add(e.getText());
        }
    }
}