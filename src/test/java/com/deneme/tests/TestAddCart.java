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
        homePage.clickCookieButton();
        homePage.controlCartInHeader();
        homePage.controlOrdersInHeader();
        homePage.controlBestSellersInHeader();
        homePage.controlTodaysDealsInHeader();
        homePage.controlNewReleasesInHeader();
        String actualGuestAccountText = homePage.getAccountTextDisplay();
        Assertions.assertEquals(homePage.expectedGuestAccountText, actualGuestAccountText,
                "Hesap girişi metni beklendiği gibi değil veya bulunamadı.");
        homePage.clickWriteEnterSearch();


        Assertions.assertEquals(categoryPage.expectedResultsText, categoryPage.getResultsTextDisplay(),
                "Kategori sayfası açılamadı.");
        Assertions.assertEquals(categoryPage.expectedSearchText, categoryPage.getSearchTextDisplay(),
                "Kategori sayfasına aratılan ürün doğru aratılmadı.");
        categoryPage.scrollPage();
        String productTitle = categoryPage.getProductTitle();
        //System.out.println("Ürün Başlığı: " + productTitle);
        categoryPage.selectProduct();
        categoryPage.scrollAUpPage();
        categoryPage.waitbymilliseconds();


        cartPage.clickCartIconInHeader();
        Assertions.assertEquals(cartPage.expectedUrl,driver.getCurrentUrl(),
                "Sepet sayfası başarıyla açıldı");
        cartPage.clickBuyButton();


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


        Assertions.assertEquals(paymentPage.expectedUrl,driver.getCurrentUrl(),
                "Ödeme sayfası başarılı bir şekilde açıldı");

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
        paymentPage.sendAddressState("eyüp");

        paymentPage.isCityCompleteVisible();
        paymentPage.isCityCompleteClickable();
        paymentPage.clickCityComplete();

        paymentPage.isAddressDistrictVisible();
        paymentPage.isAddressDistrictClickable();
        paymentPage.clickAddressDistrict();
        paymentPage.sendAddressDistrict("gök");
        paymentPage.clickCityComplete();


    }

}
