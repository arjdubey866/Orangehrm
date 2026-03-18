package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;

public class DashboardPage {

    WebDriver driver;
    WaitUtils wait;

    By dashboard = By.xpath("//h6[text()='Dashboard']");
    By admin = By.xpath("//span[text()='Admin']");
    By pim = By.xpath("//span[text()='PIM']");
    By leave = By.xpath("//span[text()='Leave']");
    By time = By.xpath("//span[text()='Time']");
    By recruitment = By.xpath("//span[text()='Recruitment']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    public boolean isDashboardVisible() {
        wait.waitForElementVisible(dashboard); // ✅ FIXED
        return driver.findElement(dashboard).isDisplayed();
    }

    public void goToAdmin() {
        wait.waitForElementClickable(admin).click();
    }

    public void goToPIM() {
        wait.waitForElementClickable(pim).click();
    }

    public void goToLeave() {
        wait.waitForElementClickable(leave).click();
    }

    public void goToTime() {
        wait.waitForElementClickable(time).click();
    }

    public void goToRecruitment() {
        wait.waitForElementClickable(recruitment).click();
    }
}