import com.company.swaglabs.wrappedelement.MyElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    MyElement act;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.get("https://www.saucedemo.com/");
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.act = new MyElement(this.driver);
        try{
            driver.getTitle();
        }catch (Exception e){
            System.out.println(e + "page is not opened");
        }
        finally {
            System.out.println("Page <<" + driver.getTitle() + ">> is opened");
        }
    }

    @AfterMethod
    public void exit() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
