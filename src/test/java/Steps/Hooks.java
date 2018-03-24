package Steps;

import Base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.AddNewVersionPage;
import pages.KokpitPage;
import pages.LoginPage;
import pages.VersionsPage;

public class Hooks extends TestBase{
    private TestBase base;

    public Hooks(TestBase base){
        this.base = base;
    }

    @Before
    public void setUp(){
//        System.setProperty("webdriver.gecko.driver", "C:\\bin\\geckodriver.exe");
        base.driver = new FirefoxDriver();
        base.loginPage = PageFactory.initElements(base.driver, LoginPage.class);
        base.kokpitPage = PageFactory.initElements(base.driver, KokpitPage.class);
        base.versionsPage = PageFactory.initElements(base.driver, VersionsPage.class);
        base.addNewVersionPage = PageFactory.initElements(base.driver, AddNewVersionPage.class);
    }

    @After
    public void close(){
        base.driver.quit();
    }
}
