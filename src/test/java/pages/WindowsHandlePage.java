package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WindowsHandlePage {

    public WindowsHandlePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(tagName="h3")
    public WebElement yaziElementi;

    @FindBy(xpath = "//*[text()='Click Here']")
    public WebElement clickHereButton;

}
