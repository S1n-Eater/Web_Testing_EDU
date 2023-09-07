package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverManager {

    public static WebDriver driver;
    public void WebdriverConnection(){
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\Java Projects\\chromedriver\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    public void WebdriverCloseAndQuit(){
        driver.close();
        driver.quit();
    }

}
