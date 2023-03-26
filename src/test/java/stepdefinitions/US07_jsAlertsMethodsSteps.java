package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.JsAlertsPage;
import utilities.Driver;

public class US07_jsAlertsMethodsSteps {

    JsAlertsPage jsAlertsPage = new JsAlertsPage();
    Driver driver = new Driver();

    @When("sayfadaki ilk button tıklanır.")
    public void sayfadaki_ilk_button_tıklanır() {
        jsAlertsPage.firstButton.click();

    }
    @When("çıkan alertta alert methodu kullanılır. ok denilerek kapatılır. - switchTo.alert.accept")
    public void çıkan_alertta_alert_methodu_kullanılır_ok_denilerek_kapatılır_switch_to_alert_accept() {
        driver.getDriver().switchTo().alert().accept();
    }
    @When("ok buttonuna tıklandığı sayfadaki result elementi baz alınarak ve assert methodu kullanılarak test edilir.")
    public void ok_buttonuna_tıklandığı_sayfadaki_result_elementi_baz_alınarak_ve_assert_methodu_kullanılarak_test_edilir() {
        String expectedYazi= "You successfully clicked an alert";
        String actualResultYazisi= jsAlertsPage.resultElement.getText();
        Assert.assertEquals(expectedYazi,actualResultYazisi);
    }
    @When("sayfadaki ikinci button tıklanır")
    public void sayfadaki_ikinci_button_tıklanır() {
        jsAlertsPage.secondButton.click();
    }
    @When("çıkan alert uzerindeki yazinin {string} olduğu alert ve assert methodları kullanılarak test edilir. - switchTo.alert.getText")
    public void çıkan_alert_uzerindeki_yazinin_olduğu_alert_ve_assert_methodları_kullanılarak_test_edilir_switch_to_alert_get_text(String exampleString) {
        String expectedAlertYazisi=exampleString;
        String actualAlertYazisi= driver.getDriver().switchTo().alert().getText();

        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);
    }
    @When("mevcut alert cancel buttonuna tıklanarak kapatılır.")
    public void mevcut_alert_cancel_buttonuna_tıklanarak_kapatılır() {
        driver.getDriver().switchTo().alert().dismiss();
    }
    @When("cancel buttonuna tıklandığı sayfadaki result elementi baz alınarak ve assert methodu kullanılarak test edilir.")
    public void cancel_buttonuna_tıklandığı_sayfadaki_result_elementi_baz_alınarak_ve_assert_methodu_kullanılarak_test_edilir() {

        String expectedSonucYazisi="You clicked: Cancel";
        WebElement resultElementi= jsAlertsPage.resultElement;
        String actualSonucYazisi= resultElementi.getText();

        Assert.assertEquals(expectedSonucYazisi,actualSonucYazisi);
    }
    @When("sayfadaki üçüncü button tıklanır.")
    public void sayfadaki_üçüncü_button_tıklanır() {
        jsAlertsPage.thirdButton.click();
    }
    @When("çıkan alerta alert methodu kullanılarak {string} yazdırılır. - switchTo.alert.sendKeys")
    public void çıkan_alerta_alert_methodu_kullanılarak_yazdırılır_switch_to_alert_send_keys(String sendKeyString) {
        driver.getDriver().switchTo().alert().sendKeys(sendKeyString);
    }
    @When("ok butonuna tıklanarak alert kapatılır.")
    public void ok_butonuna_tıklanarak_alert_kapatılır() {
        driver.getDriver().switchTo().alert().accept();
    }
    @When("çıkan result sonucunun assert methodu ile yazdırılan yazı ile aynı olduğu test edilir.")
    public void çıkan_result_sonucunun_assert_methodu_ile_yazdırılan_yazı_ile_aynı_olduğu_test_edilir() {

        String expectedIcerik="Alerta yazdırılan deneme içeriği";
        WebElement resultElementi= jsAlertsPage.resultElement;
        String actualSonucYazisi= resultElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }


}
