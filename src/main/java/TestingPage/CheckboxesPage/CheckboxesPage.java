package TestingPage.CheckboxesPage;

import TestingPage.PageObject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage extends PageObject {

    public CheckboxesPage(WebDriver driver, String url){
        super(driver,url);
    }

    public void Ceckboxestest(){
        super.Open(url);

        Boolean selectCheker = false;
        int checkboxesCounter = 0;

        System.out.println("Before the test\t|\tFirst checkbox is selected: " + selectCheker);
        driver.findElement(By.xpath("(//input[@type=\'checkbox\'][1])")).click();
        selectCheker = driver.findElement(By.xpath("(//input[@type=\'checkbox\'][1])")).isSelected();
        System.out.println("After the test\t|\tFirst checkbox is selected: " + selectCheker);

        checkboxesCounter = driver.findElements(By.xpath("//input[@type=\'checkbox\']")).size();
        System.out.println("\nAll amount of checkboxes: \t" + checkboxesCounter);
    }
}
