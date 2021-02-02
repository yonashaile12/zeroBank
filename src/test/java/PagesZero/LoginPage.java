package PagesZero;

import Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "signin_button")
    public WebElement signInBtn;

    @FindBy(id = "user_login")
    public WebElement usernameInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginInBtn;


    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInBtn.click();
    }
}
