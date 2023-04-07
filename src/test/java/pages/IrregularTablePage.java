package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class IrregularTablePage {

    public IrregularTablePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="//div[@class='rt-resizable-header-content']")
    public List<WebElement>  headerTitleElementList;
    @FindBy(xpath="//div[@role='gridcell']")
    public List<WebElement>  allGridCellList;
    @FindBy(xpath="//div[@role='rowgroup']")
    public List<WebElement>  allRowList;

    @FindBy(xpath="//div[@class='rt-tr-group']//div[@class='rt-td'][1]")
    public List<WebElement>  nameRowElementList;
    @FindBy(xpath="//div[@class='rt-tr-group']//div[@class='rt-td'][5]")
    public List<WebElement>  salaryRowElementList;




}
