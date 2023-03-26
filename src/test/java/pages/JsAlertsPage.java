package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JsAlertsPage {

    public JsAlertsPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="//*[text()='Click for JS Alert']")
    public WebElement firstButton;

    @FindBy(xpath = "//*[text()='Click for JS Confirm']")
    public WebElement secondButton;

    @FindBy(xpath = "//*[text()='Click for JS Prompt']")
    public WebElement thirdButton;

    @FindBy(xpath = "//p[@id='result']")
    public WebElement resultElement;

}
