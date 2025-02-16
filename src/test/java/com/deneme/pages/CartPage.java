package com.deneme.pages;

import com.deneme.methods.Methods;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CartPage extends Methods {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public final String cartIcon = "nav-cart-count-container";

    public final String buyButton = "sc-buy-box-ptc-button";

    public final String expectedUrl = "https://www.amazon.com.tr/gp/cart/view.html?ref_=nav_cart";

    public final String productInCart = "//form[@id='activeCartViewForm']//div[@data-name='Active Items']/div[@role='listitem']//h4/span/span[contains(@class,\"a-truncate-full\")]";

    public final String airpods = "//form[@id='activeCartViewForm']//div[@data-name='Active Items']/div[@role='listitem']//h4/span/span[contains(@class,\"a-truncate-full\") and contains(translate(text(),\"AIİP\",\"aiip\"),\"apple airpods\")]";


    // Click the cookie button
    public void clickCartIcon() {
        jsclick(cartIcon, "id");
    }

    public void clickCartIconInHeader(){
        Assertions.assertTrue(isElementVisible(cartIcon, "id", 15));
        Assertions.assertTrue(isElementClickable(cartIcon, "id", 15));
        clickCartIcon();
    }

    public void waitbymilliseconds(){
        waitByMilliseconds(20);}


    // Click the cookie button
    public void buyButton() {
        click(buyButton, "id");
    }


    public void clickBuyButton() {
        Assertions.assertTrue(isElementVisible(buyButton, "id", 10));
        Assertions.assertTrue(isElementClickable(buyButton, "id", 10));
        buyButton();
    }




//form[@id='activeCartViewForm']//div[@data-name='Active Items']/div[@role='listitem']//h4/span/span[contains(@class,"a-truncate-full")]
    //form[@id='activeCartViewForm']//div[@data-name='Active Items']/div[@role='listitem']//h4/span/span[contains(@class,"a-truncate-full") and contains(translate(text(),"AIİP","aiip"),"apple airpods")]

    public boolean sepetteUrunVarMi(){
        return isElementVisible(productInCart,"xpath",2);
    }

    /*DENEME SEPETTE AIRPODS VARSA SEPETE URUN EKLENMESIN
    public boolean sepetteAirPodsVarMi(){

        if (sepetteUrunVarMi()) {
            if (isElementVisible(airpods, "xpath", 2)){
                System.out.println("Sepette airpods var");
                return true;
            }
            System.out.println("Sepette airpods yok");
            return false;
        }
        System.out.println("Sepette ürün yok");
        return false;
    }*/





}
