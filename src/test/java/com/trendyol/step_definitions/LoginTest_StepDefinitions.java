package com.trendyol.step_definitions;

import com.trendyol.pages.BasePage;
import com.trendyol.pages.LoginPage;
import com.trendyol.utilites.ConfigurationReader;
import com.trendyol.utilites.Driver;
import io.cucumber.java.en.*;

public class LoginTest_StepDefinitions {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("User taps on the {string} button")
    public void user_taps_on_the_button(String option) {
        basePage.selectOption(option);
    }

    @Then("Verify that user is on the login page")
    public void verify_that_user_is_on_the_login_page() {
        loginPage.verifyUserOnTheLoginPage();
    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String email, String password) {
        loginPage.enterEmailInEmailBox(email);
        loginPage.enterPasswordInPasswordBox(password);
    }

    @When("User taps on giris yap button")
    public void user_taps_on_giris_yap_button() {
        loginPage.clickGirisYapButton();
    }

    @Then("Verify that the user is logged in")
    public void verify_that_the_user_is_logged_in(){
        basePage.verifyThatUserLoggedIn();
    }

    @Then("Verify that the user is not logged in and error message appears")
    public void verify_that_the_user_is_not_logged_in_and_error_message_appears() {
        loginPage.verifyErrorMessageIsDisplayed();
    }

}
