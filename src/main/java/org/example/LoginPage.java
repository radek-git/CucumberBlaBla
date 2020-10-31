package org.example;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {




    static class XPATH{
        public static final String LOGIN_VIA_EMAIL_BUTTON = "//span[@class='kirk-item-leftText']/span[contains(text(), 'e-mail')]";


    }


    public LoginPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }


    public LoginPageViaEmail clickLoginViaEmailButton() {
        getDriver().findElement(By.xpath(XPATH.LOGIN_VIA_EMAIL_BUTTON)).click();
        return new LoginPageViaEmail(getDriver(), getWait(), getActions());
    }

}
