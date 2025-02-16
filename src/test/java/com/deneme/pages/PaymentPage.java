package com.deneme.pages;

import com.deneme.methods.Methods;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends Methods {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public final String nameBox = "address-ui-widgets-enterAddressFullName";

    public final String phoneBox = "address-ui-widgets-enterAddressPhoneNumber";

    public final String addressBox = "address-ui-widgets-enterAddressLine1";

    public final String addressBox2 = "//input[@id='address-ui-widgets-enterAddressLine2']";

    public final String cityBox = "address-ui-widgets-enterAddressCity";

    public final String cityComplete = "address-ui-widgets-autoCompleteResult-0";

    public final String addressState = "address-ui-widgets-enterAddressStateOrRegion";

    public final String addressDistrict = "address-ui-widgets-enterAddressDistrictOrCounty";



    public final String expectedUrl = "https://www.amazon.com.tr/gp/buy/addressselect/handlers/display.html?_from=cheetah";

    public boolean isNameBoxClickable() {
        return isElementClickable(nameBox   , "id", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isNameBoxVisible() {
        return isElementVisible(nameBox, "id", 10); // 10 seconds timeout or any preferred value
    }

    public void clickNameBox() {
        click(nameBox, "id");
    }


    public boolean isPhoneBoxClickable() {
        return isElementClickable(phoneBox   , "id", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isPhoneBoxVisible() {
        return isElementVisible(phoneBox, "id", 10); // 10 seconds timeout or any preferred value
    }

    public void clickPhoneBox() {
        click(phoneBox, "id");
    }



    public boolean isAddressBoxClickable() {
        return isElementClickable(addressBox   , "id", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isAddressBoxVisible() {
        return isElementVisible(addressBox, "id", 10); // 10 seconds timeout or any preferred value
    }

    public void clickAddressBox() {
        click(addressBox, "id");
    }



    public boolean isAddressBox2Clickable() {
        return isElementClickable(addressBox2   , "xpath", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isAddressBox2Visible() {
        return isElementVisible(addressBox2, "xpath", 10); // 10 seconds timeout or any preferred value
    }

    public void clickAddress2Box() {
        click(addressBox2, "xpath");
    }





    public boolean isCityBoxClickable() {
        return isElementClickable(cityBox   , "id", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isCityBoxVisible() {
        return isElementVisible(cityBox, "id", 10); // 10 seconds timeout or any preferred value
    }

    public void clickCityBox() {
        click(cityBox, "id");
    }


    public boolean isCityCompleteClickable() {
        return isElementClickable(cityComplete   , "id", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isCityCompleteVisible() {
        return isElementVisible(cityComplete, "id", 10); // 10 seconds timeout or any preferred value
    }

    public void clickCityComplete() {
        click(cityComplete, "id");
    }



    public boolean isAddressStateClickable() {
        return isElementClickable(addressState   , "name", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isAddressStateVisible() {
        return isElementVisible(addressState, "name", 10); // 10 seconds timeout or any preferred value
    }

    public void clickAddressState() {
        jsclick(addressState, "name");
    }



    public boolean isAddressDistrictClickable() {
        return isElementClickable(addressDistrict   , "id", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isAddressDistrictVisible() {
        return isElementVisible(addressDistrict, "id", 10); // 10 seconds timeout or any preferred value
    }

    public void clickAddressDistrict() {
        click(addressDistrict, "id");
    }





    public void sendNameSurname(String name){sendKeys(nameBox, "id", name);}

    public void sendPhone(String phone){sendKeys(phoneBox, "id", phone);}

    public void sendAddress(String address){sendKeys(addressBox, "id", address);}

    public void sendAddress2(String address2){sendKeys(addressBox2, "xpath", address2);}

    public void sendCity(String city){sendKeys(cityBox, "id", city);}

    public void sendAddressState(String state){sendKeys(addressState, "name", state);}

    public void sendAddressDistrict(String district){sendKeys(addressDistrict,"id", district);}

    public void scrollToCartIcon() {
        scrollTo(addressState, "name");
    }
}
