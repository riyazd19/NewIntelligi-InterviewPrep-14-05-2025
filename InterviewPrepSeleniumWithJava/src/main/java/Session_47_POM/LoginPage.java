package Session_47_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //constructor
    LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By txt_userName_locator = By.xpath("//input[@placeholder='Username']");
    By txt_password_locator = By.xpath("//input[@placeholder='Password']");
    By txt_loginButton_locator = By.xpath("//button[@type='submit']");


    //Action Methods
    public void setUserName(String user) {
        driver.findElement(txt_userName_locator).sendKeys(user);
    }

    public void setPassowrd(String password) {
        driver.findElement(txt_password_locator).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(txt_loginButton_locator).click();
    }

}
