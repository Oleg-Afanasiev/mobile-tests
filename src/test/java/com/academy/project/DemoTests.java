package com.academy.project;

import com.academy.core.test.BaseTest;
import com.academy.project.page.SubscriberPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTests extends BaseTest {
    private static final Logger LOG =  LogManager.getLogger(DemoTests.class);

    @Test(dataProvider = "testDataProvider")
    public void testFeature(String expectedName) {
        String actualName = new SubscriberPage(driver)
                .goTo(baseUrl)
                .getName();

        Assert.assertEquals(actualName, expectedName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @DataProvider(name="testDataProvider")
    public Object[][] testDataProvider() {
        return new Object[][] {
                {"Peter"}
        };
    }
}
