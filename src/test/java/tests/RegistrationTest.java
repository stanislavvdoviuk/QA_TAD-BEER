package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProfilePage;
import pages.RegistrationPage;
import pages.SignUpPage;
import pages.TopPart;

public class RegistrationTest extends LocalTestRunner {
    @Test(description = "Verify if alert messege appear if user set incorrect data.")
    public void checkRegistrationButton() throws InterruptedException {
        TopPart topPart = new TopPart(getDriver());
        topPart.clickRegisterButton();
        Thread.sleep(5000);

        for(String registerPage : getDriver().getWindowHandles()){
            getDriver().switchTo().window(registerPage);
        }
        RegistrationPage registrationPage=new RegistrationPage(getDriver());
        registrationPage.clickSignUpButton();
        Thread.sleep(5000);
        SignUpPage signUpPage=new SignUpPage(getDriver());
        signUpPage.signUp("admin","0512345854","admin@admin.com","password");
        Assert.assertTrue(signUpPage.getAlertMessege().isDisplayed());
    }

    @Test(description = "Verify if user is registered.")
    public void registerNewUser() throws InterruptedException {
        TopPart topPart = new TopPart(getDriver());
        topPart.clickRegisterButton();
        Thread.sleep(5000);

        for(String registerPage : getDriver().getWindowHandles()){
            getDriver().switchTo().window(registerPage);
        }
        RegistrationPage registrationPage=new RegistrationPage(getDriver());
        registrationPage.clickSignUpButton();
        Thread.sleep(5000);
        SignUpPage signUpPage=new SignUpPage(getDriver());
        //signUpPage.signUp("admin","0512345854","admin@admin.com","Password123!");
        Assert.assertTrue(signUpPage.getAlertMessege().isDisplayed());
        Thread.sleep(10000);
    }

    @Test(description = "Verify if user is sign in successfully.")
    public void signInTest() throws InterruptedException {
        TopPart topPart = new TopPart(getDriver());
        WebDriverWait wait = new WebDriverWait(getDriver(),50);
        topPart.clickRegisterButton();
        Thread.sleep(5000);
        String mainPage = getDriver().getWindowHandle();
        for(String registerPage : getDriver().getWindowHandles()){
            getDriver().switchTo().window(registerPage);
        }
        RegistrationPage registrationPage=new RegistrationPage(getDriver());
        registrationPage.signInUser("admin@admin.com","Password123!");
        Thread.sleep(5000);
        getDriver().switchTo().window(mainPage);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.register-btn")));
        Assert.assertEquals(topPart.getRegisterButton().getText(),"Admin");
        Thread.sleep(5000);
    }
    @Test
    public void logOutTest() throws InterruptedException {
        TopPart topPart= new TopPart(getDriver());
        topPart.clickRegisterButton();
        Thread.sleep(5000);
        String mainPage = getDriver().getWindowHandle();
        for(String registerPage : getDriver().getWindowHandles()){
            getDriver().switchTo().window(registerPage);
        }
        RegistrationPage registrationPage=new RegistrationPage(getDriver());
        registrationPage.signInUser("admin@admin.com","Password123!");
        Thread.sleep(5000);
        getDriver().switchTo().window(mainPage);
        topPart.clickRegisterButton();
        Thread.sleep(5000);
        ProfilePage profilePage= new ProfilePage(getDriver());
        profilePage.clickLogOutButton();
        Assert.assertEquals(topPart.getRegisterButton().getText(),"Register");
    }
}
