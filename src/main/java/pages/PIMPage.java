package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {

    WebDriver driver;

    public PIMPage(WebDriver driver) {
        this.driver = driver;
    }

    By pimMenu = By.xpath("//span[text()='PIM']");
    By addBtn = By.xpath("//button[normalize-space()='Add']");
    By saveBtn = By.xpath("//button[normalize-space()='Save']");

    public void openPIM() { driver.findElement(pimMenu).click(); sleep(); }

    public void verifyEmployeeList() { openPIM(); }

    public void verifyAddEmployeeButton() { openPIM(); }

    public void addEmployee(String f, String l) {
        openPIM();
        driver.findElement(addBtn).click();
        driver.findElement(saveBtn).click();
        sleep();
    }

    public void checkEmployeeId() { openPIM(); }

    public void uploadImage() { openPIM(); }

    public void uploadInvalidFile() { openPIM(); }

    public void searchEmployee() { openPIM(); }

    public void searchInvalidEmployee() { openPIM(); }

    public void resetSearch() { openPIM(); }

    public void deleteEmployee() { openPIM(); }

    private void sleep() { try { Thread.sleep(1000); } catch(Exception e){} }
}