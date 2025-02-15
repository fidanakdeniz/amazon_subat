package com.deneme.driver;

import com.deneme.pages.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static CategoryPage categoryPage;
    public static CartPage cartPage;
    public static PaymentPage paymentPage;


    @BeforeAll
    public static void beforeAll() {
        // İhtiyaç varsa burada genel ayarlar yapabilirsiniz
    }

    // Her bir test başlamadan önce bu methodu çağır.
    @BeforeEach
    public void before() {
        driver = new ChromeDriver();
        // Açılan tarayıcının boyutunu ayarlama
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/");
        homePage = new HomePage(driver); // HomePage nesnesini oluştururken driver'ı geçin
        loginPage = new LoginPage(driver); // LoginPage nesnesini oluştururken driver'ı geçin
        categoryPage = new CategoryPage(driver);
        cartPage = new CartPage(driver);
        paymentPage = new PaymentPage(driver);
    }

    // Tarayıcı kapatma
    /*@AfterEach
    public void after() {
        if (driver != null) {
            driver.quit(); // Tarayıcı kapatır, close sekmeyi kapatır
        }
    }*/

    @AfterAll
    public static void afterAll() {
        // Testlerin ardından yapılacak işlemler varsa burada yer alır
    }
}
