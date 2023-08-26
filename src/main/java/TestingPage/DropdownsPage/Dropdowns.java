package TestingPage.DropdownsPage;

import TestingPage.PageObject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns extends PageObject {

    public Dropdowns(WebDriver driver, String url){
        super(driver, url);
    }
    public void CheckDropdown(){
        super.Open(url);

        Select selectDropdown = new Select(driver.findElement(By.xpath("//*[@id=\'post-2646\']/div[2]/div/div/div/p/select")));
        selectDropdown.selectByValue("JPN");
    }

}
