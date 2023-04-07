package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import utilities.Driver;

import java.util.Set;

public class US14_cookieMethodsSteps {

    Driver driver = new Driver();
    Set<Cookie> cookiesSeti=driver.getDriver().manage().getCookies();
    String expectedDeger;
    String actualDeger;

    @When("tum cookie’ler listelenir.")
    public void tum_cookie_ler_listelenir() {

        int siraNo=1;

        for (Cookie eachCookie: cookiesSeti
        ) {
            System.out.println(siraNo+" - " + eachCookie);
            siraNo++;
        }
    }
    @When("sayfadaki cookies sayisi bulunur.")
    public void sayfadaki_cookies_sayisi_bulunur() {
        System.out.println("sayfadaki cookies sayisi: "+cookiesSeti.size());
    }
    @When("ismi i18n-prefs olan cookie degerinin USD oldugunu test edilir.")
    public void ismi_i18n_prefs_olan_cookie_degerinin_usd_oldugunu_test_edilir() {
         expectedDeger="USD";
         actualDeger= driver.getDriver().manage().getCookieNamed("i18n-prefs").getValue();
         Assert.assertEquals(expectedDeger,actualDeger);
    }
    @When("ismi en sevdigim cookie ve degeri cikolatali olan bir cookie olusturulur ve sayfaya eklenir.")
    public void ismi_en_sevdigim_cookie_ve_degeri_cikolatali_olan_bir_cookie_olusturulur_ve_sayfaya_eklenir() {
        Cookie eklenecekCookie= new Cookie("enSevdigimCookie","uzumlu ve cikolatali");
        driver.getDriver().manage().addCookie(eklenecekCookie);

        cookiesSeti = driver.getDriver().manage().getCookies();
        System.out.println("=================");
        int siraNo=1;

        for (Cookie eachCookie: cookiesSeti
        ) {
            System.out.println(siraNo+" - " + eachCookie);
            siraNo++;}

    }
    @When("eklenilen cookie’nin sayfaya eklendigi test edilir.")
    public void eklenilen_cookie_nin_sayfaya_eklendigi_test_edilir() {
        expectedDeger="uzumlu ve cikolatali";
        actualDeger= driver.getDriver().manage().getCookieNamed("enSevdigimCookie").getValue();
        Assert.assertEquals(expectedDeger,actualDeger);
    }
    @When("ismi skin olan cookie silinir ve silindigini test edilir.")
    public void ismi_skin_olan_cookie_silinir_ve_silindigini_test_edilir() {
        driver.getDriver().manage().deleteCookieNamed("skin");

        cookiesSeti=driver.getDriver().manage().getCookies();
        System.out.println("=================");
        int siraNo=1;

        for (Cookie eachCookie: cookiesSeti
        ) {
            System.out.println(siraNo+" - " + eachCookie);
            siraNo++;
        }
    }
    @When("tum cookie’ler silinir ve silindigi test edilir.")
    public void tum_cookie_ler_silinir_ve_silindigi_test_edilir() {
        driver.getDriver().manage().deleteAllCookies();
        cookiesSeti=driver.getDriver().manage().getCookies();

        Assert.assertTrue(cookiesSeti.size()==0);
    }

}
