package com.company.swaglabs.pages;
import com.company.swaglabs.constants.LogInData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

import static com.company.swaglabs.wrappedelement.MyElement.*;
import static com.company.swaglabs.constants.LogInData.*;

public class LoginPage {
        private WebDriver driver;
        @FindBy(className = "login_logo")
        private WebElement logo;
        @FindBy(className = "bot_column")
        private WebElement icon;
        @FindBy(id="user-name")
        private WebElement userNameSpace;
        @FindBy(id="password")
        private WebElement passWordSpace;
        @FindBy(id="login-button")
        private WebElement loginButton;
        @FindBy (className="error-message-container")
        private WebElement errorMessage;
        @FindBy(className = "fa-times")
        private WebElement closeErrorButton;

        public LoginPage(WebDriver driver){

                this.driver = driver;
                this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                PageFactory.initElements(driver, this);
        }


        public WebElement getIcon() {
                return icon;
        }

        public void logIn(LogInData userName){
                fill(this.userNameSpace, userName.toString());
                fill(this.passWordSpace, PASSWORD.toString());
                loginButton.click();
        }

        public WebElement getErrorButton() {
                return errorMessage;
        }

        public WebElement getLogo(){
                return this.logo;
        }


        public WebElement closeErrorMessage(){
                return closeErrorButton;
        }
      //  public boolean is

}
