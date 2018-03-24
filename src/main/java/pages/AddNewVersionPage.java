package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewVersionPage {
    WebDriver driver;

    @FindBy(id = "name")
    WebElement nameField;

    @FindBy(id = "description")
    WebElement descriptionField;

    @FindBy(id = "save")
    WebElement saveButton;

    public AddNewVersionPage(WebDriver driver){
        this.driver = driver;
    }

    public void createVersion(String name,
                              String description){
        nameField.sendKeys(name);
        descriptionField.sendKeys(description);
        saveButton.click();
    }
}
