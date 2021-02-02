package Step_Definitions;

import PagesZero.LoginPage;
import Utility.ConfigurationReader;
import Utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZeroBankLogin {
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        loginPage.signInBtn.click();
    }

    @When("user puts {string}")
    public void user_puts(String username) {
        wait.until(ExpectedConditions.visibilityOf(loginPage.usernameInput));
        loginPage.usernameInput.sendKeys(username);


    }
    @When("user insert {string}")
    public void user_insert(String password) {
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginInBtn.click();
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        String expected = "account-summary";
        wait.until(ExpectedConditions.urlContains(expected));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expected));
        Driver.closeDriver();




    }
}
