package stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import utilities.Driver;
import utilities.ReusableMethods;

public class US03_driverManageMethodsSteps {

    Driver driver = new Driver();


    @When("driver manage maximize methodu kullanılarak sayfa maximize edilir")
    public void driver_manage_maximize_methodu_kullanılarak_sayfa_maximize_edilir() {
        driver.getDriver().manage().window().maximize();


    }
    @When("console a drive manage maximize methodu  kullanıldı yazdırılır.")
    public void console_a_drive_manage_maximize_methodu_kullanıldı_yazdırılır() {
        System.out.println("drive manage maximize methodu  kullanıldı");
    }
    @When("driver manage set size methodu kullanılarak sayfa width bin height beşyüz olarak set size edilir")
    public void driver_manage_set_size_methodu_kullanılarak_sayfa_width_bin_height_beşyüz_olarak_set_size_edilir() {
        driver.getDriver().manage().window().setSize(new Dimension(1000,500));
    }
    @When("console a drive manage set size methodu  kullanıldı yazdırılır.")
    public void console_a_drive_manage_set_size_methodu_kullanıldı_yazdırılır() {
        System.out.println("drive manage set size methodu  kullanıldı");
    }
    @When("driver manage set position methodu kullanılarak sayfa x yüz y yüz olarak pozisyon edilir")
    public void driver_manage_set_position_methodu_kullanılarak_sayfa_x_yüz_y_yüz_olarak_pozisyon_edilir() {
        driver.getDriver().manage().window().setSize(new Dimension(1000,500));
    }
    @When("console a drive manage set position methodu  kullanıldı yazdırılır.")
    public void console_a_drive_manage_set_position_methodu_kullanıldı_yazdırılır() {
        System.out.println("drive manage set position methodu  kullanıldı");
    }


}
