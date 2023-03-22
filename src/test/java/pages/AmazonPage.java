package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;

    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    public WebElement cookieButton;

    @FindBy(xpath = "//div[@id='nav-xshop']/a[@href='/gcx/-/gfhz/?ref_=nav_cs_giftfinder']")
    public WebElement hediyeFikirleriButton;

    @FindBy(xpath = "//li[@aria-label='Bebek']/span/a/div/label/input[@type ='checkbox']")
    public WebElement bebekCheckBox;

    @FindBy(xpath = "//li[@aria-label='Tebrikler']/span/a/div/label/input[@type ='checkbox']")
    public WebElement tebriklerCheckBox;

    @FindBy(xpath = "//span[@class='a-dropdown-container']")
    public WebElement siralamaDropDown;

    @FindBy(xpath = "//ul[@role='listbox']/li")
    public WebElement siralamaDropDownItems;



}
