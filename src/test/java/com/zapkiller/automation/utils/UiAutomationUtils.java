package com.zapkiller.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UiAutomationUtils {

public static Properties configFiles = readConfig();
public ChromeOptions options = new ChromeOptions();
public WebDriver driver;

    /**
     *<p>Reads properties / config file and its properties</p>
     * @returns Properties
     */

    public static Properties readConfig(){

        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config-qa.properties");
            Properties config = new Properties();
            config.load(fis);
            return config;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *<p>Launches browser based on provided config params</p>
     * @version 1.0
     */

    public void launchBrowser(){
        if(configFiles.getProperty("browser").equalsIgnoreCase("CHROME")){
            if(configFiles.getProperty("browser.chrome.options.headless").equalsIgnoreCase("true")){
                options.addArguments("--headless");
            }
            driver = new ChromeDriver(options);
        }
    }

    /**
     * <p>Terminates the webdriver Session</p>
     * @version 1.0
     */

    public void closeBrowser(){
        driver.quit();
    }

    /**
     * <p>Navigates to provided url/p>
     * @param url
     * @version 1.0
     */

    public void navigateToUrl(String url){
        driver.get(url);
    }

    /**
     * <p>Clicks on provided web element</p>
     * @param element
     * @Version 1.0
     */
    public void clickElement(By element) {

        driver.findElement(element).click();
    }
}
