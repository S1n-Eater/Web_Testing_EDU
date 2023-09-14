package TestingPage.AddProductsInCartPage;

import TestingPage.PageObject.PageObject;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddProductsInCartPage extends PageObject {

    public AddProductsInCartPage(WebDriver driver, String url){
        super(driver, url);
    }

    public void AddArrayofProductsToCurtTest(){
        super.Open(url);

        int cartValue = Integer.valueOf(driver.findElement(By.xpath("//div[@class='cart-info']//tr[1]//strong")).getText());

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i< products.size(); i++){

            String name = products.get(i).getText();

            if (name.contains("Cucumber")){
                driver.findElements(By.xpath("//button[text() = 'ADD TO CART']")).get(i).click();
                cartValue = Integer.valueOf(driver.findElement(By.xpath("//div[@class='cart-info']//tr[1]//strong")).getText());
                break;
            }
        }


        if(cartValue > 0){
            System.out.println("\n\t- TEST - PASSED -");
            System.out.println("\nPriduct in cart:\t" + cartValue);

            Assert.assertTrue(true);
        }else{
            System.out.println("\nCart is empty X(");

            Assert.assertTrue(false);
        }
    }
}
