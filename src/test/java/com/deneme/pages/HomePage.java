package com.deneme.pages;

import com.deneme.methods.Methods;
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


    public boolean isCookieButtonClickable() {
        return isElementClickable(cookieButton, "id", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isCookieButtonVisible() {
        return isElementVisible(cookieButton, "id", 10); // 10 seconds timeout or any preferred value
    }

    // Click the cookie button
    public void clickCookieButton() {
        click(cookieButton, "id");
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

    public boolean isSearchBoxClickable() {
        return isElementClickable(txtSearchBox, "id", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isSearchBoxVisible() {
        return isElementVisible(txtSearchBox, "id", 10); // 10 seconds timeout or any preferred value
    }

    // Click the cookie button
    public void clickSearchBox() {
        click(txtSearchBox, "id");
    }

    public void sendSearchBox(String password) {
        sendKeys(txtSearchBox, "id", password);
    }

    public void pressEnterSearchBox() {
        klavyeTusunaBas(txtSearchBox, "id", Keys.ENTER);
    }

    public boolean isCartButtonVisible() {
        return isElementVisible(cartButton, "id", 10);
    }

    public boolean isCartButtonClickable() {
        return isElementClickable(cartButton, "id", 10);
    }

    public String getCartTextDisplay() {
        return getText(cartButton, "id");
    }

    public boolean isOrdersButtonVisible() {
        return isElementVisible(ordersButton, "id", 10);
    }

    public boolean isOrdersButtonClickable() {
        return isElementClickable(ordersButton, "id", 10);
    }

    public String getOrdersTextDisplay() {
        return getText(ordersButton, "id");
    }

    public boolean isBestSellersButtonVisible() {
        return isElementVisible(bestSellersButton, "css", 10);
    }

    public boolean isBestSellersButtonClickable() {
        return isElementClickable(bestSellersButton, "css", 10);
    }

    public String getBestSellersTextDisplay() {
        return getText(bestSellersButton, "css");
    }

    public boolean isTodaysDealsButtonVisible() {
        return isElementVisible(todaysDealsButton, "css", 10);
    }

    public boolean isTodaysDealsButtonClickable() {
        return isElementClickable(todaysDealsButton, "css", 10);
    }

    public String getTodaysDealsTextDisplay() {
        return getText(todaysDealsButton, "css");
    }

    public boolean isNewReleasesButtonVisible() {
        return isElementVisible(newReleasesButton, "css", 10);
    }

    public boolean isNewReleasesButtonClickable() {
        return isElementClickable(newReleasesButton, "css", 10);
    }

    public String getNewReleasesTextDisplay() {
        return getText(newReleasesButton, "css");
    }




}
