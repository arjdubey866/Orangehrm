package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PIMPage;

public class PIMTest extends BaseTest {

    @Test
    public void TC1_verifyPIMMenu(){

        PIMPage pim = new PIMPage(driver);
        pim.openPIM();

        Assert.assertTrue(pim.isPIMPageDisplayed());
    }

    @Test
    public void TC2_verifyPIMPage(){

        PIMPage pim = new PIMPage(driver);
        pim.openPIM();

        Assert.assertTrue(pim.isPIMPageDisplayed());
    }

    @Test
    public void TC3_verifyEmployeeList(){

        PIMPage pim = new PIMPage(driver);
        pim.openPIM();

        Assert.assertTrue(pim.isPIMPageDisplayed());
    }

    @Test
    public void TC4_verifyAddEmployeeBtn(){

        PIMPage pim = new PIMPage(driver);
        pim.openPIM();
        pim.clickAddEmployee();
    }

    @Test
    public void TC5_addEmployee(){

        PIMPage pim = new PIMPage(driver);
        pim.openPIM();
        pim.clickAddEmployee();

        pim.addEmployee("John","Smith");
    }

    @Test
    public void TC10_searchEmployee(){

        PIMPage pim = new PIMPage(driver);
        pim.openPIM();

        pim.searchEmployee("John");
    }

    @Test
    public void TC11_invalidSearch(){

        PIMPage pim = new PIMPage(driver);
        pim.openPIM();

        pim.searchEmployee("random123");

        Assert.assertTrue(pim.isNoRecord());
    }

    @Test
    public void TC12_resetSearch(){

        PIMPage pim = new PIMPage(driver);
        pim.openPIM();

        pim.clickReset();
    }
}