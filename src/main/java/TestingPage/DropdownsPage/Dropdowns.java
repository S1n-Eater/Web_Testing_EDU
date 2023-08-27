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

    public void CheckDropdownWithoutSelector(String forwardingUrl) throws InterruptedException {
        int selectCounter = 1;
        super.Forwarding(forwardingUrl);

        System.out.println("Number of adults before the test: " + selectCounter);

        driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div")).click();
        Thread.sleep(2000l);

        while(selectCounter<5){
            driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
            selectCounter++;
        }
        driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();

        System.out.println("Number of adults after the test: " + driver.findElement(By.xpath("//div[@class=\'css-1dbjc4n r-1kz6sp\'][1]")).getText());

        if(driver.findElement(By.xpath("//div[@class=\'css-1dbjc4n r-1kz6sp\'][1]")).getText().equals(Integer.toString(selectCounter))){
            System.out.println("Number of people is correct" + "\t\t|\t\t"+"Test - PASSED");
        }
        else {System.out.println("Number of people isn't correct" + "\tTest - FAILED");}
    }
}
