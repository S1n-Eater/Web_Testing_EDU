package org.example;

import TestingPage.DropdownsPage.Dropdowns;
import TestingPage.GooglePage.GooglePage;
import TestingPage.YoutubePage.YoutubePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Constants.Constants.Urls.*;


public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Data\\Java Projects\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        /*Forwarding validation*/
        GooglePage googlePage = new GooglePage(driver, URL_GOOGLE);
        googlePage.ForwardingValidation();

        /*Dropdown test*/
        Dropdowns dropdowns = new Dropdowns(driver, URL_DROPDOWNS);
        dropdowns.CheckDropdown();

        /*Sending keys test*/
        YoutubePage youtubePage = new YoutubePage(driver, URL_YOUTUBE);
        youtubePage.VideoSearching();

        driver.close();
        driver.quit();
    }
}