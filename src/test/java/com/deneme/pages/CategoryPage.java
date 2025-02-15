package com.deneme.pages;

import com.deneme.methods.Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage extends Methods {
    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public final String selectProduct = "a-autoid-5-announce";
    public final String SEARCH_TEXT = ".a-color-state";
    public final String RESULTS_TEXT = "h2.a-size-medium-plus.a-spacing-none.a-color-base.a-text-bold:nth-of-type(1)";
    public final String productTitle ="//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_5']//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']";

    public final String expectedSearchText = "\"airpods\"";
    public final String expectedResultsText = "Sonuçlar";

    public String getSearchTextDisplay() {
        return getText(SEARCH_TEXT, "css");
    }

    public String getResultsTextDisplay() {
        return getText(RESULTS_TEXT, "css");
    }

    public boolean isProductTitleClickable() {
        return isElementClickable(productTitle, "xpath", 10);
    }

    //
    public boolean isProductTitleVisible() {
        return isElementVisible(productTitle, "xpath", 10);
    }

    public String getProductTitle() {
        WebElement element = findElement(productTitle, "xpath"); // Ürünün WebElement'ini al
        String title = element.getText().trim(); // Ürünün başlığını al ve baştaki/sondaki boşlukları temizle
        System.out.println("Ürün Başlığı: " + title);
        return title;
    }

    public boolean isSelectProductClickable() {
        return isElementClickable(selectProduct, "id", 15); // 10 seconds timeout or any preferred value
    }

    public boolean isSelectProductVisible() {
        return isElementVisible(selectProduct, "id", 15); // 10 seconds timeout or any preferred value
    }

    // Click the cookie button
    public void clickSelectProduct() {
        click(selectProduct, "id");
    }


    public void scrollPage(){ scrollTo(selectProduct,"id");}

    public void scrollAUpPage(){scroll(-500);}

    public void waitbymilliseconds(){waitByMilliseconds(20);}
}
