import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {
    WebDriver driver = new FirefoxDriver();
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    @Before
    public void setUp() throws Exception {
        loginPage.open();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
