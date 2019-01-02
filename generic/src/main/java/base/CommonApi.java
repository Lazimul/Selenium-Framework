package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import java.util.concurrent.TimeUnit;

public class CommonApi {
    public WebDriver driver = null;

    @Parameters({"url"})

    @BeforeMethod
    public void setUp(String url) {
        System.setProperty("WebDriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();

    }

    public void typecss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeID(String locator, String value) {
        driver.findElement(By.id(locator)).sendKeys(value);
    }

    public void typeElement(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value);
                }
            }
        }
    }
                public void typeOnElementNEnter(String locator, String value){
                    try {
                        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
                    }catch(Exception ex1) {
                        try{
                            System.out.println("First Attempt was not successful");
                            driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
                        }catch(Exception ex2) {
                            try {
                                System.out.println("Second Attempt was not successful");
                                driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                            } catch (Exception ex3) {
                                System.out.println("Third Attempt was not successful");
                                driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                            }

                        }
                    }}

              //  public void clearField(String locator){
                    //driver.findElement(By.id(locator)).clear();
                //}

                public void navigateBack(){
                    driver.navigate().back();
                }
            }
