package com.company.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    private WebDriver driver;
    private List<WebElement> items;
    private  WebElement title;
    private WebElement robotImage;
    private WebElement sortMenu;

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.items = driver.findElements(By.className("inventory_item"));
        this.title = driver.findElement(By.className("title"));
        this.robotImage = driver.findElement(By.className("peek"));
        this.sortMenu = driver.findElement(By.className("product_sort_container"));
    }
}
