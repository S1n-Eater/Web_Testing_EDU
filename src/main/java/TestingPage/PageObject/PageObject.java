package TestingPage.PageObject;

import org.openqa.selenium.WebDriver;

public class PageObject{
    protected WebDriver driver;
    protected String url;
    public PageObject(WebDriver driver, String url){
        this.driver = driver;
        this.url = url;
    }

    public void Open(String url){
        driver.get(url);
    }
    public void Forwarding(String url){driver.navigate().to(url);}
}
