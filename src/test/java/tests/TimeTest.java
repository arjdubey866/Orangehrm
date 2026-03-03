package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TimeTest extends BaseTest {

    @Test(groups="regression")
    public void navigateTime(){
        new DashboardPage(driver).goToTime();
        Assert.assertTrue(new TimePage(driver).isTimePage());
    }

    @Test(groups="regression")
    public void timeUrl(){
        new DashboardPage(driver).goToTime();
        Assert.assertTrue(driver.getCurrentUrl().contains("time"));
    }

    @Test(groups="regression")
    public void timeRefresh(){
        new DashboardPage(driver).goToTime();
        driver.navigate().refresh();
        Assert.assertTrue(driver.getCurrentUrl().contains("time"));
    }

    @Test(groups="regression")
    public void timeBack(){
        new DashboardPage(driver).goToTime();
        driver.navigate().back();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}