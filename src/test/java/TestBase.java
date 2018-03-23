import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {
    WebDriver driver;
    LoginPage loginPage;
    KokpitPage kokpitPage;
    VersionsPage versionsPage;
    AddNewVersionPage addNewVersionPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\bin\\geckodriver.exe");
        driver = new FirefoxDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        kokpitPage = PageFactory.initElements(driver, KokpitPage.class);
        versionsPage = PageFactory.initElements(driver, VersionsPage.class);
        addNewVersionPage = PageFactory.initElements(driver, AddNewVersionPage.class);
        loginPage.open();
    }

    @After
    public void close(){
        driver.quit();
    }
}
