import org.junit.Test;

public class LoginTest extends TestBase {
    private final static String LOGIN = "administrator@testarena.pl";
    private final static String PASSWORD = "sumXQQ72$L";


    @Test
    public void shouldSuccessfullyLogin() throws Exception {
        loginPage.setEmail(LOGIN);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
    }

    @Test
    public void shouldNotSuccessfullyLoginWithWrongPassword() throws Exception {
        loginPage.setEmail(LOGIN);
        loginPage.setPassword("worngpwd");
        loginPage.clickLoginButton();
    }
}
