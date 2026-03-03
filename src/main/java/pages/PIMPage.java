package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;

public class PIMPage {

    WebDriver driver;
    WaitUtils wait;

    By header = By.xpath("//h6[text()='Employee Information']");

    public PIMPage(WebDriver driver){
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    public boolean isPIMPage(){
        wait.waitForVisible(header);
        return driver.findElement(header).isDisplayed();
    }
}