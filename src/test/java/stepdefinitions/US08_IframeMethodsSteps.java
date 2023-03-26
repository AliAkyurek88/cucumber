package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.IframePage;
import utilities.Driver;

public class US08_IframeMethodsSteps {

    Driver driver = new Driver();
    IframePage iframePage = new IframePage();

    @When("h tagı olan An IFrame containing textinin erişebilir olduğu test edilir ve konsola yazdırılır.")
    public void hTagıOlanAnIFrameContainingTextininErişebilirOlduğuTestEdilirVeKonsolaYazdırılır() {
        Assert.assertTrue(iframePage.anIframeYaziElementi.isEnabled());
        System.out.println(iframePage.anIframeYaziElementi.getText());
    }
    @When("iframe e geçiş yaplır.")
    public void iframe_e_geçiş_yaplır() {
        driver.getDriver().switchTo().frame(iframePage.iframeElementi);
    }
    @When("iframe içerisindeki textbox temizlenir.")
    public void iframe_içerisindeki_textbox_temizlenir() {
      iframePage.textBoxElementi.clear();
    }
    @When("iframe içerisindeki textboxa {string} yazdırılır.")
    public void iframe_içerisindeki_textboxa_yazdırılır(String text) {
        iframePage.textBoxElementi.sendKeys(text);
    }
    @When("iframeden çıkış yapılıp ana sayfaya geçilir.")
    public void iframeden_çıkış_yapılıp_ana_sayfaya_geçilir() {
        driver.getDriver().switchTo().defaultContent();
    }
    @When("elemental selenium elementi nin görünür olduğu test edilir.")
    public void elemental_selenium_elementi_nin_görünür_olduğu_test_edilir() {
        Assert.assertTrue(iframePage.elementalSeleniumElementi.isDisplayed());
    }
    @When("elemental selenium elementinin texti consola yazdırılır.")
    public void elemental_selenium_elementinin_texti_consola_yazdırılır() {
        System.out.println(iframePage.elementalSeleniumElementi.getText());
    }
    @When("not: iç içe iframe'ler varsa bu kod bir ust iframe'e gecis saglayan kod bu case in altında")
    public void not_iç_içe_iframe_ler_varsa_bu_kod_bir_ust_iframe_e_gecis_saglayan_kod_bu_case_in_altında() {
        //driver.switchTo().parentFrame();
    }


}
