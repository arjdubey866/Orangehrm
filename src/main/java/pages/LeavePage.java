package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage {

    WebDriver driver;

    public LeavePage(WebDriver driver) {
        this.driver = driver;
    }

    By leaveMenu = By.xpath("//span[text()='Leave']");

    public void openLeave() { driver.findElement(leaveMenu).click(); sleep(); }

    public void verifyLeaveList() { openLeave(); }

    public void verifyBalance() { openLeave(); }

    public void resetFilter() { openLeave(); }

    public void applyLeave(String from, String to) { openLeave(); }

    private void sleep() { try { Thread.sleep(1000); } catch(Exception e){} }
}