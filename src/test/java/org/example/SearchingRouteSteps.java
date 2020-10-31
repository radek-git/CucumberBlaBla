package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchingRouteSteps  {

    private LoginPage loginPage;
    private LoginPageViaEmail loginPageViaEmail;
    private HomePage homePage;


    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;



//    @Before
//    public void setUp() {
////        WebDriverManager.chromedriver().setup();
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--lang=en-US");
//        driver = new ChromeDriver();
//
//        init();
//
//        driver.get("https://www.blablacar.pl/login");
//        loginPage = new org.example.LoginPage(driver, wait, actions);
//    }
//
//    public void init() {
//        wait = new WebDriverWait(driver, 15);
//        actions = new Actions(driver);
//        driver.manage().window().maximize();
//    }

//    @Before
//    public void setUp() {
////        ChromeOptions chromeOptions = new ChromeOptions();
////        chromeOptions.addArguments("--lang=en-US");
////        driver = new ChromeDriver(chromeOptions);
//
////        WebDriverManager.chromedriver().setup();
//
//        init();
//
//        driver.get("https://www.blablacar.pl/login");
//        homePage = new org.example.HomePage(driver, wait, actions);
//    }

//    @Given("User opens page {string}")
//    public void user_opens_page(String url) {
//        driver.get(url);
//    }

    @Given("User logs in via email and inputs email={string} and password={string}")
    public void user_logs_in_via_email_and_inputs_email_and_password(String email, String password) {
        loginPage = new LoginPage(driver, wait, actions);
        LoginPageViaEmail loginPageViaEmail = loginPage.clickLoginViaEmailButton();
        loginPageViaEmail.inputEmail(email);
        loginPageViaEmail.inputPassword(password);
        HomePage homePage = loginPageViaEmail.clickSubmitButton();
    }



    @Given("User inputs city from={string} and to={string}")
    public void user_inputs_city_from_and_to(String from, String to) {

    }

    @Given("User selects date and number of passengers")
    public void user_selects_date_and_number_of_passengers() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User clicks Search button")
    public void user_clicks_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("List of offers is displayed")
    public void list_of_offers_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User reads and saves all offers")
    public void user_reads_and_saves_all_offers() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("All offers are saved")
    public void all_offers_are_saved() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
