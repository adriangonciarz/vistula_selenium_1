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
    private String baseUrl = "http://demo.testarena.pl/zaloguj";

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void shouldSuccessfullyLogin() throws Exception {
        driver.findElement(By.id("email")).sendKeys("administrator@testarena.pl");
        driver.findElement(By.id("password")).sendKeys("sumXQQ72$L");
        driver.findElement(By.id("login")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("a[title='Wyloguj']")).isDisplayed());
    }

    @Test
    public void shouldNotSuccessfullyLoginWithWrongPassword() throws Exception {
        driver.findElement(By.id("email")).sendKeys("administrator@testarena.pl");
        driver.findElement(By.id("password")).sendKeys("wrongpwd");
        driver.findElement(By.id("login")).click();
        Assert.assertTrue(driver.findElement(By.id("login")).isDisplayed());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
