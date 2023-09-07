package org.example;

import TestingPage.AlertsTestingPage.AlertsTestingPage;
import TestingPage.CheckboxesPage.CheckboxesPage;
import TestingPage.DropdownsPage.Dropdowns;
import TestingPage.GooglePage.GooglePage;
import TestingPage.IsEnablePage.IsEnablePage;
import TestingPage.YoutubePage.YoutubePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Scanner;

import static Constants.Constants.Urls.*;
import static org.example.WebdriverManager.driver;


public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        Scanner in = new Scanner(System.in);
        int testNumber;
        WebdriverManager webdriverManager = new WebdriverManager();

        System.out.println("________________________________________________________________\n" + "Test list:\n" + "\n1)Forwarding validation;\n2)Dropdown test;\n3)Sending keys test;\n4)Checkboxes test;\n5)Element enabled test;\n6)Alerts test" + "\n________________________________________________________________\n");

        System.out.println("\n\nWrite the number of test");
        testNumber = in.nextInt();

        switch (testNumber) {

            case 1:     /*Forwarding validation*/
                webdriverManager.WebdriverConnection();

                GooglePage googlePage = new GooglePage(driver, URL_GOOGLE);
                googlePage.ForwardingValidation();

                webdriverManager.WebdriverCloseAndQuit();
                break;

            case 2:     /*Dropdown test*/
                webdriverManager.WebdriverConnection();

                Dropdowns dropdowns = new Dropdowns(driver, URL_DROPDOWNS);
                dropdowns.CheckDropdown();
                dropdowns.CheckDropdownWithoutSelector(URL_DROPDOWNS_WITHOUT_SELECTOR);
                dropdowns.AutoSuggestiveDropdowns(URL_MAKE_MY_TRIP_FLIGHTS);

                webdriverManager.WebdriverCloseAndQuit();
                break;

            case 3:     /*Sending keys test*/
                webdriverManager.WebdriverConnection();

                YoutubePage youtubePage = new YoutubePage(driver, URL_YOUTUBE);
                youtubePage.VideoSearching();

                webdriverManager.WebdriverCloseAndQuit();
                break;

            case 4:     /*Checkboxes test*/
                webdriverManager.WebdriverConnection();

                CheckboxesPage checkboxesPage = new CheckboxesPage(driver, URL_CHECKBOXES_TESTING_WEBSITE);
                checkboxesPage.Ceckboxestest();

                webdriverManager.WebdriverCloseAndQuit();
                break;

            case 5:     /*Element enabled test*/
                webdriverManager.WebdriverConnection();

                IsEnablePage isEnablePage = new IsEnablePage(driver, URL_IS_ENABLE_ELEMENT_TEST);
                isEnablePage.CheckIsEnableElement();

                webdriverManager.WebdriverCloseAndQuit();
                break;

            case 6:     /*Alerts test*/
                webdriverManager.WebdriverConnection();

                AlertsTestingPage alertsTestingPage = new AlertsTestingPage(driver, URL_ALERTS_TESTING_PAGE);
                alertsTestingPage.AlertsTest();

                webdriverManager.WebdriverCloseAndQuit();
                break;
        }
    }
}