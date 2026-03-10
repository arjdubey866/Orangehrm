package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;

public class PIMPage {

    WebDriver driver;
    WaitUtils wait;

    By pimMenu = By.xpath("//span[text()='PIM']");
    By employeeList = By.xpath("//h6[text()='Employee Information']");
    By addEmployee = By.xpath("//button[normalize-space()='Add']");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By saveBtn = By.xpath("//button[@type='submit']");
    By searchField = By.xpath("//input[@placeholder='Type for hints...']");
    By searchBtn = By.xpath("//button[normalize-space()='Search']");
    By resetBtn = By.xpath("//button[normalize-space()='Reset']");
    By noRecord = By.xpath("//span[text()='No Records Found']");

    public PIMPage(WebDriver driver){
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    public void openPIM(){
        driver.findElement(pimMenu).click();
    }

    public boolean isPIMPageDisplayed(){
        return driver.findElement(employeeList).isDisplayed();
    }

    public void clickAddEmployee(){
        driver.findElement(addEmployee).click();
    }

    public void addEmployee(String f,String l){
        driver.findElement(firstName).sendKeys(f);
        driver.findElement(lastName).sendKeys(l);
        driver.findElement(saveBtn).click();
    }

    public void searchEmployee(String name){
        driver.findElement(searchField).sendKeys(name);
        driver.findElement(searchBtn).click();
    }

    public void clickReset(){
        driver.findElement(resetBtn).click();
    }

    public boolean isNoRecord(){
        return driver.findElement(noRecord).isDisplayed();
    }
}