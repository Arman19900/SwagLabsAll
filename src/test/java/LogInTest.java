import com.company.swaglabs.pages.HomePage;
import com.company.swaglabs.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.company.swaglabs.wrappedelement.MyElement.*;
import static com.company.swaglabs.constants.LogInData.*;

public class LogInTest extends BaseTest{


    @Test
    public void checkLogoAndIcon(){
        LoginPage loginPage = new LoginPage(getDriver());
            Assert.assertTrue(isDisplayed(loginPage.getLogo()), "The logo is not displayed");
            Assert.assertTrue(isDisplayed(loginPage.getIcon()), "The icon is not displayed");
    }


    @Test
    public void standardLogin() {
        LoginPage loginPage = new LoginPage(getDriver());
            loginPage.logIn(STANDARD_USER);
            HomePage homePage = new HomePage(getDriver());
            Assert.assertTrue(isDisplayed(homePage.getItems(0)), "The page is not logged in.");

    }
    @Test
    public void lockedOutUserLogin() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.logIn(LOCKED_OUT_USER);
        Assert.assertEquals(loginPage.getErrorButton().getText(), "Epic sadface: Sorry, this user has been locked out.");
        act.click(loginPage.closeErrorMessage());

    }
    @Test
    public void problemUserLogin(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.logIn(PROBLEM_USER);
        HomePage homePage = new HomePage(getDriver());
        Assert.assertTrue(isDisplayed(homePage.getItems(0)), "The page is not logged in");

    }
    @Test
    public void performanceGlitchUserLogin(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.logIn(PERFORMANCE_GLITCH_USER);
        HomePage homePage = new HomePage(getDriver());
        Assert.assertTrue(isDisplayed(homePage.getItems(0)), "The page is not logged in");

    }





}
