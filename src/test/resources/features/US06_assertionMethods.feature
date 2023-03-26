Feature: Assertion methodu kullanılarak örnekler yapılır.

   Scenario: Basic assertion komutları kullanılarak örnekler yapılır sayfa başında bir sayı oluşturulur.

    When Oluşturulan sayının assertTrue methodu kullanılarak elliden büyük olduğu kontrol edilir.
    When Oluşturulan sayının assertFalse methodu kullanılarak ikiyüzden büyük olmadığı kontrol edilir.
    When Oluşturulan sayının assertEquals methodu kullanılarak yüze eşit olduğu olduğu kontrol edilir.
    When Oluşturulan  sayının assertNotEquals methodu kullanılarak ikiyüze eşit olmadığı kontrol edilir.
    Then driverdan çıkılır.



 Scenario: Assertion komutları kullanılarak örnekler yapılır

  Given "https://www.youtube.com/" adresine gidilir.
  When sayfa başlığının "YouTube" olduğu test edilir.
  When sayfa başlığının "xxxxxx" olmadığı test edilir.
  When logo görselinin görüntülendiği test edilir isDisplayed.
  When arama kutusunun erişilebilir olduğu test edilir isEnabled.
  Then driverdan çıkılır.



