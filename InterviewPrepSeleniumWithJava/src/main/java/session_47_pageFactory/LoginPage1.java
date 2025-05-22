package session_47_pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
    WebDriver driver;


    //constructor
    LoginPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators
//    By txt_userName_locator = By.xpath("//input[@placeholder='Username']");
//    By txt_password_locator = By.xpath("//input[@placeholder='Password']");
//    By txt_loginButton_locator = By.xpath("//button[@type='submit']");
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement txt_userName_locator;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement txt_password_locator;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement txt_loginButton_locator;

    //Action Methods
    public void setUserName(String user) {

        txt_userName_locator.sendKeys(user);
    }

    public void setPassowrd(String password) {
        txt_password_locator.sendKeys(password);
    }

    public void clickLoginButton() {
        txt_loginButton_locator.click();
        System.out.println("from different logingPage1");
    }

}
