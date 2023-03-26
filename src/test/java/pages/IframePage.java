package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IframePage {

    public IframePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(tagName="h3")
    public WebElement anIframeYaziElementi;

    @FindBy(xpath = "//*[@id='mce_0_ifr']")
    public WebElement iframeElementi;

    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement textBoxElementi;

    @FindBy(xpath = "//*[text()='Elemental Selenium']")
    public WebElement elementalSeleniumElementi;



}
