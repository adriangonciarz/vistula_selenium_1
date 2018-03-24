package Base;


import org.openqa.selenium.WebDriver;
import pages.AddNewVersionPage;
import pages.KokpitPage;
import pages.LoginPage;
import pages.VersionsPage;

public class TestBase {
    public WebDriver driver;
    public LoginPage loginPage;
    public KokpitPage kokpitPage;
    public VersionsPage versionsPage;
    public AddNewVersionPage addNewVersionPage;
}
