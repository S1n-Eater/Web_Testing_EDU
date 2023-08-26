package TestingPage.YoutubePage;

import TestingPage.PageObject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YoutubePage extends PageObject {

    public YoutubePage(WebDriver driver, String url){
        super(driver, url);
    }

    public void VideoSearching(){
        super.Open(url);
        driver.findElement(By.xpath("//input[@name=\'search_query\']")).sendKeys("blue beetle");
        driver.findElement(By.id("search-icon-legacy")).click();
    }
}
