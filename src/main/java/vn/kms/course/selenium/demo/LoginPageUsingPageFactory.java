package vn.kms.course.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUsingPageFactory {

    @FindBy(id = "username")
    WebElement usernameTxtFld;

    @FindBy(id = "password")
    WebElement passwordTxtFld;

    @FindBy(id = "btnSubmit")
    WebElement loginBtn;

    WebDriver driver;

    public LoginPageUsingPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password){
        usernameTxtFld.sendKeys(username);
        passwordTxtFld.sendKeys(password);
        loginBtn.click();
    }
}