package com.company.swaglabs.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Footer {
    private WebDriver driver;
    private List<WebElement> socialLinks;
    private WebElement footerRobot;
    private WebElement footerText;

    public Footer (WebDriver driver){
        this.driver = driver;
        this.socialLinks = driver.findElements(By.cssSelector("[target='_blank']"));
        this.footerRobot = driver.findElement(By.className("footer_robot"));
        this.footerText = driver.findElement(By.className("footer_copy"));
    }

    public void clickOnTwitter(){
        this.socialLinks.get(0).click();
    }
    public void clickOnFaceBook(){
        this.socialLinks.get(1).click();
    }
    public void clickOnLinkedIn(){
        this.socialLinks.get(2).click();
    }

    public String footerTex(){
        return this.footerText.getText();
    }
}
