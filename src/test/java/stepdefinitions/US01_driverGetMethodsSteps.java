package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

import java.util.Set;

public class US01_driverGetMethodsSteps {

    Driver driver = new Driver();
    String title;
    String url;
    String windowHandle;
    Set<String> windowHandles ;


    @Given("get methodu kullanılarak amazon.com a gidilir")
    public void get_methodu_kullanılarak_amazon_com_a_gidilir() {

        driver.getDriver().get("https://www.amazon.com.tr");
    }
    @When("console a get methodu kullanıldı yazdırılır.")
    public void console_a_get_methodu_kullanıldı_yazdırılır() {
        System.out.println("get methodu kullanıldı");
    }
    @When("getTitle methodu kullanılarak sayfanın başlığı çekilir.")
    public void get_title_methodu_kullanılarak_sayfanın_başlığı_çekilir() {
        title =  driver.getDriver().getTitle();

    }
    @When("getTitle methodu kullanılarak çekilen başlık console a yazdırılır.")
    public void get_title_methodu_kullanılarak_çekilen_başlık_console_a_yazdırılır() {
        System.out.println("title: "+title);
    }
    @When("getCurrentUrl methodu kullanılarak sayfanın url adresi çekilir.")
    public void get_current_url_methodu_kullanılarak_sayfanın_url_adresi_çekilir() {
        url = driver.getDriver().getCurrentUrl();

    }
    @When("getCurrentUrl methodu kullanılarak çekilen url console a yazdırılır.")
    public void get_current_url_methodu_kullanılarak_çekilen_url_console_a_yazdırılır() {
        System.out.println("url: "+url);
    }
    @When("getWindowHandle methodu kullanılarak sayfanın window handle değeri çekilir.")
    public void get_window_handle_methodu_kullanılarak_sayfanın_window_handle_değeri_çekilir() {
        windowHandle = driver.getDriver().getWindowHandle();
    }
    @When("getWindowHandle methodu kullanılarak çekilen handle değeri console a yazdırılır.")
    public void get_window_handle_methodu_kullanılarak_çekilen_handle_değeri_console_a_yazdırılır() {
        System.out.println("windowHandle: "+windowHandle);
    }
    @When("getWindowHandles methodu kullanılarak sayfanın window handles değeri çekilir.")
    public void get_window_handles_methodu_kullanılarak_sayfanın_window_handles_değeri_çekilir() {
        windowHandles = driver.getDriver().getWindowHandles();
    }
    @When("getWindowHandles methodu kullanılarak çekilen handle seti değeri console a yazdırılır.")
    public void get_window_handles_methodu_kullanılarak_çekilen_handle_seti_değeri_console_a_yazdırılır() {

        System.out.println("windowHandles: "+windowHandles);
    }
    @Then("console a get methodları kullanıldı yazdırılır.")
    public void console_a_get_methodları_kullanıldı_yazdırılır() {
        System.out.println("get methodları kullanıldı.");
    }

}
