package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePageTest {

    public WebDriver driver;

    @Before

    public void setup(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Voja\\Desktop\\YourLogoTestProject\\YourLogoTestProject\\lib\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @After

    public void teardown(){
        driver.quit();
    }
    
}
