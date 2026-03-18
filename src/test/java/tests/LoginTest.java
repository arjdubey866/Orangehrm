package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void TC_1_validLogin() {
        new LoginPage(driver).login("Admin", "admin123");
    }

    @Test
    public void TC_2_logout() {
        LoginPage lp = new LoginPage(driver);
        lp.login("Admin", "admin123");
        lp.logout();
    }

    @Test
    public void TC_3_forgotPassword() {
        new LoginPage(driver).clickForgotPassword();
    }

    @Test
    public void TC_4_invalidUsername() {
        new LoginPage(driver).login("wrong", "admin123");
    }

    @Test
    public void TC_5_invalidPassword() {
        new LoginPage(driver).login("Admin", "wrong");
    }

    @Test
    public void TC_6_invalidBoth() {
        new LoginPage(driver).login("wrong", "wrong");
    }

    @Test
    public void TC_7_emptyUsername() {
        new LoginPage(driver).login("", "admin123");
    }

    @Test
    public void TC_8_emptyPassword() {
        new LoginPage(driver).login("Admin", "");
    }

    @Test
    public void TC_9_emptyBoth() {
        new LoginPage(driver).login("", "");
    }
}