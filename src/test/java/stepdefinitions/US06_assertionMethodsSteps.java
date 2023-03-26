package stepdefinitions;


import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.Driver;

public class US06_assertionMethodsSteps {

    Driver driver = new Driver();


    @When("Oluşturulan sayının assertTrue methodu kullanılarak elliden büyük olduğu kontrol edilir.")
    public void oluşturulan_sayının_assert_true_methodu_kullanılarak_elliden_büyük_olduğu_kontrol_edilir() {
        int sayi = 100;
        Assert.assertTrue(sayi>50);
    }
    @When("Oluşturulan sayının assertFalse methodu kullanılarak ikiyüzden büyük olmadığı kontrol edilir.")
    public void oluşturulan_sayının_assert_false_methodu_kullanılarak_ikiyüzden_büyük_olmadığı_kontrol_edilir() {
        int sayi = 100;
        Assert.assertFalse(sayi>200);
    }
    @When("Oluşturulan sayının assertEquals methodu kullanılarak yüze eşit olduğu olduğu kontrol edilir.")
    public void oluşturulan_sayının_assert_equals_methodu_kullanılarak_yüze_eşit_olduğu_olduğu_kontrol_edilir() {
        int sayi = 100;
        Assert.assertEquals(sayi,100);
    }
    @When("Oluşturulan  sayının assertNotEquals methodu kullanılarak ikiyüze eşit olmadığı kontrol edilir.")
    public void oluşturulan_sayının_assert_not_equals_methodu_kullanılarak_ikiyüze_eşit_olmadığı_kontrol_edilir() {
        int sayi = 100;
        Assert.assertNotEquals(sayi,200);
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


}
