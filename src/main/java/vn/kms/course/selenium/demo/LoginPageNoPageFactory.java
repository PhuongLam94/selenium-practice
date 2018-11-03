package vn.kms.course.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageNoPageFactory {
    WebElement usernameTxtFld;
    WebElement passwordTxtFld;
    WebElement loginBtn;

    WebDriver driver;

    public LoginPageNoPageFactory(WebDriver driver){
        this.driver = driver;
        usernameTxtFld = driver.findElement(By.id("username"));
        passwordTxtFld = driver.findElement(By.id("password"));
        loginBtn = driver.findElement(By.id("btnSubmit"));
    }

    public void login(String username, String password){
        usernameTxtFld.sendKeys(username);
        passwordTxtFld.sendKeys(password);
        loginBtn.click();
    }
}
