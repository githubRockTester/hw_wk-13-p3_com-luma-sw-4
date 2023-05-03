package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenTest;
import com.softwaretestingboard.magento.testpage.BaseTest;
import org.testng.annotations.Test;

public class WomenTest1 extends BaseTest {
    WomenTest womenTest = new WomenTest();

    @Test
    public void verifyTheSortByProductNameFilter() {
        womenTest.mouseHoverOnWomenMenu();
        womenTest.mouseHoverToTops();
        womenTest.clickOnJackets();
        womenTest.sortByProductName();
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        womenTest.mouseHoverOnWomenMenu();
        womenTest.mouseHoverToTops();
        womenTest.clickOnJackets();
        womenTest.sortByPrice();
    }
}
