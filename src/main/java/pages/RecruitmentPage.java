package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;

public class RecruitmentPage {

    WebDriver driver;
    WaitUtils wait;

    By header = By.xpath("//h6[text()='Recruitment']");

    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    public boolean isRecruitmentPage() {
        wait.waitForElementVisible(header); // ✅ FIXED
        return driver.findElement(header).isDisplayed();
    }
}