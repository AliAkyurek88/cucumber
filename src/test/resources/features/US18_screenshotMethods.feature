Feature: screenshot methodları ile çalışmak

  Scenario: tüm sayfa için  komutları kullanılır.

    When "https://www.amazon.com" adresine gidilir.
    When amazon arama kutusuna "nutella" yazılır.
    When amazon arama butonuna tıklanır.
    When arama sonuclarinin arattığımız metin olan nutella icerdigi test edelir.
    When rapora eklenmek uzere tum sayfa fotografini cekilir.
    When obje olusturulur, driver cast edilerek oluşturulan obkeye atanır.
    When dosyayi nerede ve hangi uzanti ile olusturacksak file class'indan bir obje olusturup, parametre olarak yazdırılır.
    When tss objesini kullanarak fotografi cekip, gecici bir dosyaya atanır.
    When gecici dosyayi, olusturdugumuz tumSayfaScreenShot'a kopyalanır.

  Scenario: herhangi bir element için sayfa için  komutları kullanılır.

    When "https://www.amazon.com" adresine gidilir.
    When amazon arama kutusuna "nutella" yazılır.
    When amazon arama butonuna tıklanır.
    When arama sonuclarinin arattığımız metin olan nutella icerdigi test edelir.
    When rapora eklenmek uzere arama sonuc yazisi elementinin fotografini cekilir.
    When fotograf cekmek istedigimiz element locate edilir ve  File class'indan bir obje olusturup, parametre olarak yazdırılır.
    When istedigimiz webelementi kullanarak fotografi cekilir, gecici bir dosyaya atanır.
    When gecici dosya, olusturdugumuz tumSayfaScreenShot'a kopyalanır.



