Feature: x

Scenario: Assertion komutları kullanılarak örnekler yapılır

When "https://www.amazon.com.tr/" adresine gidilir.
When cookies kabul edilir
When amazon arama kutusuna "gaming laptop" yazılır.
When amazon arama butonuna tıklanır.
When gaming laptop için çıkan sonuçlarda fiyat olarak onbeş bin TL checkbox seçilir.
When amazon sıralama dropdown içinde kaç option olduğu consola yazdırılır.
When amazon sıralama dropdown içerisinden "En Yeniler"  dropdown itemı seçilir.
When iki dk thread sleep methodu kullanılarak beklenilir.
Then driverdan çıkılır.
