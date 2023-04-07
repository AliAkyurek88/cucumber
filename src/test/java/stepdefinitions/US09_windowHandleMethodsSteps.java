package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import pages.WindowsHandlePage;
import utilities.Driver;
import org.openqa.selenium.WindowType;
import java.util.Set;

public class US09_windowHandleMethodsSteps {

    String ilkSayfaWindowhandleDegeri;
    String ikinciSayfaWindowHandleDegeri;
    String ucuncuSayfaWindowHandleDegeri;
    Set<String> windowHandleSeti;
    Driver driver = new Driver();
    AmazonPage amazonPage = new AmazonPage();
    WindowsHandlePage windowsHandlePage = new WindowsHandlePage();

    @When("arama sonuclarinin arattığımız metin olan nutella icerdigi test edelir.")
    public void arama_sonuclarinin_arattığımız_metin_olan_nutella_icerdigi_test_edelir() {
        WebElement aramaSonucElementi = amazonPage.aramaSonucElementi;
        String expectedIcerik="nutella";
        String actualSonucYazisi= aramaSonucElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }
    @When("mevcut sayfanın handle değeri alınır.")
    public void mevcut_sayfanın_handle_değeri_alınır() {
      ilkSayfaWindowhandleDegeri = driver.getDriver().getWindowHandle();

    }
    @When("yeni bir tab açılır. - driver.switchTo.newWindow")
    public void yeni_bir_tab_açılır_driver_switch_to_new_window() {
       driver.getDriver().switchTo().newWindow(WindowType.TAB);
       ikinciSayfaWindowHandleDegeri = driver.getDriver().getWindowHandle();


    }
    @When("arama sonuclarinin arattığımız metin olan samsung icerdigi test edelir.")
    public void arama_sonuclarinin_arattığımız_metin_olan_samsung_icerdigi_test_edelir() {
        WebElement aramaSonucElementi= amazonPage.aramaSonucElementi;
        String expectedIcerik="samsung";
        String actualSonucYazisi= aramaSonucElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }
    @When("yeniden nutella arattigimiz sayfaya geçelim. - driver.switchTo.window")
    public void yeniden_nutella_arattigimiz_sayfaya_geçelim_driver_switch_to_window() {
        driver.getDriver().switchTo().window(ilkSayfaWindowhandleDegeri);
    }
    @When("yeniden nutella arattigimiz sayfada arama sonuclarini yazdiralim.")
    public void yeniden_nutella_arattigimiz_sayfada_arama_sonuclarini_yazdiralim() {
        WebElement aramaSonucElementi = amazonPage.aramaSonucElementi;
        String expectedIcerik="nutella";
        String actualSonucYazisi= aramaSonucElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }

    @When("sayfadaki yazinin {string} oldugunu test edilir.")
    public void sayfadaki_yazinin_oldugunu_test_edilir(String text) {
        WebElement yaziElementi= windowsHandlePage.yaziElementi;
        String expectedYazi=text;
        String actualYazi= yaziElementi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);
        ilkSayfaWindowhandleDegeri = driver.getDriver().getWindowHandle();
    }
    @When("click here linki tiklanır.")
    public void click_here_linki_tiklanır() {
       windowsHandlePage.clickHereButton.click();
    }
    @When("loop oluşturularak sayfanın ikinci tab window değeri alınır.")
    public void loop_oluşturularak_sayfanın_ikinci_tab_window_değeri_alınır() {

       /*
            Bir onceki class'da switchTo().newWindow diyerek yeni sayfa actigimizda
            driver da otomatik olarak yeni sayfaya gecmisti
            Ancak bu soruda switchTo().newWindow demeden
            tikladigimiz bir link 2.tab'i olusturdu

            BU DURUMDA driver OTOMATIK OLARAK yeni sayfaya GECMEZ

            Bizim Java'daki yontemleri kullanarak
            2.sayfanin windowHANDLEDEGERINI BULMAMIZ LAZIM

            getWindowhandles() iki sayfanin handle degerlerini Set olarak verir
            Set index desteklemedigi icin 2.windowhandleDegerini direk alamayiz

            Bir loop ileSet'i gozden gecirip
            ilksayfaWindowHandleDegeri'ne esit OLMAYAN String'i
            ikinciSayfaWindowhandleDegeri olarak atayalim
         */

        Set<String> windowHandleSeti=  driver.getDriver().getWindowHandles();

        for (String windowHandle: windowHandleSeti){

            if(windowHandle != ilkSayfaWindowhandleDegeri){
                ikinciSayfaWindowHandleDegeri = windowHandle;
            }
        }

        System.out.println("ikinci windows değeri: "+ikinciSayfaWindowHandleDegeri+" "+"ilk windows değeri: "+ilkSayfaWindowhandleDegeri);
    }
    @When("alınan değerler ikinci taba geçilerek oradaki yazinin {string} oldugunu test edilir.")
    public void alınan_değerler_ikinci_taba_geçilerek_oradaki_yazinin_oldugunu_test_edilir(String text) {
        driver.getDriver().switchTo().window(ikinciSayfaWindowHandleDegeri);
        WebElement ikinciSayfaYazi= driver.getDriver().findElement(By.tagName("h3"));
        String expectedYazi=text;
        String actualYazi=ikinciSayfaYazi.getText();

        Assert.assertEquals(expectedYazi,actualYazi);
    }
    @When("yeniden ilk sayfaya geçilir.")
    public void yeniden_ilk_sayfaya_geçilir() {
        driver.getDriver().switchTo().window(ilkSayfaWindowhandleDegeri);
    }
    @When("urlin {string} olduğu test edilir")
    public void urlin_olduğu_test_edilir(String text) {
        String expectedUrl= text;
        String actualUrl= driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("expectedUrl: "+ expectedUrl);
        System.out.println("actualUrl: "+ actualUrl);
    }

}
