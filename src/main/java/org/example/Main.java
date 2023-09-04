package org.example;

import TestingPage.CheckboxesPage.CheckboxesPage;
import TestingPage.DropdownsPage.Dropdowns;
import TestingPage.GooglePage.GooglePage;
import TestingPage.IsEnablePage.IsEnablePage;
import TestingPage.YoutubePage.YoutubePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Constants.Constants.Urls.*;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Data\\Java Projects\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//        /*Forwarding validation*/
//        GooglePage googlePage = new GooglePage(driver, URL_GOOGLE);
//        googlePage.ForwardingValidation();
//
//        /*Dropdown test*/
//        Dropdowns dropdowns = new Dropdowns(driver, URL_DROPDOWNS);
//        dropdowns.CheckDropdown();
//        dropdowns.CheckDropdownWithoutSelector(URL_DROPDOWNS_WITHOUT_SELECTOR);
//        dropdowns.AutoSuggestiveDropdowns(URL_MAKE_MY_TRIP_FLIGHTS);
//
//        /*Sending keys test*/
//        YoutubePage youtubePage = new YoutubePage(driver, URL_YOUTUBE);
//        youtubePage.VideoSearching();
//
//        /*Checkboxes test*/
//        CheckboxesPage checkboxesPage = new CheckboxesPage(driver, URL_CHECKBOXES_TESTING_WEBSITE);
//        checkboxesPage.Ceckboxestest();

        /*Element enabled test*/
        IsEnablePage isEnablePage = new IsEnablePage(driver, URL_IS_ENABLE_ELEMENT_TEST);
        isEnablePage.CheckIsEnableElement();

//        driver.close();
//        driver.quit();
    }
}