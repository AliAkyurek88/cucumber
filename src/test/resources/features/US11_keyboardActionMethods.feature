Feature: keyboard action methodları ile çalışmak

  Scenario: keyboard action  komutları kullanılır.
    When "https://www.wisequarter.com" adresine gidilir.
    When keyboard komutları kullanılarak java test automation engineer menusune kadar  sayfada aşağı inilir. - page_down
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When java test automation engineer menusune tıklanır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When menuye tıklandığı url'in automation-engineer içerdiğine bakılarak test edilir.

  Scenario: keyboard action ve faker file  komutları kullanılır.
    When "https://www.facebook.com" adresine gidilir.
    When Yeni kayıt oluştur butonuna tıklanır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When açılan formda tüm alanlar keyboard action ve faker file komutlarındanda yardım alınarak doldurulur.
    When kaydol butonuna tıklanır.