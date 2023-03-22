package stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utilities.Driver;

public class US04_locatorFindElementMethodsSteps {


    Driver driver = new Driver();
    @When("find element methodu kullanılarak sign in butonuna tıklanır.")
    public void find_element_methodu_kullanılarak_sign_in_butonuna_tıklanır() {
        driver.getDriver().findElement(By.xpath("//button[@id='signin_button']")).click();
    }
    @When("find element methodu kullanılarak username alanına {string} yazdırılır")
    public void find_element_methodu_kullanılarak_username_alanına_yazdırılır(String username) {
        driver.getDriver().findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
    }
    @When("find element methodu kullanılarak password alanına {string} yazdırılır.")
    public void findElementMethoduKullanılarakPasswordAlanınaYazdırılır(String password) {
        driver.getDriver().findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
    }

    @When("find element methodu kullanılarak submit butonuna tıklanarak zero bank sitesine giriş yapılır.")
    public void findElementMethoduKullanılarakSubmitButonunaTıklanarakZeroBankSitesineGirişYapılır() {
        driver.getDriver().findElement(By.xpath("//input[@name='submit']")).click();
    }

}
