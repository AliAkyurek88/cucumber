package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US15_regularTablesSteps {

    Driver driver = new Driver();
    ReusableMethods reusableMethods = new ReusableMethods();
    List<WebElement> satirlarListesi ;
    List<WebElement> ilkSatirinSutunListesi ;
    List<WebElement> besinciSutunElementleriListesi ;
    @When("sayfanın en altına inilir.")
    public void sayfanın_en_altına_inilir() {
        Actions actions= new Actions(driver.getDriver());
        actions.sendKeys(Keys.END).perform();
    }
    @When("sayfanın altındaki tablonun tüm body'si yazdırılır.")
    public void sayfanın_altındaki_tablonun_tüm_body_si_yazdırılır() {
        WebElement tumBody= driver.getDriver().findElement(By.xpath("//tbody"));
        System.out.println("tum body : "+tumBody.getText());
    }
    @When("sayfanın altındaki tablonun satır sayısının {int} olduğu test edilir.")
    public void sayfanın_altındaki_tablonun_satır_sayısının_olduğu_test_edilir(Integer satirSayisi) {
        satirlarListesi = driver.getDriver().findElements(By.xpath("//tbody/tr"));
        System.out.println("satirSayisi"+satirSayisi);
        System.out.println("satirlarListesi"+satirlarListesi.size());
        Assert.assertTrue(satirlarListesi.size() == satirSayisi);
    }
    @When("sayfanın altındaki tablonun tüm satırlarını yazdırın.")
    public void sayfanın_altındaki_tablonun_tüm_satırlarını_yazdırın() {

       int satirNo = 1;

        satirlarListesi = driver.getDriver().findElements(By.xpath("//tbody/tr"));

        for (WebElement satir: satirlarListesi){
            System.out.println("====="+satirNo+".satir=====");
            System.out.println(satir.getText());
            satirNo++;
        }
    }
    @When("sayfanın altındaki tablonun ilk satırının sutun sayısının {int} olduğunu test edin.")
    public void sayfanınAltındakiTablonunIlkSatırınınSutunSayısınınOlduğunuTestEdin(int sutunSayisi) {

        ilkSatirinSutunListesi = driver.getDriver().findElements(By.xpath("//tbody/tr[1]/td"));
        Assert.assertTrue(ilkSatirinSutunListesi.size()==sutunSayisi);

    }

    @When("sayfanın altındaki tablonun besinci sutununu yazdırın.")
    public void sayfanın_altındaki_tablonun_besinci_sutununu_yazdırın() {
        int sutunNo = 1;
        besinciSutunElementleriListesi=  driver.getDriver().findElements(By.xpath("//tbody/tr/td[5]"));
        for (WebElement sutun: besinciSutunElementleriListesi){
            System.out.println("====="+sutunNo+".sutun=====");
            System.out.println(sutun.getText());
            sutunNo++;
        }
    }
    @When("hazırladığınız bir method yardımı ile satır ve sutun sayısını parametre olarak alıp hücredeki bilgiyi string olarak döndürün.")
    public void hazırladığınız_bir_method_yardımı_ile_satır_ve_sutun_sayısını_parametre_olarak_alıp_hücredeki_bilgiyi_string_olarak_döndürün() {
        System.out.println("Istenen hucredeki bilgiler\n"+ reusableMethods.getCellValue(5, 7));
    }

}
