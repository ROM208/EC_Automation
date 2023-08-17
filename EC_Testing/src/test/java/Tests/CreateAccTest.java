package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    CreateAccountPage createAccountPage;
    AccountPage accountPage;

    @Test
    public void TestCreateAccount()
    {
        homePage=new HomePage(driver);
        homePage.Open_login_CreateAccPage();
        loginPage=new LoginPage(driver);
        loginPage.Open_CreateAccPage();
        createAccountPage=new CreateAccountPage(driver);
        createAccountPage.CreateAccount("mariam","ashraf","ragab","roma89@mail.com","000000","000000");
        accountPage=new AccountPage(driver);
        Assert.assertEquals(accountPage.title.getText(),"MY DASHBOARD");
        Assert.assertTrue(accountPage.sucMsg.getText().contains("Thank you for registering"));
    }

}
