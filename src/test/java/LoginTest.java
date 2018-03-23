import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class LoginTest extends TestBase{
    @Test
    public void successfulLogin() throws Exception{
        loginPage.setEmail("administrator@testarena.pl");
        loginPage.setPassword("sumXQQ72$L");
        loginPage.setRemember();
        Thread.sleep(3000);
        loginPage.clickLoginButton();
        kokpitPage.clickLogoutButton();
    }
}
