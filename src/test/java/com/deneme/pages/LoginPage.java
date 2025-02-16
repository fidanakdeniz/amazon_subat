package com.deneme.pages;

import com.deneme.methods.Methods;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Methods {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public final String emailTextBox = "email";
    public final String continueButton = "continue";
    public final String passwordTextBox = "ap_password";
    public final String loginButton = "signInSubmit";
    public final String loginPageText = "a-spacing-small";
    public final String expectedLoginPageText = "Giriş yap";
    public final String forgotPasswordText = "auth-fpp-link-bottom";
    public final String expectedForgotPasswordText = "Şifremi unuttum.";
    public final String emailClaim = "auth-email-claim";
    public final String expectedEmailClaimText = "ceydaulux@gmail.com";
    public final String expectedInvalidCharEmailPopUpText = "Lütfen geçerli bir e-posta adresi veya telefon numarası girin";
    public final String invalidCharEmailPopUpText = "auth-email-invalid-claim-alert";
    public final String nonRegisteredUserPopUpText = "auth-error-message-box";
    public final String blankEmailPopUpText ="auth-email-missing-alert";
    public final String expectedNonRegisteredUserPopUpText = "Bu e-posta adresiyle bir hesap bulamıyoruz";
    public final String expectedBlankEmailPopUpText ="E-postanızı veya cep telefonu numaranızı girin";
    public final String blankPasswordPopUpText = "auth-password-missing-alert";
    public final String expectedBlankPasswordPopUpText ="Şifrenizi girin";
    public final String invalidPasswordPopUpText = "auth-error-message-box";
    public final String expectedInvalidPasswordPopUpText = "Şifreniz yanlış";



    public String getLoginPageTextDisplay() {
        return findElement(loginPageText, "xpath").getText();
    }

    public boolean isEmailTextboxClickable() {
        return isElementClickable(emailTextBox, "name", 10); // 10 seconds timeout or any preferred value
    }

    public boolean isEmailTextBoxVisible() {
        return isElementVisible(emailTextBox, "name", 10); // 10 seconds timeout or any preferred value
    }

    public void clickEmailTextBox() {
        click(emailTextBox, "css");
    }

    public void clearEmailTextBox() {
        clearText(emailTextBox, "id");
    }

    public void sendEmailTextBox(String email) {
        sendKeysJS(emailTextBox, "name", email);
    }
    public boolean isContunieButtonClickable() {
        return isElementClickable(continueButton, "id", 10);
    }
    public boolean isContinueButtonVisible() {
        return isElementVisible(continueButton, "id", 10);
    }
    public void clickContunieButton() {
        click(continueButton, "id");
    }
    public String getForgotPasswordDisplay() {
        return findElement(forgotPasswordText, "id").getText();
    }
    public String getEmailClaimTextDisplay() {
        return findElement(emailClaim, "id").getText();
    }
    public boolean isPasswordTextboxClickable() {
        return isElementClickable(passwordTextBox, "id", 10); // 10 seconds timeout or any preferred value
    }


    public boolean isPasswordTextBoxVisible() {
        return isElementVisible(passwordTextBox, "id", 10); // 10 seconds timeout or any preferred value
    }


    public void sendPasswordTextBox(String password) {
        sendKeysJS(passwordTextBox, "id", password);
    }
    public void clickPasswordTextBox() {
        click(passwordTextBox, "id");
    }

    public void clearPasswordTextBox() {
        clearText(passwordTextBox, "id");
    }
    public boolean isLoginButtonClickable() {
        return isElementClickable(loginButton, "id", 10);
    }
    public boolean isLoginButtonVisible() {
        return isElementVisible(loginButton, "id", 10);
    }
    public void clickLoginButton() {
        jsclick(loginButton, "id");
    }

    public String getInvalidCharEmailPopUpText() {
        return findElement(invalidCharEmailPopUpText, "id").getText();
    }

    public String getNonRegisteredUserPopUpText() {
        return findElement(nonRegisteredUserPopUpText, "id").getText();
    }

    public String getBlankEmailPopUpTextPopUpText() {
        return findElement(blankEmailPopUpText, "id").getText();
    }
    public String getBlankPasswordPopUpTextPopUpText() {
        return findElement(blankPasswordPopUpText, "id").getText();
    }
    public String getInvalidPasswordPopUpText() {
        return findElement(invalidPasswordPopUpText, "id").getText();
    }

}
