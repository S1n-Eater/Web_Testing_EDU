package TestingPage.AddProductsInCartPage;

import TestingPage.PageObject.PageObject;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddProductsInCartPage extends PageObject {

    public AddProductsInCartPage(WebDriver driver, String url){
        super(driver, url);
    }

    public void AddArrayofProductsToCurtTest(){
        super.Open(url);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        int counter = 0;
        int cartValue = Integer.valueOf(driver.findElement(By.xpath("//div[@class='cart-info']//tr[1]//strong")).getText());

        String[] productsNeeded = {"Cucumber", "Potato", "Banana"};
        List productsNeededList = Arrays.asList(productsNeeded);

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i< products.size(); i++){

            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            if (productsNeededList.contains(formattedName)){
                counter++;

                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                cartValue = Integer.valueOf(driver.findElement(By.xpath("//div[@class='cart-info']//tr[1]//strong")).getText());

                if(counter==productsNeeded.length){break;}
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

    public void CheckPromoCodeIsValidTest(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String promoCodeIsActivated = "Code isn't applied";

        driver.findElement(By.xpath("//div[@class='cart']//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//div[@class='action-block']//button[text() = 'PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promobtn")).click();
        promoCodeIsActivated = driver.findElement(By.cssSelector("span.promoinfo")).getText();

        if(promoCodeIsActivated.equals("Code applied ..!")){
            System.out.println("\n\t- TEST - PASSED -");
            System.out.println("\n" + promoCodeIsActivated);
            Assert.assertTrue(true);
        }else{
            System.out.println("\n\t- TEST - FAILED -");
            Assert.assertTrue(false);
        }

    }
}
