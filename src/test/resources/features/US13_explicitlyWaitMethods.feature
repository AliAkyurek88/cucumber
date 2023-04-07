Feature: Explicitly wait  methodları ile çalışmak

  Scenario: Explicitly wait  komutları kullanılır.
    When "https://the-internet.herokuapp.com/dynamic_controls" adresine gidilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When remove butonuna tıklanır.
    When It’s gone! mesaji görünür olana kadar bekleyip görünür olduğu edilir.
    When add butonuna tıklanır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When It’s back mesajinin gorundugu test edilir.