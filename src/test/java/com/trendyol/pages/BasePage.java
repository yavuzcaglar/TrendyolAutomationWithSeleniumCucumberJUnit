package com.trendyol.pages;

import com.trendyol.utilites.BrowserUtils;
import com.trendyol.utilites.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @FindBy(xpath = "//p[text()='Çıkış Yap']")
    @CacheLookup
    private WebElement cikisYapButton;

    @FindBy(xpath = "//p[text()='Hesabım']")
    @CacheLookup
    private WebElement hesabimOption;

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void selectOption(String option){
        WebElement element = Driver.get().findElement(By.xpath("//p[@class='link-text'][text()='" + option + "']"));
        BrowserUtils.clickWithJS(element);
    }

    public void selectCategory(String category){
        WebElement element = Driver.get().findElement(By.xpath("//li[@class='tab-link']/a[text()='"+ category +"']"));
        BrowserUtils.clickWithJS(element);
    }

    public void verifyThatUserLoggedIn(){
        BrowserUtils.hover(hesabimOption);
        Assert.assertTrue(cikisYapButton.isDisplayed());
    }

}
