package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setup(){

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // LOGIN ONCE
        LoginPage login = new LoginPage(driver);
        login.login("Admin","admin123");
    }

    @AfterClass
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}