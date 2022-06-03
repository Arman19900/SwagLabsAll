package com.company.swaglabs.wrappedelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyElement {
    private WebDriver driver;
    private static WebDriverWait wait;

    public MyElement(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 3);
    }

    public static void click(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }


    public static void fill(WebElement element, String field){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(field);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static boolean isDisplayed(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        }catch (Exception e){
            System.out.println("The element " + e + " is not displayed.");
            return false;
        }

    }


}
