package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MouseActionPage {

    public MouseActionPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//*[@id='hot-spot']")
    public WebElement ciziliAlanElementi;
    @FindBy(xpath="//*[text()='Elemental Selenium']")
    public WebElement elementalSeleniumLink;
    @FindBy(tagName="h1")
    public WebElement yaziElementi;
    @FindBy(xpath="//div[@id='draggable']")
    public WebElement dragMe;
    @FindBy(xpath="(//div[@id='droppable'])[1]")
    public WebElement dropHere;
    @FindBy(xpath="//p[text()='Dropped!']")
    public WebElement droppedElementi;



}
