Feature: Cookies  methodları ile çalışmak

  Scenario: Cookies komutları kullanılır.

    When "https://www.amazon.com" adresine gidilir.
    When tum cookie’ler listelenir.
    When sayfadaki cookies sayisi bulunur.
    When ismi i18n-prefs olan cookie degerinin USD oldugunu test edilir.
    When ismi en sevdigim cookie ve degeri cikolatali olan bir cookie olusturulur ve sayfaya eklenir.
    When eklenilen cookie’nin sayfaya eklendigi test edilir.
    When ismi skin olan cookie silinir ve silindigini test edilir.
    When tum cookie’ler silinir ve silindigi test edilir.


