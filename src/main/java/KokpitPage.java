import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KokpitPage {
    WebDriver driver;

    @FindBy(css="a[title='Wyloguj']")
    private WebElement logoutButton;

    public KokpitPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLogoutButton(){
        logoutButton.click();
    }
}
