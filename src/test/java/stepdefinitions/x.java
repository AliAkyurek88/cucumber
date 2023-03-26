package stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.Driver;

public class x {


    AmazonPage amazonPage = new AmazonPage();

    @When("cookies kabul edilir")
    public void cookies_kabul_edilir() {
        amazonPage.cookieButton.click();
    }

    @When("amazon arama kutusuna {string} yazılır.")
    public void amazon_arama_kutusuna_yazılır(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime);
    }

    @When("amazon arama butonuna tıklanır.")
    public void amazon_arama_butonuna_tıklanır() {
        amazonPage.aramaButton.click();
    }

    @When("gaming laptop için çıkan sonuçlarda fiyat olarak onbeş bin TL checkbox seçilir.")
    public void gaming_laptop_için_çıkan_sonuçlarda_fiyat_olarak_onbeş_bin_tl_checkbox_seçilir() {
        amazonPage.fiyatCheckBox.click();
    }
    @When("amazon sıralama dropdown içinde kaç option olduğu consola yazdırılır.")
    public void amazon_sıralama_dropdown_içinde_kaç_option_olduğu_consola_yazdırılır() {
        Select select = new Select(amazonPage.siralamaDropDown);
        int selectsize = select.getOptions().size();
        System.out.println("sıralama drop item sayısı: "+ selectsize);
    }
    @When("amazon sıralama dropdown içerisinden {string}  dropdown itemı seçilir.")
    public void amazon_sıralama_dropdown_içerisinden_dropdown_itemı_seçilir(String dropDownItemText) {
        Select select = new Select(amazonPage.siralamaDropDown);
        select.selectByVisibleText(dropDownItemText);
    }



}
