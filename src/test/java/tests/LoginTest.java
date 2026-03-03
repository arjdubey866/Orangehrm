package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;

public class LoginTest extends BaseTest {

    @Test(groups={"smoke","regression"})
    public void verifyLogin(){
        Assert.assertTrue(new DashboardPage(driver).isDashboardVisible());
    }

    @Test(groups="regression")
    public void dashboardUrl(){
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @Test(groups="regression")
    public void pageTitle(){
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
    }

    @Test(groups="regression")
    public void dashboardLoaded(){
        Assert.assertTrue(new DashboardPage(driver).isDashboardVisible());
    }
}