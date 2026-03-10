package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ExcelUtil;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData")
    public void loginDataDrivenTest(String username,String password){

        loginPage.login(username,password);
    }

    @DataProvider
    public Object[][] loginData(){

        return ExcelUtil.getLoginData();
    }

    @Test
    public void verifyLogout(){

        loginPage.login("Admin","admin123");

        loginPage.logout();
    }

    @Test
    public void verifyForgotPassword(){

        loginPage.clickForgotPassword();
    }

}