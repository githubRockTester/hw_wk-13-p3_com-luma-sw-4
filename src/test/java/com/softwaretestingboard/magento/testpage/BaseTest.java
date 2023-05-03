package com.softwaretestingboard.magento.testpage;

import com.softwaretestingboard.magento.propertyreader.PropertyReader;
import com.softwaretestingboard.magento.utilities.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utilities {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

}
