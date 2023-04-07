Feature: window handle ile çalışmak

  Scenario: window handle komutları kullanılır.

    When "https://www.amazon.com" adresine gidilir.
    When amazon arama kutusuna "nutella" yazılır.
    When amazon arama butonuna tıklanır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When arama sonuclarinin arattığımız metin olan nutella icerdigi test edelir.
    When mevcut sayfanın handle değeri alınır.
    When yeni bir tab açılır. - driver.switchTo.newWindow
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When "https://www.amazon.com" adresine gidilir.
    When amazon arama kutusuna "samsung" yazılır.
    When amazon arama butonuna tıklanır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When arama sonuclarinin arattığımız metin olan samsung icerdigi test edelir.
    When yeniden nutella arattigimiz sayfaya geçelim. - driver.switchTo.window
    When yeniden nutella arattigimiz sayfada arama sonuclarini yazdiralim.

  Scenario: bilinçli oluşturmadan otomatik olarak yeni bir sayfaya geçişlerde window handle komutları kullanmak
    When "https://the-internet.herokuapp.com/windows" adresine gidilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When sayfadaki yazinin "Opening a new window" oldugunu test edilir.
    When click here linki tiklanır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When loop oluşturularak sayfanın ikinci tab window değeri alınır.
    When alınan değerler ikinci taba geçilerek oradaki yazinin "New Window" oldugunu test edilir.
    When yeniden ilk sayfaya geçilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When urlin "https://the-internet.herokuapp.com/windows" olduğu test edilir


