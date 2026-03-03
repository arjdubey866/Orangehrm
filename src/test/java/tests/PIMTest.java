package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class PIMTest extends BaseTest {

    @Test(groups="regression")
    public void navigatePIM(){
        new DashboardPage(driver).goToPIM();
        Assert.assertTrue(new PIMPage(driver).isPIMPage());
    }

    @Test(groups="regression")
    public void pimUrl(){
        new DashboardPage(driver).goToPIM();
        Assert.assertTrue(driver.getCurrentUrl().contains("pim"));
    }

    @Test(groups="regression")
    public void pimRefresh(){
        new DashboardPage(driver).goToPIM();
        driver.navigate().refresh();
        Assert.assertTrue(driver.getCurrentUrl().contains("pim"));
    }

    @Test(groups="regression")
    public void pimBack(){
        new DashboardPage(driver).goToPIM();
        driver.navigate().back();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}