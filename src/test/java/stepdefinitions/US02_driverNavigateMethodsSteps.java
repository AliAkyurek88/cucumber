package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class US02_driverNavigateMethodsSteps {

    Driver driver = new Driver();

    @Given("navigate methodu kullanılarak amazon.com a gidilir")
    public void navigate_methodu_kullanılarak_amazon_com_a_gidilir() {
        driver.getDriver().navigate().to("https://www.amazon.com.tr");
    }
    @When("console a navigate methodu kullanıldı yazdırılır.")
    public void console_a_navigate_methodu_kullanıldı_yazdırılır() {
        System.out.println("navigate to methodu kullanıldı");
    }
    @When("iki dk thread sleep methodu kullanılarak beklenilir.")
    public void iki_dk_thread_sleep_methodu_kullanılarak_beklenilir() throws InterruptedException {
        Thread.sleep(2000);
    }
    @When("navigate methodu kullanılarak youtube.com a gidilir.")
    public void navigate_methodu_kullanılarak_youtube_com_a_gidilir() {
        driver.getDriver().navigate().to("https://www.youtube.com.tr");
    }
    @When("console a navigate methodu tekrar kullanıldı yazdırılır.")
    public void console_a_navigate_methodu_tekrar_kullanıldı_yazdırılır() {
        System.out.println("navigate to methodu tekrar kullanıldı");
    }
    @When("navigate back methodu kullanılarak sayfada geriye gidilir.")
    public void navigate_back_methodu_kullanılarak_sayfada_geriye_gidilir() {

        driver.getDriver().navigate().back();
    }
    @When("console a navigate back methodu kullanıldı yazdırılır.")
    public void console_a_navigate_back_methodu_kullanıldı_yazdırılır() {
        System.out.println("navigate back methodu kullanıldı");
    }
    @When("navigate forward methodu kullanılarak sayfada ileriye gidilir.")
    public void navigate_forward_methodu_kullanılarak_sayfada_ileriye_gidilir() {
        driver.getDriver().navigate().forward();
    }
    @When("console a navigate forward methodu kullanıldı yazdırılır.")
    public void console_a_navigate_forward_methodu_kullanıldı_yazdırılır() {
        System.out.println("navigate forward methodu kullanıldı");
    }
    @When("navigate refresh methodu kullanılarak sayfa yenilenir")
    public void navigate_refresh_methodu_kullanılarak_sayfa_yenilenir() {
        driver.getDriver().navigate().refresh();
    }
    @When("console a refresh methodu kullanıldı yazdırılır.")
    public void console_a_refresh_methodu_kullanıldı_yazdırılır() {
        System.out.println("navigate refresh  kullanıldı");
    }
    @When("console a driver navigate methodları kullanıldı yazdırılır.")
    public void console_a_driver_navigate_methodları_kullanıldı_yazdırılır() {
        System.out.println("driver navigate methodları kullanıldı");
    }
    @Then("driverdan çıkılır.")
    public void driverdan_çıkılır() {
        driver.getDriver().close();
    }


}
