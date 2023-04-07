Feature: file methodları ile çalışmak

  Scenario: file download  komutları kullanılır.
    When "https://the-internet.herokuapp.com/download" adresine gidilir.
    When logo.jpeg dosyası indrilir
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When Userhome methodu kullanılarak downloads klasorune bakılır. Files.exists methodu kullanılır.
    When Dosyanın başarıyla indirildiği test edilir.

  Scenario: file upload  komutları kullanılır.
    When "https://the-internet.herokuapp.com/upload" adresine gidilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When logo.jpeg dosyası locate edilip seçilir ve upload edilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When upload butonuna tıklanır.
    When File Uploaded textinin görüntülendiği test edilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.


