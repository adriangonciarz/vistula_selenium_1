import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VersionsPage {
    WebDriver driver;

    @FindBy(css = "a[href*='add_version']")
    WebElement addNewVersionButton;

    public void gotToAddNewVersion(){
        addNewVersionButton.click();
    }

}
