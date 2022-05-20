package com.company.swaglabs.pages;
import com.company.swaglabs.constants.LogInData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class LoginPage {
        WebDriver driver;
        WebElement loginPageLogo;
        WebElement loginPageIcon;
        WebElement userNameSpace;
        WebElement passWordSpace;
        WebElement loginButton;

        LoginPage(WebDriver driver){
                this.driver = driver;
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                loginPageLogo = this.driver.findElement(By.className("login_logo"));
                loginPageIcon = this.driver.findElement(By.className("bot_column"));
                passWordSpace = this.driver.findElement(By.id("password"));
                userNameSpace = this.driver.findElement(By.id("user-name"));
                loginButton = this.driver.findElement(By.id("login-button"));
        }

        public  void checkPageElements() {
                Assert.assertTrue(this.loginPageIcon.isDisplayed(), "The login page icon is not displayed");
                Assert.assertTrue(this.loginPageLogo.isDisplayed(), "Login page logo is not displayed");
                Assert.assertTrue(this.userNameSpace.isDisplayed(), "Username space is not displayed");
                Assert.assertTrue(this.passWordSpace.isDisplayed(), "Password space is not displayed");
                Assert.assertTrue(this.loginButton.isDisplayed(), "Login button is not displayed");
        }

        public void logIn(){
                this.userNameSpace.sendKeys(LogInData.STANDARD_USER.toString());
                this.passWordSpace.sendKeys(LogInData.PASSWORD.toString());
                this.loginButton.click();
        }



}
