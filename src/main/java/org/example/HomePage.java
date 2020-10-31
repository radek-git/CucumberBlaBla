package org.example;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }
}
