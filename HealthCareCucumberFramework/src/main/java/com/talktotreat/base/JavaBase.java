package com.talktotreat.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.talktotreat.util.PropertyReader;
//import util.PropertyReader;

public class JavaBase {
          public static WebDriver driver;
           public static String browzersave;

       public static WebDriver browzerSetup(){
            browzersave  =PropertyReader.getConfigProperty("BrowserName"); // calling browzename

            if(browzersave.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                              driver = new ChromeDriver();
            }

            else if(browzersave.equalsIgnoreCase("Firefox")){
                      WebDriverManager.firefoxdriver().setup();
                            driver =new FirefoxDriver();
            }

            else if(browzersave.equalsIgnoreCase("Safari")){
                      WebDriverManager.safaridriver().setup();
                                driver  = new SafariDriver();
            }

            else{

                 WebDriverManager.chromedriver().setup();
                             driver = new ChromeDriver();
            }


                            return driver;
       }//end method



}// end class
