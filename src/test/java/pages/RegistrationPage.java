package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    protected WebDriver driver;
    private By emailField=By.cssSelector("#Username");
    private By passwordField=By.cssSelector("#Password");
    private By signUpButtton = By.cssSelector(".text-center>p:nth-child(2) > a");
    private By signInButton=By.cssSelector("div.form-group.text-center.mb0 > button");

    public RegistrationPage(WebDriver driver)  {
        this.driver=driver;
    }
    public WebElement getSignUpButtton(){return  driver.findElement(signUpButtton);}
    public void clickSignUpButton(){ getSignUpButtton().click();}
    public WebElement getEmailField(){return  driver.findElement(emailField);}
    public WebElement getPasswordField(){return  driver.findElement(passwordField);}
    public WebElement getSignInButton(){return  driver.findElement(signInButton);}
    public void signInUser(String email, String password)
    {
        getEmailField().click();
        getEmailField().sendKeys(email);

        getPasswordField().click();
        getPasswordField().sendKeys(password);

        getSignInButton().click();
    }
}
