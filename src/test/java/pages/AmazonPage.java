package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;
    @FindBy(xpath = "/html//input[@id='sp-cc-accept']")
    public WebElement cookieButton;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement aramaButton;
    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement aramaSonucElementi;
    @FindBy(xpath = "//div[@id='priceRefinements']/ul//span[.='15000 – 40000 TL']")
    public WebElement fiyatCheckBox;
    @FindBy(xpath = "/html//select[@id='s-result-sort-select']")
    public WebElement siralamaDropDown;
    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement accountListElementi;
    @FindBy(xpath = "//span[text()='Create a List']")
    public WebElement createAListLink;
    @FindBy(xpath = "//div[@role='heading']")
    public WebElement yourListsElementi;





}
