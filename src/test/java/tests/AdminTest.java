package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AdminTest extends BaseTest {

    @Test(groups="regression")
    public void navigateAdmin(){
        new DashboardPage(driver).goToAdmin();
        Assert.assertTrue(new AdminPage(driver).isAdminPage());
    }

    @Test(groups="regression")
    public void adminUrl(){
        new DashboardPage(driver).goToAdmin();
        Assert.assertTrue(driver.getCurrentUrl().contains("admin"));
    }

    @Test(groups="regression")
    public void adminRefresh(){
        new DashboardPage(driver).goToAdmin();
        driver.navigate().refresh();
        Assert.assertTrue(driver.getCurrentUrl().contains("admin"));
    }

    @Test(groups="regression")
    public void adminBack(){
        new DashboardPage(driver).goToAdmin();
        driver.navigate().back();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}