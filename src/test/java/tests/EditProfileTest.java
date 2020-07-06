package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProfilePage;
import pages.RegistrationPage;
import pages.TopPart;

public class EditProfileTest extends LocalTestRunner{
    @Test
    public void editProfile() throws InterruptedException {
        String newName="Admin4";
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
        Thread.sleep(7000);
        ProfilePage profilePage= new ProfilePage(getDriver());
        profilePage.clickEditButton();
        profilePage.setEditNameField(newName);
        profilePage.clickSaveButton();
        Thread.sleep(5000);
        Assert.assertTrue(profilePage.getNameField().getText().equalsIgnoreCase(newName));
    }
}
