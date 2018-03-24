import org.junit.Test;

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
