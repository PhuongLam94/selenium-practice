package vn.kms.course.selenium.tests.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import vn.kms.course.selenium.bases.BaseTest;
import vn.kms.course.selenium.demo.LoginPageNoPageFactory;
import vn.kms.course.selenium.demo.LoginPageUsingPageFactory;

import java.net.MalformedURLException;

public class DemoPOMTest extends BaseTest {
    WebDriver driver;
    @BeforeEach
    public void beforeEach() throws MalformedURLException {
        driver = new SafariDriver();

        //driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.safari());
    }
    @Test
    public void loginSuccessfullyNoPageFactory(){
        LoginPageNoPageFactory loginPage = new LoginPageNoPageFactory(driver);
        loginPage.login("thaovo", "kms");
        Assertions.assertEquals("Home | PA Tool", driver.getTitle());
    }

    @Test
    public void loginSuccessfullyPageFactory(){
        LoginPageUsingPageFactory loginPage = new LoginPageUsingPageFactory(driver);
        loginPage.login("thaovo", "kms");
        Assertions.assertEquals("Home | PA Tool", driver.getTitle());
    }
}
