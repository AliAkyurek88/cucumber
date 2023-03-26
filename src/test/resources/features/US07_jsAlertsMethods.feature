Feature: js alertlerle çalışmak

  Scenario: js alert komutları kullanılır.

    Given "https://the-internet.herokuapp.com/javascript_alerts" adresine gidilir.
    When sayfadaki ilk button tıklanır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When çıkan alertta alert methodu kullanılır. ok denilerek kapatılır. - switchTo.alert.accept
    When ok buttonuna tıklandığı sayfadaki result elementi baz alınarak ve assert methodu kullanılarak test edilir.
    When sayfadaki ikinci button tıklanır
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When çıkan alert uzerindeki yazinin "I am a JS Confirm" olduğu alert ve assert methodları kullanılarak test edilir. - switchTo.alert.getText
    When mevcut alert cancel buttonuna tıklanarak kapatılır.
    When cancel buttonuna tıklandığı sayfadaki result elementi baz alınarak ve assert methodu kullanılarak test edilir.
    When sayfadaki üçüncü button tıklanır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When çıkan alerta alert methodu kullanılarak "Alerta yazdırılan deneme içeriği" yazdırılır. - switchTo.alert.sendKeys
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When ok butonuna tıklanarak alert kapatılır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When çıkan result sonucunun assert methodu ile yazdırılan yazı ile aynı olduğu test edilir.
    Then driver kapatılır.