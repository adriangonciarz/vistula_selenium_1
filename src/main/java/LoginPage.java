import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "email")
    WebElement emailTextField;

    @FindBy(id = "password")
    WebElement passwordTextField;

    @FindBy(css = "#remember")
    WebElement rememberCheckbox;

    @FindBy(id = "login")
    WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get("http://demo.testarena.pl/zaloguj");
    }

    public void setEmail(String email){
        emailTextField.sendKeys(email);
    }

    public void setPassword(String password){
        passwordTextField.sendKeys(password);
    }

    public void setRemember(){
        rememberCheckbox.click();
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
