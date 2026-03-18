package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;

public class LoginPage {

    WebDriver driver;
    WaitUtils wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");
    By errorMsg = By.xpath("//p[contains(@class,'alert-content-text')]");
    By requiredMsg = By.xpath("//span[text()='Required']");
    By profileMenu = By.xpath("//p[@class='oxd-userdropdown-name']");
    By logoutBtn = By.xpath("//a[text()='Logout']");
    By forgotPassword = By.xpath("//p[text()='Forgot your password?']");

    public void login(String user, String pass) {

        wait.waitForElementVisible(username).clear();
        driver.findElement(username).sendKeys(user);

        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);

        wait.waitForElementClickable(loginBtn).click();

        wait.waitForUrlContains("dashboard");
    }

    public void logout() {
        wait.waitForElementClickable(profileMenu).click();
        wait.waitForElementClickable(logoutBtn).click();
    }

    public void clickForgotPassword() {
        wait.waitForElementClickable(forgotPassword).click();
    }

    public boolean isErrorDisplayed() {
        return wait.waitForElementVisible(errorMsg).isDisplayed();
    }

    public boolean isRequiredDisplayed() {
        return wait.waitForElementVisible(requiredMsg).isDisplayed();
    }
}