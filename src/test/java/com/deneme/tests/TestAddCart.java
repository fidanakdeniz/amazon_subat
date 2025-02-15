package com.deneme.tests;
import com.deneme.driver.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestAddCart extends Driver {

    @Test
    void amazonLogin() {

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com.tr/";
        Assertions.assertEquals(expectedUrl, currentUrl,
                "Geçerli sayfa Amazon anasayfası değil.");
        homePage.isCookieButtonVisible();
        homePage.isCookieButtonClickable();
        homePage.clickCookieButton();

        Assertions.assertTrue(homePage.isCartButtonVisible(), "Sepet butonu görünmüyor.");
        Assertions.assertTrue(homePage.isCartButtonClickable(), "Sepet butonu tıklanabilir değil.");
        String actualCartText = homePage.getCartTextDisplay();
        Assertions.assertTrue(actualCartText.contains(homePage.expectedCartText),
                "Sepet yazısı yanlış: Beklenen: " + homePage.expectedCartText + ", Bulunan: " + actualCartText);

        Assertions.assertTrue(homePage.isOrdersButtonVisible(), "Siparişler butonu görünmüyor.");
        Assertions.assertTrue(homePage.isOrdersButtonClickable(), "Siparişler butonu tıklanabilir değil.");
        String actualOrdersText = homePage.getOrdersTextDisplay();
        Assertions.assertTrue(actualOrdersText.contains(homePage.expectedOrdersText),
                "Siparişler yazısı yanlış: Beklenen: " + homePage.expectedOrdersText + ", Bulunan: " + actualOrdersText);

        Assertions.assertTrue(homePage.isBestSellersButtonVisible(), "Çok Satanlar butonu görünmüyor.");
        Assertions.assertTrue(homePage.isBestSellersButtonClickable(), "Çok Satanlar butonu tıklanabilir değil.");
        String actualBestSellersText = homePage.getBestSellersTextDisplay();
        Assertions.assertEquals(homePage.expectedBestSellersText, actualBestSellersText,
                "Çok Satanlar yazısı yanlış: Beklenen: " + homePage.expectedBestSellersText + ", Bulunan: " + actualBestSellersText);

        Assertions.assertTrue(homePage.isTodaysDealsButtonVisible(), "Günün Fırsatları butonu görünmüyor.");
        Assertions.assertTrue(homePage.isTodaysDealsButtonClickable(), "Günün Fırsatları butonu tıklanabilir değil.");
        String actualTodaysDealsText = homePage.getTodaysDealsTextDisplay();
        Assertions.assertEquals(homePage.expectedTodaysDealsText, actualTodaysDealsText,
                "Günün Fırsatları yazısı yanlış: Beklenen: " + homePage.expectedTodaysDealsText + ", Bulunan: " + actualTodaysDealsText);

        // Yeni Çıkanlar butonu doğrula
        Assertions.assertTrue(homePage.isNewReleasesButtonVisible(), "Yeni Çıkanlar butonu görünmüyor.");
        Assertions.assertTrue(homePage.isNewReleasesButtonClickable(), "Yeni Çıkanlar butonu tıklanabilir değil.");
        String actualNewReleasesText = homePage.getNewReleasesTextDisplay();
        Assertions.assertEquals(homePage.expectedNewReleasesText, actualNewReleasesText,
                "Yeni Çıkanlar yazısı yanlış: Beklenen: " + homePage.expectedNewReleasesText + ", Bulunan: " + actualNewReleasesText);

        String actualGuestAccountText = homePage.getAccountTextDisplay();
        Assertions.assertEquals(homePage.expectedGuestAccountText, actualGuestAccountText,
                "Hesap girişi metni beklendiği gibi değil veya bulunamadı.");
        /*homePage.isLoginButtonClickable();
        homePage.isLoginButtonVisible();
        homePage.clickLoginButton();
        loginPage.isEmailTextboxClickable();
        loginPage.isEmailTextBoxVisible();
        loginPage.sendEmailTextBox("ceydaulux@gmail.com");*/

        homePage.isSearchBoxVisible();
        homePage.isSearchBoxClickable();
        homePage.clickSearchBox();
        homePage.sendSearchBox("airpods");
        homePage.pressEnterSearchBox();

        Assertions.assertEquals(categoryPage.expectedResultsText, categoryPage.getResultsTextDisplay(),
                "Kategori sayfası açılamadı.");
        Assertions.assertEquals(categoryPage.expectedSearchText, categoryPage.getSearchTextDisplay(),
                "Kategori sayfasına aratılan ürün doğru aratılmadı.");
        categoryPage.scrollPage();
        categoryPage.isSelectProductVisible();
        categoryPage.isSelectProductClickable();
        String productTitle = categoryPage.getProductTitle();
        //System.out.println("Ürün Başlığı: " + productTitle);
        categoryPage.clickSelectProduct();
        categoryPage.scrollAUpPage();
        categoryPage.waitbymilliseconds();
        cartPage.isCartIconVisible();
        cartPage.isCartIconClickable();
        cartPage.waitbymilliseconds();
        cartPage.clickCartIcon();

        cartPage.isBuyButtonVisible();
        cartPage.isBuyButtonClickable();
        cartPage.clickBuyButton();

        /*String actualLoginPageText = loginPage.getLoginPageTextDisplay();*/
        /*Assertions.assertEquals(loginPage.expectedLoginPageText, actualLoginPageText,
                "Giriş Yap-Email sayfası beklendiği gibi değil veya bulunamadı.");*/
        loginPage.isEmailTextboxClickable();
        loginPage.isEmailTextBoxVisible();
        loginPage.sendEmailTextBox("ceydaulux@gmail.com");
        loginPage.isContinueButtonVisible();
        loginPage.isContunieButtonClickable();
        loginPage.clickContunieButton();
        String actualLoginPasswordPageText = loginPage.getForgotPasswordDisplay();
        /*Assertions.assertEquals(loginPage.expectedForgotPasswordText, actualLoginPasswordPageText,
                "Giriş Yap-Şifre sayfası beklendiği gibi değil veya bulunamadı.");*/
        String actualEmailClaimText = loginPage.getEmailClaimTextDisplay();
        Assertions.assertEquals(loginPage.expectedEmailClaimText, actualEmailClaimText,
                "Giriş Yap-Email ile Giriş Yap-Şifre sayfasındaki mail adresler eşleşmiyor.");
        loginPage.isPasswordTextboxClickable();
        loginPage.isPasswordTextBoxVisible();
        loginPage.sendPasswordTextBox("test123");
        loginPage.isLoginButtonVisible();
        loginPage.isLoginButtonClickable();
        loginPage.clickLoginButton();
        /*String actualLoginAccountText = homePage.getAccountTextDisplay();
        Assertions.assertEquals(homePage.expectedLoginAccountText, actualLoginAccountText,
                "Hesap girişi metni beklendiği gibi değil veya bulunamadı."); */

        paymentPage.isNameBoxVisible();
        paymentPage.isNameBoxClickable();
        paymentPage.clickNameBox();
        paymentPage.sendNameSurname("Ceyda Ulutürk");

        paymentPage.isPhoneBoxVisible();
        paymentPage.isPhoneBoxClickable();
        paymentPage.clickPhoneBox();
        paymentPage.sendPhone("111111");

        paymentPage.isAddressBoxVisible();
        paymentPage.isAddressBoxClickable();
        paymentPage.clickAddressBox();
        paymentPage.sendAddress("aaaaa");


        paymentPage.isAddressBox2Visible();
        paymentPage.isAddressBox2Clickable();
        paymentPage.clickAddress2Box();
        paymentPage.sendAddress2("x apartman daire 1");

        paymentPage.isCityBoxVisible();
        paymentPage.isCityBoxClickable();
        paymentPage.clickCityBox();
        paymentPage.sendCity("ist");

        paymentPage.isCityCompleteVisible();
        paymentPage.isCityCompleteClickable();
        paymentPage.clickCityComplete();

        paymentPage.scrollToCartIcon();
        paymentPage.isAddressStateVisible();
        paymentPage.isAddressStateClickable();
        paymentPage.clickAddressState();
        paymentPage.sendAddressState("bak");

        paymentPage.isCityCompleteVisible();
        paymentPage.isCityCompleteClickable();
        paymentPage.clickCityComplete();

    }

}
