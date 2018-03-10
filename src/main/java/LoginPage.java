import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private final static String URL = "http://demo.testarena.pl/zaloguj";

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get(URL);
    }

    public void setEmail(String email){
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(By.id("login")).click();
    }

    public Boolean isLogoutButtonDisplayed(){
        return driver.findElement(By.cssSelector("a[title='Wyloguj']")).isDisplayed();
    }

    public Boolean isLoginButtonDisplayed(){
        return driver.findElement(By.id("login")).isDisplayed();
    }
}
