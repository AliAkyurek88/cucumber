
Feature: Find elements methodu kullanılarak örnekler yapılır.

  Scenario: herhangi bir siteye girerek find elements methodu kullanılır.

    Given "https://automationexercise.com/" adresine gidilir.


    When find elements methodu kullanılarak sayfadaki linkler bulunur.
    When bulunan değerler console a yazdırılır.
    When find elements methodu kullanılarak sayfada bulunan linklerin kaç tane olduğu (size) bulunur.
    When bulunan değer console a yazdırılır.
    Then driver kapatılır.