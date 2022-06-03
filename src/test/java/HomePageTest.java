import com.company.swaglabs.constants.ItemsTexts;
import com.company.swaglabs.pages.BasePage;
import com.company.swaglabs.pages.HomePage;
import com.company.swaglabs.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.company.swaglabs.constants.LogInData.*;

public class HomePageTest extends BaseTest {

    @BeforeMethod
    public void login() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.logIn(STANDARD_USER);
    }

    @Test
    public void itemsImages() {
        HomePage homePage = new HomePage(getDriver());
        for (int i = 0; i < homePage.getItems().size(); i++) {
            act.isDisplayed(homePage.getItems(i));
        }
    }

    @Test
    public void menuBar() {
        BasePage basePage = new BasePage(getDriver());
        act.isDisplayed(basePage.getHeader().getMenuBar());
        act.click(basePage.getHeader().getMenuBar());
        act.isDisplayed(basePage.getHeader().getCloseMenuButton());
        act.click(basePage.getHeader().getCloseMenuButton());

    }

    @Test
    public void itemsDescriptions() {
        HomePage homePage = new HomePage(getDriver());
        for (int i = 0; i < homePage.getItems().size(); i++) {
            Assert.assertEquals(homePage.getItemsDescriptions().get(i).getText(), ItemsTexts.getItemsTexts()[i].getDescription());
        }

    }
}

/*
    @Test
    public void filterZa() {
        HomePage homePage = new HomePage(getDriver());
        homePage.getZa().click();
        for (int i = 1; i < homePage.itemNames().size(); i++) {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
            wait.until(ExpectedConditions.visibilityOf(homePage.itemNames().get(i)));
            if (i != 0) {
                int b = homePage.itemNames().get(i).getText().compareTo(homePageClass.itemNames().get(i - 1).getText());
                if (b <= 0) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
        }
    }
}
*/


//    @Test
//    public void filterAz() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.getAz().click();
//        for (int i = 1; i < homePage.itemNames().size(); i++) {
//            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
//            wait.until(ExpectedConditions.visibilityOf(homePage.itemNames().get(i)));
//            if (i != 0) {
//                int b = homePage.itemNames().get(i).getText().compareTo(homePageClass.itemNames().get(i - 1).getText());
//                if (b >= 0) {
//                    System.out.println(true);
//                } else {
//                    System.out.println(false);
//                }
//            }
//        }
//    }

//    @Test
//    public void filterLowToHigh() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.getLowToHigh().click();
//        for (int i = 1; i < homePage.getItemsPrices().size(); i++) {
//            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
//            wait.until(ExpectedConditions.visibilityOf(homePage.getItemsPrices().get(i)));
//            double b = Double.parseDouble(homePage.getItemsPrices().get(i).getText().substring(1));
//            double a = Double.parseDouble(homePage.getItemsPrices().get(i - 1).getText().substring(1));
//            if (a <= b) {
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }
//        }
//    }

//    @Test
//    public void filterHighToLow() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.getHighToLow().click();
//        for (int i = 1; i < homePage.getItemsPrices().size(); i++) {
//            new WebDriverWait(getDriver(), Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOf(homePage.getItemsPrices().get(i)));
//
//            double b = Double.parseDouble(homePage.getItemsPrices().get(i).getText().substring(1));
//            double a = Double.parseDouble(homePage.getItemsPrices().get(i - 1).getText().substring(1));
//            if (a >= b) {
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }
//        }
//    }

   // @Test
//    public void addToCart() {
//        HomePage homePage = new HomePage(getDriver());
//        try {
//            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
//            wait.until(ExpectedConditions.elementToBeClickable(homePage.getAddToCart()));
//            Assert.assertTrue(homePage.getAddToCart().isDisplayed());
//            homePage.getAddToCart().click();
//        } catch (Exception e) {
//            System.out.println("add to cart button is not working");
//        }
//
//
//    }

