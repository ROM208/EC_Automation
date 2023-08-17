package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShareWishlistTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    AccountPage accountPage;
    TVPage tvPage;
    WishlistPage wishlistPage;
    ShareWishlistPage shareWishlistPage;

    @Test
    public void TestShareWishList()
    {
        homePage=new HomePage(driver);
        homePage.Open_login_CreateAccPage();
        loginPage=new LoginPage(driver);
        loginPage.LogIn("roma89@mail.com","000000");
        accountPage=new AccountPage(driver);
        accountPage.Open_TvPage();
        tvPage=new TVPage(driver);
        tvPage.AddWishlist();
        wishlistPage=new WishlistPage(driver);
        wishlistPage.Open_ShareWishlistPage();
        shareWishlistPage=new ShareWishlistPage(driver);
        shareWishlistPage.shareWishlist();
        Assert.assertEquals(wishlistPage.sucMsg.getText(),"Your Wishlist has been shared.");
    }
}
