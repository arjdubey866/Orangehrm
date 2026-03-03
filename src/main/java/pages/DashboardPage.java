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
    By time = By.xpath("//span[text()='Time']");
    By recruitment = By.xpath("//span[text()='Recruitment']");

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    public boolean isDashboardVisible(){
        wait.waitForVisible(dashboard);
        return driver.findElement(dashboard).isDisplayed();
    }

    public void goToAdmin(){ driver.findElement(admin).click(); }
    public void goToPIM(){ driver.findElement(pim).click(); }
    public void goToTime(){ driver.findElement(time).click(); }
    public void goToRecruitment(){ driver.findElement(recruitment).click(); }
}