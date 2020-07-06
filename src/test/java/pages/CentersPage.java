package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CentersPage {
    protected WebDriver driver;
    private By searchField=By.cssSelector("div > input");
    private By centerCard=By.cssSelector(".right-side .center-card");
    private By searchResultNumber=By.cssSelector("div.left-side > div > div > h3");

    public CentersPage(WebDriver driver)  {
        this.driver=driver;
    }

    public WebElement getSearchField(){return  driver.findElement(searchField);}

    public void setSearchField(String searchData){
        getSearchField().click();
        getSearchField().sendKeys(searchData);
    }
    public WebElement getCenterCards(){return  driver.findElement(centerCard);}

    public void setCenterCard(By centerCard) {
        this.centerCard = centerCard;
    }

    public List<WebElement> getProductElements() {
        return  driver.findElements(centerCard);
    }

    public WebElement getSearchResultNumber(){return  driver.findElement(searchResultNumber);}
}
