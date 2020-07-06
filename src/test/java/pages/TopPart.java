package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopPart {
    protected WebDriver driver;
    private By homeButton=By.cssSelector("div.main-header__nav-container > ul > li:nth-child(1) > a");
    private By centersButton=By.cssSelector("div.main-header__nav-container > ul > li:nth-child(2) > a");
    private By registerButton = By.cssSelector(".btn.register-btn");
    private By enButton= By.cssSelector("#EN");
    private By arButton= By.cssSelector("#AR");

    public TopPart(WebDriver driver)  {
        this.driver=driver;
    }

    public WebElement getRegisterButton(){return  driver.findElement(registerButton);}
    public void clickRegisterButton(){ getRegisterButton().click();}

    public WebElement getHomeButton(){return  driver.findElement(homeButton);}
    public void clickHomeButton(){ getHomeButton().click();}

    public WebElement getCentersButton(){return  driver.findElement(centersButton);}
    public void clickCentersButton(){ getCentersButton().click();}


    public WebElement getEnButton(){return  driver.findElement(enButton);}
    public void clickEnButton(){ getEnButton().click();}

    public WebElement getArButton(){return  driver.findElement(arButton);}
    public void clickArButton(){ getArButton().click();}

}
