package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class US06_assertionMethodsSteps {

    Driver driver = new Driver();
    @Given("Console a asserTrue testi başlıyor yazdırılır")
    public void consoleAAsserTrueTestiBaşlıyorYazdırılır() {
        System.out.println("asserTrue testi başlıyor");
    }
    @When("Oluşturulan sayının assertTrue methodu kullanılarak elliden büyük olduğu kontrol edilir.")
    public void oluşturulan_sayının_assert_true_methodu_kullanılarak_elliden_büyük_olduğu_kontrol_edilir() {
        int sayi = 100;
        Assert.assertTrue(sayi>50);
    }
    @When("Console a  asserTrue testi bitti yazdırılır.")
    public void console_a_asser_true_testi_bitti_yazdırılır() {
        System.out.println("asserTrue testi bitti");
    }

    @When("Console a  assertFalse testi başlıyor yazdırılır.")
    public void console_a_assert_false_testi_başlıyor_yazdırılır() {
        System.out.println("assertFalse testi başlıyor");
    }
    @When("Oluşturulan sayının assertFalse methodu kullanılarak ikiyüzden büyük olmadığı kontrol edilir.")
    public void oluşturulanSayınınAssertFalseMethoduKullanılarakIkiyüzdenBüyükOlmadığıKontrolEdilir() {
        int sayi = 100;
        Assert.assertFalse(sayi>200);
    }
    @When("Console a  assertFalse testi bitti yazdırılır.")
    public void console_a_assert_false_testi_bitti_yazdırılır() {
        System.out.println("assertFalse testi bitti");
    }

    @When("Console a  assertEquals testi başlıyor yazdırılır.")
    public void console_a_assert_equals_testi_başlıyor_yazdırılır() {
        System.out.println("assertEquals testi başlıyor");
    }
    @When("Oluşturulan sayının assertEquals methodu kullanılarak yüze eşit olduğu olduğu kontrol edilir.")
    public void oluşturulan_sayının_assert_equals_methodu_kullanılarak_yüze_eşit_olduğu_olduğu_kontrol_edilir() {
        int sayi = 100;
        Assert.assertEquals(sayi,100);
    }
    @When("Console a  assertEquals testi bitti yazdırılır.")
    public void console_a_assert_equals_testi_bitti_yazdırılır() {
        System.out.println("assertEquals testi bitti");
    }

    @When("Console a  assertNotEquals testi başlıyor yazdırılır.")
    public void console_a_assert_not_equals_testi_başlıyor_yazdırılır() {
        System.out.println("assertNotEquals testi başlıyor");
    }
    @When("Oluşturulan  sayının assertNotEquals methodu kullanılarak ikiyüze eşit olmadığı kontrol edilir.")
    public void oluşturulan_sayının_assert_not_equals_methodu_kullanılarak_ikiyüze_eşit_olmadığı_kontrol_edilir() {
        int sayi = 100;
        Assert.assertNotEquals(sayi,200);
    }
    @When("Console a  assertNotEquals testi bitti yazdırılır.")
    public void console_a_assert_not_equals_testi_bitti_yazdırılır() {
        System.out.println("assertNotEquals testi bitti");
    }

    @When("sayfa başlığının {string} olduğu test edilir.")
    public void sayfa_başlığının_olduğu_test_edilir(String pageTitle) {
        String exceptedTitle = driver.getDriver().getTitle();
        String actualTitle = pageTitle;
        System.out.println(exceptedTitle);
        System.out.println(actualTitle);
        Assert.assertEquals(exceptedTitle,actualTitle);
    }
    @When("sayfa başlığının {string} olmadığı test edilir.")
    public void sayfa_başlığının_olmadığı_test_edilir(String wrongPageTitle) {
        String exceptedTitle = driver.getDriver().getTitle();
        String actualTitle = wrongPageTitle;
        System.out.println(exceptedTitle);
        System.out.println(actualTitle);
        Assert.assertNotEquals(exceptedTitle,actualTitle);
    }
    @When("logo görselinin görüntülendiği test edilir isDisplayed.")
    public void logo_görselinin_görüntülendiği_test_edilir_is_displayed() {
        WebElement exceptedLogo =  driver.getDriver().findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        Assert.assertTrue(exceptedLogo.isDisplayed());
    }
    @When("arama kutusunun erişilebilir olduğu test edilir isEnabled.")
    public void arama_kutusunun_erişilebilir_olduğu_test_edilir_is_enabled() {
        WebElement exceptedSearchBox =  driver.getDriver().findElement(By.xpath("//div[@id='search-input']/input[@id='search']"));
        Assert.assertTrue(exceptedSearchBox.isEnabled());
    }
    @When("cookies kabul edilir")
    public void cookies_kabul_edilir() {

    }
    @When("hediye fikirleri butonuna tıklanır")
    public void hediye_fikirleri_butonuna_tıklanır() {

    }
    @When("radio button elementlerinden biri  seçilir.")
    public void radio_button_elementlerinden_biri_seçilir() {

    }
    @When("seçilmeyen checkboxlar var ise seçilir.")
    public void seçilmeyen_checkboxlar_var_ise_seçilir() {

    }
    @When("drop downd içerisinden bir item seçilir.")
    public void drop_downd_içerisinden_bir_item_seçilir() {

    }

}
