import org.junit.Test;

public class VersionsTest extends TestBase {
    @Test
    public void addNewVersion() throws InterruptedException {
        loginPage.setEmail("administrator@testarena.pl");
        loginPage.setPassword("sumXQQ72$L");
        loginPage.clickLoginButton();
        kokpitPage.goToVersions();
        versionsPage.gotToAddNewVersion();
        String randomName = "name" + System.nanoTime();
        String randomDescription = "description" + System.nanoTime();
        addNewVersionPage.createVersion(randomName, randomDescription);
    }
}
