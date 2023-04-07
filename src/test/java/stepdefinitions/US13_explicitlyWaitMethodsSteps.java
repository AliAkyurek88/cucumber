package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class US13_explicitlyWaitMethodsSteps {

    Driver driver = new Driver();
    @When("remove butonuna tıklanır.")
    public void remove_butonuna_tıklanır() {
        driver.getDriver().findElement(By.xpath("//button[text()='Remove']")).click();
    }
    @When("It’s gone! mesaji görünür olana kadar bekleyip görünür olduğu edilir.")
    public void ıt_s_gone_mesaji_görünür_olana_kadar_bekleyip_görünür_olduğu_edilir() {

        // Explicitly wait sadece implicitly wait'in bekleme suresinden
        // daha fazla zamana ihtiyac duyan spesifik gorevlerde kullanilir
        // implicitly wait ==> tum sayfa ve tum webelementler icin gecerli maximum bekleme suresi iken
        // Explicitly wait ==> sadece bir webelement ve tanimlanan tek bir islem icin gecerli olur

        // it's gone yazisinin gorunur olmasi icin beklememiz gerekiyor
        // once locate edip sonra o element gorunur oluncaya kadar bekle diyemeyiz
        // cunku OLMAYAN elementi locate edemeyiz

        // BU islem icin locate'i driver'a verip,
        // bu locate 'de istedigim eleman gorunur oluncaya kadar bekle demeliyiz

        WebDriverWait wait = new WebDriverWait(driver.getDriver(), Duration.ofSeconds(45));

        WebElement itsGoneElementi= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\"It's gone!\"]")));
        Assert.assertTrue(itsGoneElementi.isDisplayed());

    }
    @When("add butonuna tıklanır.")
    public void add_butonuna_tıklanır() {
        driver.getDriver().findElement(By.xpath("//button[text()=\"Add\"]")).click();
    }
    @When("It’s back mesajinin gorundugu test edilir.")
    public void ıt_s_back_mesajinin_gorundugu_test_edilir() {
        WebDriverWait wait = new WebDriverWait(driver.getDriver(), Duration.ofSeconds(45));
        WebElement itsBackElementi= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id=\"message\"]")));
        Assert.assertTrue(itsBackElementi.isDisplayed());
    }

}
