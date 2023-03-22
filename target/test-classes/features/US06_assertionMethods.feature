Feature: Assertion methodu kullanılarak örnekler yapılır.

   Scenario: Basic assertion komutları kullanılarak örnekler yapılır
    Given Console a  asserTrue testi başlıyor yazdırılır
    When Oluşturulan sayının assertTrue methodu kullanılarak elliden büyük olduğu kontrol edilir.
    When Console a  asserTrue testi bitti yazdırılır.
    When Console a  assertFalse testi başlıyor yazdırılır.
    When Console a  assertFalse testi başlıyor yazdırılır.
    When sayının assertFalse methodu kullanılarak ikiyüzden büyük olmadığı kontrol edilir.
    When Console a  assertFalse testi bitti yazdırılır.
    When Console a  assertEquals testi başlıyor yazdırılır.
    When Oluşturulan sayının assertEquals methodu kullanılarak yüze eşit olduğu olduğu kontrol edilir.
    When Console a  assertEquals testi bitti yazdırılır.
    When Console a  assertNotEquals testi başlıyor yazdırılır."
    When Oluşturulan  sayının assertNotEquals methodu kullanılarak ikiyüze eşit olmadığı kontrol edilir.
    When Console a  assertNotEquals testi bitti yazdırılır.
    Then driverdan çıkılır.



   Scenario: Assertion komutları kullanılarak örnekler yapılır

     Given "https://www.youtube.com/" adresine gidilir.
     When sayfa başlığının "YouTube" olduğu test edilir.
     When sayfa başlığının "xxxxxx" olmadığı test edilir.
     When logo görselinin görüntülendiği test edilir isDisplayed.
     When arama kutusunun erişilebilir olduğu test edilir isEnabled.
     When "https://www.amazon.com.tr/" adresine gidilir.
     When cookies kabul edilir
     When create and account butonuna tıklanır
     When radio button elementlerinden biri  seçilir.
     When "" adresine gidilir.
     When seçilmeyen checkboxlar var ise seçilir.
     When "" adresine gidilir.
     When drop downd içerisinden bir item seçilir.
     When driverdan çıkılır.




