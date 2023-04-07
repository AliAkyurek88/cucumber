package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[@title='Only allow essential cookies']")
    public WebElement cookiesAcceptButton;
    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    public WebElement yeniKayitButton;
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement isimInput;

}
