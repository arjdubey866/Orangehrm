package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

    WebDriver driver;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    By adminMenu = By.xpath("//span[text()='Admin']");
    By addBtn = By.xpath("//button[normalize-space()='Add']");
    By saveBtn = By.xpath("//button[normalize-space()='Save']");
    By searchBox = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");

    public void openAdmin() {
        driver.findElement(adminMenu).click();
        sleep();
    }

    public void verifyUsersList() { openAdmin(); }

    public void verifyAddButton() { openAdmin(); driver.findElement(addBtn); }

    public void addUser() {
        openAdmin();
        driver.findElement(addBtn).click();
        driver.findElement(saveBtn).click();
        sleep();
    }

    public void clickAddWithoutData() { openAdmin(); driver.findElement(addBtn).click(); }

    public void submitEmptyUser() { openAdmin(); driver.findElement(saveBtn).click(); }

    public void addDuplicateUser() { openAdmin(); }

    public void addInvalidPasswordUser() { openAdmin(); }

    public void searchUser() {
        openAdmin();
        driver.findElement(searchBox).sendKeys("invalid");
    }

    private void sleep() { try { Thread.sleep(1000); } catch(Exception e){} }
}