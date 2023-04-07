Feature: mouse action methodları ile çalışmak

  Scenario: mouse action right click komutları kullanılır.

    When "https://the-internet.herokuapp.com/context_menu" adresine gidilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When çizili alan uzerinde sag click yapılır. actions.contextClick
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When Alert’te cikan yazinin “You selected a context menu” oldugunu test edilir.
    When Tamam diyerek alert’i kapatılır.
    When mevcut sayfanın window handle değeri alınır.
    When elemental Selenium linkine tiklanır.
    When yeni açılan tabın window handle değeri alınır.
    When yeni açılan taba geçiş yapılır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When Acilan sayfada h1 taginda “Elemental Selenium” yazdigi test edilir.

  Scenario: mouse action drag and drop komutları kullanılır.
    When "https://demoqa.com/droppable" adresine gidilir.
    When Drag me butonunu tutulur Drop here kutusunun ustune birakalır
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When Drop here yazısının Dropped oldugunu test edilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.

  Scenario: mouse action move to element komutları kullanılır.
    When "https://www.amazon.com" adresine gidilir.
    When Sag ust bolumde bulunan Account & Lists menusunun acilmasi icin mouse bu menunun ustune getirilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When Create a list butonuna tıklanır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When Acilan sayfada Your List elementinin görünür olduğu test edilir.

