package TestingPage.GooglePage;

import TestingPage.PageObject.PageObject;
import org.openqa.selenium.WebDriver;

import static Constants.Constants.Urls.URL_GOOGLE;

public class GooglePage extends PageObject{
    public GooglePage (WebDriver driver, String url){
        super(driver, url);
    }

    public void ForwardingValidation(){
        super.Open(url);
        System.out.println(driver.getTitle());

        String checkingUrl = driver.getCurrentUrl();

        if (URL_GOOGLE.equals(checkingUrl)){System.out.println("Page isn't hacked");}
        else {System.out.println("Page is hacked" + "\n" + checkingUrl);}
    }

}
