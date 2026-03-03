package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;

public class AdminPage {

    WebDriver driver;
    WaitUtils wait;

    By header = By.xpath("//h6[text()='System Users']");
    By searchBtn = By.xpath("//button[normalize-space()='Search']");
    By resetBtn = By.xpath("//button[normalize-space()='Reset']");

    public AdminPage(WebDriver driver){
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    public boolean isAdminPage(){
        wait.waitForVisible(header);
        return driver.findElement(header).isDisplayed();
    }

    public void clickSearch(){
        wait.waitForClickable(searchBtn);
        driver.findElement(searchBtn).click();
    }

    public void clickReset(){
        driver.findElement(resetBtn).click();
    }
}