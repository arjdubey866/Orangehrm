package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;

public class LoginPage {

    WebDriver driver;
    WaitUtils wait;

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");
    By errorMsg = By.xpath("//p[contains(@class,'alert')]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    public void login(String user, String pass){
        wait.waitForVisible(username);
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }

    public String getError(){
        return driver.findElement(errorMsg).getText();
    }
}