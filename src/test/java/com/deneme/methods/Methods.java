package com.deneme.methods;

import com.deneme.driver.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> fluentWait;
    WebDriverWait wait; // WebDriverWait değişkenini burada tanımlayın

    public Methods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait değişkenini burada oluşturun
    }

    public WebElement findElement(String value, String type) {
        By by = getBy(value, type);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by)); // Sayfada alan kaplayan elementi bulur
    }

    // Diğer metotlar ve değişkenler
    public void sendKeys(String value, String type, String text) {
        findElement(value, type).sendKeys(text);
    }

    public void click(String value, String type) {
        findElement(value, type).click();
    }

    public void jsclick(String value, String type) {
        By elementBy = getBy(value, type);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void scrollTo(String value, String type) {
        By elementBy = getBy(value, type);

        // Elementin görünür olmasını bekleyelim
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));

        WebElement element = driver.findElement(elementBy);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void klavyeTusunaBas(String value, String type, Keys klavyeTusu) {
        findElement(value, type).sendKeys(klavyeTusu);
    }

    public void pressEnter(By by) {
        // Belirtilen By locator'ına sahip elementi bul ve ENTER tuşuna bas
        driver.findElement(by).sendKeys(Keys.ENTER);
    }

    public void sendKeysJS(String value, String type, String text) {
        By elementBy = getBy(value, type);
        WebElement inputElement = wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[1];", inputElement, text);
    }


    public boolean isElementVisible(String value, String type, long timeout) {
        try {
            // WebDriverWait kullanarak elementi görünür olana kadar bekleyin
            setFluentWait(timeout, 300).until(ExpectedConditions.visibilityOfElementLocated(getBy(value, type)));
            System.out.println("Element with " + value + " is visible.");
            return true;
        } catch (WebDriverException e) {
            System.out.println("Element with " + value + " is not visible.");
            return false;
        }
    }


    public boolean isElementClickable(String value, String type, long timeout) {
        try {
            setFluentWait(timeout, 300).until(ExpectedConditions.elementToBeClickable(getBy(value, type)));
            System.out.println("Element with " + value + " is clickable.");
            return true;
        } catch (WebDriverException e) {
            System.out.println("Element with " + value + " is not clickable.");
            return false;
        }
    }

    public By getBy(String value, String type) {
        By by = null;
        switch (type) {
            case "id":
                by = By.id(value);
                break;
            case "name":
                by = By.name(value);
                break;
            case "css":
                by = By.cssSelector(value);
                break;
            case "xpath":
                by = By.xpath(value);
                break;
            case "class":
                by = By.className(value);
                break;
            default:
                throw new NullPointerException(type + " Type hatalı");
        }
        return by;
    }

    public FluentWait<WebDriver> setFluentWait(long timeout, long pollingEvery) {
        return new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(pollingEvery))
                .ignoring(NoSuchElementException.class);
    }

    public void waitByMilliseconds(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void hoverElement(String value, String type) {
        WebElement element = findElement(value, type);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform(); // Öğenin üzerine fare ile hareket ettir
    }

    public void clearText(String value, String type) {
        WebElement element = findElement(value, type);
        element.clear(); // Mevcut metni temizle
    }

    public void scroll(int length){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+length+")");
    }

    public String getText(String value, String type) {
        WebElement element = findElement(value, type);
        return element.getText().trim(); // Metni alıp, baştaki ve sondaki boşlukları temizler
    }



}
