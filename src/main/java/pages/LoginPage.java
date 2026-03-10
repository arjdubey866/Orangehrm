package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WaitUtils;

public class LoginPage {

    WebDriver driver;
    WaitUtils wait;

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");
    By errorMsg = By.xpath("//p[contains(@class,'alert')]");
    By requiredMsg = By.xpath("//span[text()='Required']");
    By userMenu = By.xpath("//p[@class='oxd-userdropdown-name']");
    By logout = By.xpath("//a[text()='Logout']");
    By forgotPassword = By.xpath("//p[text()='Forgot your password?']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    public void enterUsername(String user){
        wait.waitForVisible(username).sendKeys(user);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }

    public void login(String user,String pass){
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }

    public boolean isErrorDisplayed(){
        return driver.findElement(errorMsg).isDisplayed();
    }

    public boolean isRequiredDisplayed(){
        return driver.findElement(requiredMsg).isDisplayed();
    }

    public void logout(){
        driver.findElement(userMenu).click();
        driver.findElement(logout).click();
    }

    public void clickForgotPassword(){
        driver.findElement(forgotPassword).click();
    }
}