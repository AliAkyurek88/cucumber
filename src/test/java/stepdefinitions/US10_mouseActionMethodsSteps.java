package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import pages.MouseActionPage;
import utilities.Driver;

import java.util.Set;

public class US10_mouseActionMethodsSteps {

    Driver driver = new Driver();
    MouseActionPage mouseActionPage = new MouseActionPage();
    AmazonPage amazonPage = new AmazonPage();
    String ilkSayfaWindowHandleDegeri;
    String ikinciSayfaWindowHandleDegeri;
    String expectedAlertYazisi;
    String actualAlertYazisi;
    String expectedYazi;
    String actualYazi;
    String expectedYaziElementi;
    String actualYaziElementi;

    @When("çizili alan uzerinde sag click yapılır. actions.contextClick")
    public void çizili_alan_uzerinde_sag_click_yapılır_actions_context_click() {

        Actions actions=new Actions(driver.getDriver());
        actions.contextClick(mouseActionPage.ciziliAlanElementi).perform();
    }
    @When("Alert’te cikan yazinin “You selected a context menu” oldugunu test edilir.")
    public void alert_te_cikan_yazinin_you_selected_a_context_menu_oldugunu_test_edilir() {
        expectedAlertYazisi="You selected a context menu";
        actualAlertYazisi= driver.getDriver().switchTo().alert().getText();

        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);
    }
    @When("Tamam diyerek alert’i kapatılır.")
    public void tamam_diyerek_alert_i_kapatılır() {
        driver.getDriver().switchTo().alert().accept();
    }
    @When("mevcut sayfanın window handle değeri alınır.")
    public void mevcut_sayfanın_window_handle_değeri_alınır() {
         ilkSayfaWindowHandleDegeri = driver.getDriver().getWindowHandle();
    }
    @When("elemental Selenium linkine tiklanır.")
    public void elemental_selenium_linkine_tiklanır() {
       mouseActionPage.elementalSeleniumLink.click();
    }
    @When("yeni açılan tabın window handle değeri alınır.")
    public void yeni_açılan_tabın_window_handle_değeri_alınır() {
        Set<String> windowHandleSeti= driver.getDriver().getWindowHandles();

        for (String each: windowHandleSeti) {

            if (!each.equals(ilkSayfaWindowHandleDegeri)){
                ikinciSayfaWindowHandleDegeri=each;
            }
        }
    }
    @When("yeni açılan taba geçiş yapılır.")
    public void yeniAçılanTabaGeçişYapılır() {
        driver.getDriver().switchTo().window(ikinciSayfaWindowHandleDegeri);
    }
    @When("Acilan sayfada h1 taginda “Elemental Selenium” yazdigi test edilir.")
    public void acilan_sayfada_h1_taginda_elemental_selenium_yazdigi_test_edilir() {
        expectedYazi="Elemental Selenium";
        actualYazi=mouseActionPage.yaziElementi.getText();

        Assert.assertEquals(expectedYazi,actualYazi);
    }
    @When("Drag me butonunu tutulur Drop here kutusunun ustune birakalır")
    public void drag_me_butonunu_tutulur_drop_here_kutusunun_ustune_birakalır() {
        Actions actions = new Actions(driver.getDriver());
        WebElement dragMe = mouseActionPage.dragMe;
        WebElement dropHere = mouseActionPage.dropHere;
        actions.dragAndDrop(dragMe,dropHere).perform();
    }
    @When("Drop here yazısının Dropped oldugunu test edilir.")
    public void drop_here_yazısının_dropped_oldugunu_test_edilir() {
        WebElement droppedElementi = mouseActionPage.droppedElementi;
        expectedYaziElementi="Dropped!";
        actualYaziElementi=droppedElementi.getText();

        Assert.assertEquals(expectedYaziElementi,actualYaziElementi);
    }
    @When("Sag ust bolumde bulunan Account & Lists menusunun acilmasi icin mouse bu menunun ustune getirilir.")
    public void sag_ust_bolumde_bulunan_account_lists_menusunun_acilmasi_icin_mouse_bu_menunun_ustune_getirilir() {
        WebElement accountListElementi = amazonPage.accountListElementi;
        Actions actions= new Actions(driver.getDriver());
        actions.moveToElement(accountListElementi).perform();
    }
    @When("Create a list butonuna tıklanır.")
    public void create_a_list_butonuna_tıklanır() {
       amazonPage.createAListLink.click();
    }
    @When("Acilan sayfada Your List elementinin görünür olduğu test edilir.")
    public void acilanSayfadaYourListElementininGörünürOlduğuTestEdilir() {
        WebElement yourListsElementi = amazonPage.yourListsElementi;
        Assert.assertTrue(yourListsElementi.isDisplayed());
    }
}
