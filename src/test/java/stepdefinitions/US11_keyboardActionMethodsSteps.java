package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.FacebookPage;
import pages.KeyboardActionPage;
import utilities.Driver;

public class US11_keyboardActionMethodsSteps {

    Driver driver = new Driver();
    KeyboardActionPage keyboardActionPage = new KeyboardActionPage();
    FacebookPage facebookPage = new FacebookPage();
    Actions actions = new Actions(driver.getDriver());
    Faker faker = new Faker();

     /*
            Bir tablo doldurulurken
            Rastgele isim,soyisim,tel no, adres, sehir, password....
            gibi bilgileri rastgele girmek istersek
            faker kutuphanesinden faydalaniriz

            Bunun icin oncelikle Faker dependency'yi pom.xml'e ekler
            ve kullanmak icin de Faker class'indan bir obje olustururuz

         */

    @When("keyboard komutları kullanılarak java test automation engineer menusune kadar  sayfada aşağı inilir. - page_down")
    public void keyboard_komutları_kullanılarak_java_test_automation_engineer_menusune_kadar_sayfada_aşağı_inilir_page_down() {
        Actions actions= new Actions(driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
    }
    @When("java test automation engineer menusune tıklanır.")
    public void java_test_automation_engineer_menusune_tıklanır() {
         keyboardActionPage.menuButton.click();
    }
    @When("menuye tıklandığı url'in automation-engineer içerdiğine bakılarak test edilir.")
    public void menuye_tıklandığı_url_in_automation_engineer_içerdiğine_bakılarak_test_edilir() {
        String expectedIcerik="software-development-engineer-in-test-sdet";
        String actualUrl= driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
    }
    @When("cookies uyarısı kapatılır.")
    public void cookies_uyarısı_kapatılır() {
         facebookPage.cookiesAcceptButton.click();

    }
    @When("Yeni kayıt oluştur butonuna tıklanır.")
    public void yeni_kayıt_oluştur_butonuna_tıklanır() {
        facebookPage.yeniKayitButton.click();
    }
    @When("açılan formda tüm alanlar keyboard action ve faker file komutlarındanda yardım alınarak doldurulur.")
    public void açılan_formda_tüm_alanlar_keyboard_action_ve_faker_file_komutlarındanda_yardım_alınarak_doldurulur() {
        String mail= faker.internet().emailAddress();

        actions.click(facebookPage.isimInput)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(mail)
                .sendKeys(Keys.TAB)
                .sendKeys(mail)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("12")
                .sendKeys(Keys.TAB)
                .sendKeys("Feb")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).perform();

    }
    @When("kaydol butonuna tıklanır.")
    public void kaydol_butonuna_tıklanır() {
        actions.click(facebookPage.yeniKayitButton).sendKeys(Keys.ENTER).perform();

    }

}
