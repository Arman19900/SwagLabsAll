package com.company.swaglabs.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Header {
    private WebDriver driver;
    private WebElement menuBar;
    private WebElement logo;
    private WebElement shopContainer;

    public Header(WebDriver driver){
        this.driver = driver;
        this.menuBar = driver.findElement(By.id("react-burger-menu-btn"));
        this.logo = driver.findElement(By.className("app_logo"));
        this.shopContainer = driver.findElement(By.className("shopping_cart_link"));
    }

   public void clickOnMenuBar(){
        this.menuBar.click();
   }

   public void clickOnShopContainer(){
        this.shopContainer.click();
   }

}
