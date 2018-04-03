package vn.kms.course.selenium.bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static vn.kms.course.selenium.data.Constant.BASE_URL;


public class BasePage {
    protected String path;
    protected WebDriver webDriver;
    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    public String getUrl(){
        if (this.path.contains("http") || this.path.contains("https"))
            return this.path;
        else
            return BASE_URL.concat(this.path);
    }
    public void goToPage(){
        this.webDriver.get(getUrl());
    }
    public String getTitle(){
        return this.webDriver.getTitle();
    }
    public void goTo(String link){
        this.webDriver.get(link);
    }
}
