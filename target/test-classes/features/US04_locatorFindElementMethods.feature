
Feature: Find elements methodu kullanılarak örnekler yapılır.

  Scenario: herhangi bir siteye girerek find elements methodu kullanılır.

    Given "http://zero.webappsecurity.com/" adresine gidilir.
    When find element methodu kullanılarak sign in butonuna tıklanır.
    When find element methodu kullanılarak username alanına "username" yazdırılır
    When find element methodu kullanılarak password alanına "password" yazdırılır.
    When find element methodu kullanılarak submit butonuna tıklanarak zero bank sitesine giriş yapılır.
    Then driver kapatılır.