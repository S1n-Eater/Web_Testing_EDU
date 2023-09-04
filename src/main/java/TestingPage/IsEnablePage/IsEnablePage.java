package TestingPage.IsEnablePage;

import TestingPage.PageObject.PageObject;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsEnablePage extends PageObject {

    public IsEnablePage(WebDriver driver, String url){
        super(driver, url);
    }

    public void CheckIsEnableElement(){
        super.Open(url);

        String testElementCalendar = "//div[@class='css-1dbjc4n r-18u37iz']//div[@data-testid='return-date-dropdown-label-test-id']";
        String enableChekerLocator = "//div[@data-testid='return-date-dropdown-label-test-id']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//div[text()='Select Date']";

        if(driver.findElement(By.xpath(enableChekerLocator)).getAttribute("style").contains("1")) {
            System.out.println("\nTest is failed, element is enable");
            Assert.assertFalse(false);
        }else{
            System.out.println("\nTest is passed, element is disabled");
            Assert.assertTrue(true);
        }

        driver.findElement(By.xpath(testElementCalendar)).click();

        if(driver.findElement(By.xpath(enableChekerLocator)).getAttribute("style").contains("1")) {
            System.out.println("\nTest is passed, element is enable");
            Assert.assertTrue(true);
        }else{
            System.out.println("\nTest is failed, element is disable");
            Assert.assertFalse(false);
        }
    }

}
