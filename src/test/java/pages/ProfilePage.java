package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
    protected WebDriver driver;
    private By logOutButton = By.cssSelector(" div.left-side > ul > li.logout-btn");
    private By editButton=By.cssSelector(".profile-edit-buttons");
    private By saveButton=By.cssSelector("div.profile-edit-buttons > button:nth-child(1)");
    private By cancelButton=By.cssSelector("div.profile-edit-buttons > button:nth-child(2)");
    private By editNameField=By.cssSelector("div.my-profile__hero--edit-name > label > input[type=text]");
    private By editCountryField=By.cssSelector("div.my-profile__hero--title > div:nth-child(1)");
    private By editPhoneNumberField=By.cssSelector("div.my-profile__hero--title > div:nth-child(2)");
    private By nameField=By.cssSelector(" div.my-profile__hero-header > h1");
    private By countryField=By.cssSelector("");
    private By emailField=By.cssSelector("");
    private By phoneNumberField=By.cssSelector("");

    public ProfilePage(WebDriver driver)  {
        this.driver=driver;
    }

    public WebElement getNameField(){return driver.findElement(nameField);}

    public WebElement getEditButton(){return  driver.findElement(editButton);}
    public void clickEditButton(){ getEditButton().click();}

    public WebElement getSaveButton(){return  driver.findElement(saveButton);}
    public void clickSaveButton(){ getSaveButton().click();}

    public WebElement getCancelButton(){return  driver.findElement(cancelButton);}
    public void clickCancelButton(){ getCancelButton().click();}

    public WebElement getLogOutButton(){return  driver.findElement(logOutButton);}
    public void clickLogOutButton(){ getLogOutButton().click();}

    public WebElement getEditNameField(){return  driver.findElement(editNameField);}
    public void setEditNameField(String name){
        getEditNameField().click();
        getEditNameField().clear();
        getEditNameField().sendKeys(name);
    }
}
