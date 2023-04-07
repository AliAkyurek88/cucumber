Feature: iframeler ile çalışmak

  Scenario: iframe komutları kullanılır.

    Given "https://the-internet.herokuapp.com/iframe" adresine gidilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When  h tagı olan An IFrame containing textinin erişebilir olduğu test edilir ve konsola yazdırılır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When iframe e geçiş yaplır.
    When iframe içerisindeki textbox temizlenir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When iframe içerisindeki textboxa "Merhaba Dünya" yazdırılır.
    When iframeden çıkış yapılıp ana sayfaya geçilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When elemental selenium elementi nin görünür olduğu test edilir.
    When elemental selenium elementinin texti consola yazdırılır.
    When not: iç içe iframe'ler varsa bu kod bir ust iframe'e gecis saglayan kod bu case in altında
