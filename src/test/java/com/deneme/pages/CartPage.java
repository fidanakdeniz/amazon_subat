package com.deneme.pages;

import com.deneme.methods.Methods;
import org.openqa.selenium.WebDriver;

public class CartPage extends Methods {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public final String cartIcon = "nav-cart-count-container";

    public final String buyButton = "sc-buy-box-ptc-button";






    public boolean isCartIconClickable() {
        return isElementClickable(cartIcon, "id", 20); // 10 seconds timeout or any preferred value
    }

    public boolean isCartIconVisible() {
        return isElementVisible(cartIcon, "id", 20); // 10 seconds timeout or any preferred value
    }

    // Click the cookie button
    public void clickCartIcon() {
        jsclick(cartIcon, "id");
    }


    public void waitbymilliseconds(){waitByMilliseconds(20);}




    public boolean isBuyButtonClickable() {
        return isElementClickable(buyButton, "id", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isBuyButtonVisible() {
        return isElementVisible(buyButton, "id", 10); // 10 seconds timeout or any preferred value
    }

    // Click the cookie button
    public void clickBuyButton() {
        click(buyButton, "id");
    }









}
