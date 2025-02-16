package com.deneme.pages;

import com.deneme.methods.Methods;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends Methods {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public final String cookieButton = "sp-cc-accept"; // Örnek buton id'si
    public final String accountButton = "nav-link-accountList"; // Örnek id
    public final String accountText= "nav-link-accountList-nav-line-1";
    public final String logOutButton = "nav-item-signout";
    public final String txtSearchBox = "twotabsearchtextbox";
    public final String cartButton = "nav-cart";
    public final String ordersButton = "nav-orders";
    public final String bestSellersButton = "a[data-csa-c-content-id='nav_cs_bestsellers']";
    public final String todaysDealsButton = "a[data-csa-c-content-id='nav_cs_gb']";
    public final String newReleasesButton = "a[data-csa-c-content-id='nav_cs_newreleases']";
    public final String searchBox = "twotabsearchtextbox";

    public final String expectedGuestAccountText = "Merhaba, Giriş yapın";
    public final String expectedLoginAccountText = "Ceyda";
    public final String expectedCartText = "Alışveriş";
    public final String expectedOrdersText = "İadeler";
    public final String expectedBestSellersText = "Çok Satanlar";
    public final String expectedTodaysDealsText = "Günün Fırsatları";
    public final String expectedNewReleasesText = "Yeni Çıkanlar";

    public void clickCookieButton() {
        Assertions.assertTrue(isElementVisible(cookieButton, "id", 10), "Çerezler butonu görünmüyor!");
        Assertions.assertTrue(isElementClickable(cookieButton, "id", 10), "Çerezler butonu tıklanabilir değil!");
        click(cookieButton, "id");
        System.out.println("Çerezler butonuna tıklandı!");
    }


    public boolean isLoginButtonClickable() {
        return isElementClickable(accountButton, "id", 10);
    }
    public boolean isLoginButtonVisible() {
        return isElementVisible(accountButton, "id", 10);
    }
    public void clickLoginButton() {
        click(accountButton, "id");
    }

    public String getAccountTextDisplay() {
        return findElement(accountText, "id").getText();
    }


    public boolean isAccountButtonVisible() {
        return isElementVisible(accountButton, "id", 10);
    }
    public void hoverAccountButton() {
        hoverElement(accountButton, "id");
    }

    public boolean isLogOutButtonClickable() {
        return isElementClickable(logOutButton, "id", 10); // 10 seconds timeout or any preferred value
    }


    public boolean isLogOutButtonVisible() {
        return isElementVisible(logOutButton, "id", 10); // 10 seconds timeout or any preferred value
    }


    public void clickLogOutButton() {
        click(logOutButton, "id");
    }


    public void clickSearchBox() {
        click(txtSearchBox, "id");
    }

    public void sendSearchBox(String password) {
        sendKeys(txtSearchBox, "id", password);
    }

    public void pressEnterSearchBox() {
        klavyeTusunaBas(txtSearchBox, "id", Keys.ENTER);
    }

    public void clickWriteEnterSearch(){
        Assertions.assertTrue(isElementVisible(txtSearchBox, "id", 10), "Search butonu görünmüyor.");
        Assertions.assertTrue(isElementClickable(txtSearchBox, "id", 10), "Search butonu tıklanabilir değil.");
        clickSearchBox();
        sendSearchBox("airpods");
        pressEnterSearchBox();

    }


    public String getCartTextDisplay() {
        return getText(cartButton, "id");
    }

    public void controlCartInHeader(){
        Assertions.assertTrue(isElementVisible(cartButton, "id", 10), "Sepet butonu görünmüyor.");
        Assertions.assertTrue(isElementClickable(cartButton, "id", 10), "Sepet butonu tıklanabilir değil.");
        String actualCartText = getCartTextDisplay();
        Assertions.assertTrue(actualCartText.contains(expectedCartText),
                "Sepet yazısı yanlış: Beklenen: " + expectedCartText + ", Bulunan: " + actualCartText);
    }

    public String getOrdersTextDisplay() {
        return getText(ordersButton, "id");
    }


    public void controlOrdersInHeader(){
        Assertions.assertTrue(isElementVisible(ordersButton, "id",10), "Siparişler butonu görünmüyor." );
        Assertions.assertTrue(isElementClickable(ordersButton, "id",10), "Siparişler butonu tıklanabilir değil." );
        String actualOrdersText = getOrdersTextDisplay();
        Assertions.assertTrue(actualOrdersText.contains(expectedOrdersText),
                "Siparişler yazısı yanlış: Beklenen: " + expectedOrdersText + ", Bulunan: " + actualOrdersText);

    }


    public boolean controlBestSellersInHeader() {
        Assertions.assertTrue(isElementVisible(bestSellersButton,"css", 10), "Çok Satanlar butonu görünmüyor.");
        Assertions.assertTrue(isElementClickable(bestSellersButton,"css", 10), "Çok Satanlar butonu tıklanabilir değil.");
        String actualBestSellersText = getBestSellersTextDisplay();
        Assertions.assertTrue(actualBestSellersText.contains(expectedBestSellersText),
                "Çok Satanlar yazısı yanlış: Beklenen: " + expectedBestSellersText + ", Bulunan: " + actualBestSellersText);

        return true;
    }

    public String getBestSellersTextDisplay() {
        return getText(bestSellersButton, "css");
    }

    public boolean controlTodaysDealsInHeader() {
        Assertions.assertTrue(isElementVisible(todaysDealsButton,"css", 10), "Günün Fırsatları butonu görünmüyor.");
        Assertions.assertTrue(isElementClickable(todaysDealsButton,"css", 10), "Günün Fırsatları butonu görünmüyor.");
        String actualTodaysDealsText = getTodaysDealsTextDisplay();
        Assertions.assertTrue(actualTodaysDealsText.contains(expectedTodaysDealsText),
                "Günün Fırsatları yazısı yanlış: Beklenen: " + expectedTodaysDealsText + ", Bulunan: " + actualTodaysDealsText);

        return true;

    }

    public String getTodaysDealsTextDisplay() {
        return getText(todaysDealsButton, "css");
    }

    public boolean controlNewReleasesInHeader() {
        Assertions.assertTrue(isElementVisible(newReleasesButton, "css", 10), "Yeni Çıkanlar butonu görünmüyor.");
        Assertions.assertTrue(isElementClickable(newReleasesButton, "css", 10), "Yeni Çıkanlar butonu tıklanabilir değil.");
        String actualNewReleasesText = getNewReleasesTextDisplay();
        Assertions.assertTrue(actualNewReleasesText.contains(expectedNewReleasesText),
                "Yeni Çıkanlar yazısı yanlış: Beklenen: " + expectedNewReleasesText + ", Bulunan: " + actualNewReleasesText);

        return true;
    }

    public String getNewReleasesTextDisplay() {
        return getText(newReleasesButton, "css");
    }


}
