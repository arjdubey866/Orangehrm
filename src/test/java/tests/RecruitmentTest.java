package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class RecruitmentTest extends BaseTest {

    @Test(groups="regression")
    public void navigateRecruitment(){
        new DashboardPage(driver).goToRecruitment();
        Assert.assertTrue(new RecruitmentPage(driver).isRecruitmentPage());
    }

    @Test(groups="regression")
    public void recruitmentUrl(){
        new DashboardPage(driver).goToRecruitment();
        Assert.assertTrue(driver.getCurrentUrl().contains("recruitment"));
    }

    @Test(groups="regression")
    public void recruitmentRefresh(){
        new DashboardPage(driver).goToRecruitment();
        driver.navigate().refresh();
        Assert.assertTrue(driver.getCurrentUrl().contains("recruitment"));
    }

    @Test(groups="regression")
    public void recruitmentBack(){
        new DashboardPage(driver).goToRecruitment();
        driver.navigate().back();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}