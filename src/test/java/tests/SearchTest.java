package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CentersPage;
import pages.TopPart;

import java.util.List;

public class SearchTest extends LocalTestRunner {
    @Test(description = "")
    public void searchFieldInCenters() throws InterruptedException {
        String search="Dubai";
        Thread.sleep(5000);
        TopPart topPart = new TopPart(getDriver());
        topPart.clickCentersButton();
        Thread.sleep(5000);
        CentersPage centersPage=new CentersPage(getDriver());
        centersPage.setSearchField(search);
        List<WebElement> centersPageProductElements = centersPage.getProductElements();
        Thread.sleep(5000);

        for (WebElement el: centersPageProductElements) {
            Assert.assertTrue(centersPageProductElements.contains(search));
        }

        Thread.sleep(5000);

    }
    @Test
    public void searchFilterTest() throws InterruptedException {
    CentersPage centersPage=new CentersPage(getDriver());
    
    }
}
