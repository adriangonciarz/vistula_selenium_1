import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver driver;
    private final static String LOGIN = "administrator@testarena.pl";
    private final static String PASSWORD = "sumXQQ72$L";
    private LoginPage loginPage;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage.open();
    }

    @Test
    public void shouldSuccessfullyLogin() throws Exception {
        loginPage.setEmail(LOGIN);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isLogoutButtonDisplayed());
    }

    @Test
    public void shouldNotSuccessfullyLoginWithWrongPassword() throws Exception {
        loginPage.setEmail(LOGIN);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isLoginButtonDisplayed());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
