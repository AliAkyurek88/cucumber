package stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.IrregularTablePage;
import utilities.Driver;

import java.util.List;

public class US16_irregularTablesSteps {

    IrregularTablePage irregularTablePage = new IrregularTablePage();
    List<WebElement> headerTitleElementList = irregularTablePage.headerTitleElementList;
    List<WebElement> allGridCellList = irregularTablePage.allGridCellList;
    List<WebElement> allRowList = irregularTablePage.allRowList;
    List<WebElement> nameRowElementList = irregularTablePage.nameRowElementList;
    List<WebElement> salaryRowElementList = irregularTablePage.salaryRowElementList;

    Driver driver = new Driver();

    @When("Headers da bulunan basliklar yazdırılır.")
    public void headers_da_bulunan_basliklar_yazdırılır() {
        int sayi = 0;

        for (WebElement headerTitleElement:headerTitleElementList) {
            System.out.println(sayi + ".Title: "+headerTitleElement.getText());
            sayi++;
        }
    }
    @When("{int}. sutunun başlığı yazdırılır.")
    public void sutunun_başlığı_yazdırılır(Integer number) {

        System.out.println("3.sutunun basligi : " + headerTitleElementList.get(number-1).getText());
        //listlerde index 0 dan başladığı için 3. almak için 2. yi çekmeliyiz.

    }
    @When("tablodaki tüm datalar yazdırılır.")
    public void tablodaki_tüm_datalar_yazdırılır() {
        int sayi = 0;
        for (WebElement gridCell:allGridCellList) {
            if (!gridCell.getText().isBlank()) {

                System.out.println(sayi + ".cell: "+gridCell.getText());
                sayi++;
            }
        }
    }
    @When("tabloda kaç tane boş olmayan hücre olduğu yazdırılır.")
    public void tabloda_kaç_tane_boş_olmayan_hücre_olduğu_yazdırılır() {
        int sayi = 0;
        for (WebElement gridCell:allGridCellList) {
            if (!gridCell.getText().isBlank()) {
                sayi++;
            }
        }
        System.out.println("boş olmayan hücre sayısı: "+sayi);
    }
    @When("tablodaki satır sayısı yazdırılır.")
    public void tablodaki_satır_sayısı_yazdırılır() {
        int sayi = 0;
        for (WebElement row:allRowList) {
            if (!row.getText().isBlank()) {
                sayi++;
            }
        }
        System.out.println("boş olmayan row sayısı: "+sayi);

    }
    @When("tablodaki sutun sayısı yazdırılır.")
    public void tablodaki_sutun_sayısı_yazdırılır() {
        System.out.println("Sutun sayısı: "+headerTitleElementList.size());
    }
    @When("tablodaki {int}. kolon yazdırılır.")
    public void tablodaki_kolon_yazdırılır(Integer number) {
        List<WebElement> ucuncuSutunElementleriList = driver.getDriver().findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td']["+number+"]"));
        int sayi = 0;
        for (WebElement ucuncuStunElementi:ucuncuSutunElementleriList) {

            if (!ucuncuStunElementi.getText().isBlank()) {
                System.out.println(ucuncuStunElementi.getText());
                sayi++;
            }
        }
    }
    @When("tablodaki first name i {string} olan kişinin salary bilgisi yazdırılır.")
    public void tablodaki_first_name_i_olan_kişinin_salary_bilgisi_yazdırılır(String text) {
        String arananKisi = text;
        for (int i = 0; i < nameRowElementList.size(); i++) {
            if (nameRowElementList.get(i).getText().equals(arananKisi)){
                System.out.println(arananKisi+"'nin maasi : " +
                        salaryRowElementList.get(i).getText() );
            }
        }
    }


}
