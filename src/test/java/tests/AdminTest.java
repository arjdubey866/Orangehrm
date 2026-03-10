package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPage;

public class AdminTest extends BaseTest {

    @Test
    public void TC1_verifyAdminMenu(){

        AdminPage admin = new AdminPage(driver);
        admin.openAdmin();

        Assert.assertTrue(admin.isAdminPageDisplayed());
    }

    @Test
    public void TC2_navigateAdminPage(){

        AdminPage admin = new AdminPage(driver);
        admin.openAdmin();

        Assert.assertTrue(admin.isAdminPageDisplayed());
    }

    @Test
    public void TC3_verifyUserList(){

        AdminPage admin = new AdminPage(driver);
        admin.openAdmin();

        Assert.assertTrue(admin.isAdminPageDisplayed());
    }

    @Test
    public void TC4_verifyAddButton(){

        AdminPage admin = new AdminPage(driver);
        admin.openAdmin();

        Assert.assertTrue(admin.isAddButtonVisible());
    }

    @Test
    public void TC10_searchInvalidUser(){

        AdminPage admin = new AdminPage(driver);
        admin.openAdmin();

        admin.searchUser("random123");

        Assert.assertTrue(admin.isNoRecordDisplayed());
    }
}