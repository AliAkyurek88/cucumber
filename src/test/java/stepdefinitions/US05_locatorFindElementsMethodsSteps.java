package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class US05_locatorFindElementsMethodsSteps {

    Driver driver = new Driver();
    List<WebElement> linkElementleriListesi;

    int linkElementleriSayisi;
    @Given("{string} adresine gidilir.")
    public void adresine_gidilir(String gidilecekAdres) {
        driver.getDriver().get(gidilecekAdres);
    }
    @When("find elements methodu kullanılarak sayfadaki linkler bulunur.")
    public void find_elements_methodu_kullanılarak_sayfadaki_linkler_bulunur() {
        linkElementleriListesi = driver.getDriver().findElements(By.tagName("a"));
    }
    @When("bulunan değerler console a yazdırılır.")
    public void bulunan_değerler_console_a_yazdırılır() {
        System.out.println("Link Değerleri: "+ linkElementleriListesi);
    }
    @When("find elements methodu kullanılarak sayfada bulunan linklerin kaç tane olduğu \\(size) bulunur.")
    public void find_elements_methodu_kullanılarak_sayfada_bulunan_linklerin_kaç_tane_olduğu_size_bulunur() {
        linkElementleriSayisi = linkElementleriListesi.size();
    }
    @When("bulunan değer console a yazdırılır.")
    public void bulunan_değer_console_a_yazdırılır() {
        System.out.println("Link Değerleri Sayısı: "+ linkElementleriSayisi);
    }
    @Then("driver kapatılır.")
    public void driver_kapatılır() {
        driver.closeDriver();
    }

}
