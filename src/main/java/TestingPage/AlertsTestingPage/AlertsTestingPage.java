package TestingPage.AlertsTestingPage;

import TestingPage.PageObject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AlertsTestingPage extends PageObject {
    public AlertsTestingPage(WebDriver driver, String url){
        super(driver, url);
    }

    public void AlertsTest(){
        super.Open(url);

        String alertWithOkValidation = "I am an alert box!";
        String alertWithOkAndCancelValidation = "You Pressed Cancel";
        String alertWithTextboxValidation = "Hello Artem How are you today";

        String alertWithOKAndCancel = "//a[@href=\'#CancelTab\']";
        String alertWithTextbox = "//a[@href='#Textbox']";

        driver.findElement(By.xpath("//button[@class=\'btn btn-danger\']")).click();
        if (alertWithOkValidation.equals(driver.switchTo().alert().getText())) {
            System.out.println("\nTest is passed\t|\tAllert text:\t" + driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();

            Assert.assertTrue(true);
        }else{
            System.out.println("\nTest is failed\t");
            Assert.assertTrue(false);
        }

        driver.findElement(By.xpath(alertWithOKAndCancel)).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.switchTo().alert().dismiss();
        if(alertWithOkAndCancelValidation.equals(driver.findElement(By.id("demo")).getText())){
            System.out.println("\nTest is passed\t|\tAllert text:\t" + driver.findElement(By.id("demo")).getText());
            Assert.assertTrue(true);
        }else{
            System.out.println("\nTest is failed\t");
            Assert.assertTrue(false);
        }

        driver.findElement(By.xpath(alertWithTextbox)).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        driver.switchTo().alert().sendKeys("Artem");
        driver.switchTo().alert().accept();
        if (alertWithTextboxValidation.equals(driver.findElement(By.id("demo1")).getText())){
            System.out.println("\nTest is passed\t|\tAllert text:\t" + driver.findElement(By.id("demo1")).getText());
            Assert.assertTrue(true);
        }else{
            System.out.println("\nTest is failed\t");
            Assert.assertTrue(false);
        }
    }
}
