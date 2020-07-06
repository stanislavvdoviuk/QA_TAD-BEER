package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LowerPart {
    protected WebDriver driver;
    private By registerButton = By.cssSelector("div.right-side > div > a");
    private By copyrights= By.cssSelector("div.main-footer__copyright");

    public LowerPart(WebDriver driver)  {
        this.driver=driver;
    }

    public WebElement getRegisterButton(){return  driver.findElement(registerButton);}
    public void clickRegisterButton(){ getRegisterButton().click();}

    public WebElement getCopyrights(WebDriver driver){return  driver.findElement(copyrights);}

}
