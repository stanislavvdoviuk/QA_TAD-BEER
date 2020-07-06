package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import testingData.Admin;

public class SignUpPage {
    protected WebDriver driver;
    private By nameField = By.cssSelector("#Name");
    private By phoneField=By.cssSelector("#Phone");
    private By emailField=By.cssSelector("#Username");
    private By passwordField=By.cssSelector("#Password");
    private By confirmationPasswordField=By.cssSelector("#ConfirmPassword");
    private By signUpButton=By.cssSelector("div.form-group.text-center.mb0 > button");
    private By alertMessege=By.cssSelector(".alert.alert-danger");

    public SignUpPage(WebDriver driver)  {
        this.driver=driver;
    }

    public WebElement getNameField(){return  driver.findElement(nameField);}

    public WebElement getPhoneField(){return  driver.findElement(phoneField);}

    public WebElement getEmailField(){return  driver.findElement(emailField);}

    public WebElement getPasswordField(){return  driver.findElement(passwordField);}

    public WebElement getConfirmationPasswordField(){return  driver.findElement(confirmationPasswordField);}

    public WebElement getSignUpButton(){return  driver.findElement(signUpButton);}

    public WebElement getAlertMessege(){return driver.findElement(alertMessege);}


//    public void signUp(Admin admin) {
//            getNameField().click();
//            getNameField().sendKeys(admin.Name());
//
//            getPhoneField().click();
//            getPhoneField().sendKeys(admin.PhoneNumber());
//
//            getEmailField().click();
//            getEmailField().sendKeys(admin.Email());
//
//            getPasswordField().click();
//            getPasswordField().sendKeys(admin.Password());
//
//            getConfirmationPasswordField().click();
//            getConfirmationPasswordField().sendKeys(admin.Password());
//
//            getSignUpButton().click();
//    }
}
