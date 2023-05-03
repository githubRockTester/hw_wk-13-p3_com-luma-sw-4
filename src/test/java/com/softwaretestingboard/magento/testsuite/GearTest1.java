package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearTest;
import com.softwaretestingboard.magento.testpage.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest1 extends BaseTest {
    GearTest gearTest = new GearTest();

    @Test
    public void verifyUserShouldAddProductSuccessFullyToShoppingCart() {
        gearTest.mouseHoverOnGearMenu();
        gearTest.mouseHoverOnBagsMenu();
        gearTest.clickOnProduct();
        Assert.assertEquals(gearTest.verifyProductName(), "Overnight Duffle");
        gearTest.changeQuantityTo3();
        gearTest.clickOnAddToCart();
        Assert.assertEquals(gearTest.verifyTextInHeader(), "You added Overnight Duffle to your shopping cart.");
        gearTest.clickOnShopingCart();
        Assert.assertEquals(gearTest.reVerifyProductName(), "Overnight Duffle");
        Assert.assertEquals(gearTest.verifyProductQauantity(),"3");
        Assert.assertEquals(gearTest.verifyProductPrice(), "$135.00");
        gearTest.changeQuantityTo5();
        gearTest.clickOnUpdate();
        gearTest.verifyUpdatedPrice();
    }
}
