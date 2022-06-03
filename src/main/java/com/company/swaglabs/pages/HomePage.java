package com.company.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class HomePage extends BasePage{
    private WebDriver driver;
    @FindBy(className="inventory_item")
    private List<WebElement> items;
    @FindBy(className="inventory_item_img")
    private List<WebElement> itemsPictures;
    @FindBy(className="item_0_title_link")
    private List<WebElement> itemsTitles;
    @FindBy(className="inventory_item_price")
    private List<WebElement> itemsPrice;
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    private List <WebElement> addToCardButtons;
    @FindBy(id="remove-sauce-labs-bike-light")
    private List<WebElement> removeButtons;
    @FindBy(className="title")
    private WebElement title;
    @FindBy(className="peek")
    private WebElement robotImage;
    @FindBy(className="product_sort_container")
    private WebElement sortMenu;
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBar;
    @FindBy(className = "inventory_item_desc")
    private List<WebElement> itemsDescriptions;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    public List<WebElement> getItemsPictures() {
        return itemsPictures;
    }

    public List<WebElement> getItemsTitles() {
        return itemsTitles;
    }

    public List<WebElement> getItemsPrice() {
        return itemsPrice;
    }

    public List<WebElement> getAddToCardButtons() {
        return addToCardButtons;
    }

    public List<WebElement> getRemoveButtons() {
        return removeButtons;
    }

    public List<WebElement> getItemsDescriptions() {
        return itemsDescriptions;
    }

    public WebElement getMenuBar() {
        return menuBar;
    }



    public List<WebElement> getItems() {
        return this.items;
    }
    public WebElement getItems(int index) {
        if(index >= this.items.size() || index < 0)
            return null;
        return this.items.get(index);
    }

    public WebElement getItemsPictures(int index) {
        if(index >= this.itemsPictures.size() || index < 0)
            return null;
        return itemsPictures.get(index);
    }

    public WebElement getItemsTitles(int index) {
        if(index >= this.itemsTitles.size() || index < 0)
            return null;
        return itemsTitles.get(index);
    }

    public WebElement getItemsPrice(int index) {
        if(index >= this.itemsPrice.size() || index < 0)
            return null;
        return itemsPrice.get(index);
    }

    public WebElement getAddToCardButtons(int index) {
        if(index >= this.addToCardButtons.size() || index < 0)
            return null;
        return addToCardButtons.get(index);
    }

    public WebElement getRemoveButtons(int index) {
        if(index >= this.removeButtons.size() || index < 0)
            return null;
        return removeButtons.get(index);
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getRobotImage() {
        return robotImage;
    }

    public WebElement getSortMenu() {
        return sortMenu;
    }

}

