package com.trendyol.pages;

import com.trendyol.utilites.BrowserUtils;
import com.trendyol.utilites.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//h3[contains(text(),'giriş yap')]")
    @CacheLookup
    private WebElement girisYapMessage;

    @FindBy(css = "#login-email")
    @CacheLookup
    private WebElement enterEmailBox;

    @FindBy(css = "#login-password-input")
    @CacheLookup
    private WebElement enterPasswordBox;

    @FindBy(xpath = "(//span[text()='Giriş Yap'])[2]")
    @CacheLookup
    private WebElement girisYapButton;

    @FindBy(xpath = "//span[@class='message']")
    @CacheLookup
    private WebElement errorMessage;

    public void verifyUserOnTheLoginPage(){
        Assert.assertTrue(girisYapMessage.isDisplayed());
    }

    public void enterEmailInEmailBox(String email){
        enterEmailBox.sendKeys(email);
    }

    public void enterPasswordInPasswordBox(String password){
        enterPasswordBox.sendKeys(password);
    }

    public void clickGirisYapButton(){
        BrowserUtils.clickWithJS(girisYapButton);
    }

    public void login(String email, String password){
        enterEmailInEmailBox(email);
        enterPasswordInPasswordBox(password);
        clickGirisYapButton();
    }

    public void verifyErrorMessageIsDisplayed(){
        Assert.assertTrue(errorMessage.isDisplayed());
    }


}
