package com.company.swaglabs.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    private WebDriver driver;
    @FindBy(id="react-burger-menu-btn")  //react-burger-cross-btn
    private WebElement menuBar;
    @FindBy(id = "react-burger-cross-btn")
    private WebElement closeMenuBar;

    public WebElement getCloseMenuButton() {
        return closeMenuBar;
    }

    @FindBy(className="app_logo")
    private WebElement logo;
    @FindBy(className="shopping_cart_link")
    private WebElement shopContainer;

    public WebElement getShopContainer() {
        return shopContainer;
    }

    public Header(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

   public WebElement getMenuBar(){

        return this.menuBar;
   }

   public void clickOnShopContainer(){
        this.shopContainer.click();
   }

   public  WebElement getLogo(){
        return logo;
   }

}
