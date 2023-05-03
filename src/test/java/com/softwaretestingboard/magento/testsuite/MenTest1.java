package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenTest;
import com.softwaretestingboard.magento.testpage.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest1 extends BaseTest {
    MenTest menTest = new MenTest();

    @Test
    public void verifyUserShouldAddProductSuccessFullyToShoppingCart() {
        menTest.mouseHoverOnMenMenu();
        menTest.mouseHoverOnBottomsMenu();
        menTest.clickOnPants();
        menTest.mouseHoverOnSize();
        menTest.mouseHoverOnColour();
        menTest.clickOnAddToCart();
        Assert.assertEquals(menTest.verifyTextInHeader(), "You added Cronus Yoga Pant to your shopping cart.");
        menTest.clickOnshopingCart();
        Assert.assertEquals(menTest.verifyTextShopingCart(), "shopping cart", "Error");
        Assert.assertEquals(menTest.verifyProductName(), "Cronus Yoga Pant", "Error");
        menTest.clickOnShowDetails();
        Assert.assertEquals(menTest.verifyProductSize(), "32", "Error");
        Assert.assertEquals(menTest.verifyProductColour(), "Black", "Error");
    }
}
