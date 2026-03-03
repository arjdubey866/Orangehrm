package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;

public class TimePage {

    WebDriver driver;
    WaitUtils wait;

    By header = By.xpath("//h6[contains(text(),'Timesheet')]");

    public TimePage(WebDriver driver){
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    public boolean isTimePage(){
        wait.waitForVisible(header);
        return driver.findElement(header).isDisplayed();
    }
}