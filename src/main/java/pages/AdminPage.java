package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;

public class AdminPage {

    WebDriver driver;
    WaitUtils wait;

    By adminMenu = By.xpath("//span[text()='Admin']");
    By systemUsers = By.xpath("//h6[text()='System Users']");
    By addBtn = By.xpath("//button[normalize-space()='Add']");
    By usernameField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By searchBtn = By.xpath("//button[normalize-space()='Search']");
    By noRecords = By.xpath("//span[text()='No Records Found']");

    public AdminPage(WebDriver driver){
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    public void openAdmin(){
        driver.findElement(adminMenu).click();
    }

    public boolean isAdminPageDisplayed(){
        return driver.findElement(systemUsers).isDisplayed();
    }

    public boolean isAddButtonVisible(){
        return driver.findElement(addBtn).isDisplayed();
    }

    public void clickAddUser(){
        driver.findElement(addBtn).click();
    }

    public void searchUser(String name){
        driver.findElement(usernameField).sendKeys(name);
        driver.findElement(searchBtn).click();
    }

    public boolean isNoRecordDisplayed(){
        return driver.findElement(noRecords).isDisplayed();
    }
}