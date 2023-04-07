package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class US12_fileMethodsSteps {

    Driver driver = new Driver();
    String dinamikDosyaYolu = System.getProperty("user.home")+ "/Downloads/logo.jpeg";
    @When("logo.jpeg dosyası indrilir")
    public void logo_jpeg_dosyası_indrilir() {
        driver.getDriver().findElement(By.linkText("logo.jpeg")).click();
    }
    @When("Userhome methodu kullanılarak downloads klasorune bakılır. Files.exists methodu kullanılır.")
    public void userhome_methodu_kullanılarak_downloads_klasorune_bakılır_files_exists_methodu_kullanılır() {
       Boolean dosyaIndirilebilmisMi = Files.exists(Paths.get(dinamikDosyaYolu));
       System.out.println("dosyaIndirilebilmisMi: "+dosyaIndirilebilmisMi);
    }
    @When("Dosyanın başarıyla indirildiği test edilir.")
    public void dosyanın_başarıyla_indirildiği_test_edilir() {
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
    }
    @When("upload butonuna tıklanır.")
    public void upload_butonuna_tıklanır() {
        driver.getDriver().findElement(By.id("file-submit")).click();
    }
    @When("logo.jpeg dosyası locate edilip seçilir ve upload edilir.")
    public void logo_jpeg_dosyası_locate_edilip_seçilir_ve_upload_edilir() {
             /*
            Selenium webDriver kullanir
            ve webDriver bilgisayarimizdaki dosyalara ulasamaz
            klasorleri acip kapatamaz

            Ancak bunun yerine Selenium yukleme yapabilmek icin
            bize bir yontem olusturmustur
         */
        WebElement chooseFileButonu= driver.getDriver().findElement(By.id("file-upload"));
        chooseFileButonu.sendKeys(dinamikDosyaYolu);
    }
    @When("File Uploaded textinin görüntülendiği test edilir.")
    public void file_uploaded_textinin_görüntülendiği_test_edilir() {
        WebElement yuklendiYaziElementi= driver.getDriver().findElement(By.xpath("//h3[text()='File Uploaded!']"));

        Assert.assertTrue(yuklendiYaziElementi.isDisplayed());

    }

}
