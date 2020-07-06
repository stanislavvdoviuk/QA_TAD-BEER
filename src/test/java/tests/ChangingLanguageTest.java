package tests;

        import org.openqa.selenium.By;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Assert;
        import org.testng.annotations.Test;
        import pages.LowerPart;
        import pages.TopPart;
        import testingData.LanguageData;

public class ChangingLanguageTest extends LocalTestRunner {
    @Test(description = "")
    public void changeLanguage() throws InterruptedException {
        TopPart topPart = new TopPart(getDriver());
        WebDriverWait wait = new WebDriverWait(getDriver(),5);
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#EN")));
        topPart.clickArButton();
        Thread.sleep(7000);
   //     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".active #AR")));
        LowerPart lowerPart=new LowerPart(getDriver());
        Assert.assertEquals(lowerPart.getCopyrights(getDriver()).getText(), LanguageData.AR_COPYRIGHT.toString());
        //Thread.sleep(5000);
    }
}
