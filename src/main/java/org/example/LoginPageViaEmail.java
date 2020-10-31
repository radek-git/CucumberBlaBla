package org.example;


import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageViaEmail extends BasePage {

    static class XPATH{
        public static final String EMAIL_INPUT = "//input[@type='email']";
        public static final String PASSWORD_INPUT = "//input[@type='password']";
        public static final String SUBMIT_BUTTON = "//button[@type='submit']";
    }



    public LoginPageViaEmail(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    public LoginPageViaEmail inputEmail(String email) {
        getDriver().findElement(By.xpath(XPATH.EMAIL_INPUT)).sendKeys(email);
        return new LoginPageViaEmail(getDriver(), getWait(), getActions());
    }

    public LoginPageViaEmail inputPassword(String password) {
        getDriver().findElement(By.xpath(XPATH.PASSWORD_INPUT)).sendKeys(password);
        return new LoginPageViaEmail(getDriver(), getWait(), getActions());
    }

    public HomePage clickSubmitButton() {
        getDriver().findElement(By.xpath(XPATH.SUBMIT_BUTTON)).click();
        return new HomePage(getDriver(), getWait(), getActions());
    }
}
