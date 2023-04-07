Feature: irregular web table ile çalışmak

  Scenario: irregular web table ile örnekler yapılır.

    When "https://demoqa.com/webtables" adresine gidilir.
    When Headers da bulunan basliklar yazdırılır.
    When 3. sutunun başlığı yazdırılır.
    When tablodaki tüm datalar yazdırılır.
    When tabloda kaç tane boş olmayan hücre olduğu yazdırılır.
    When tablodaki satır sayısı yazdırılır.
    When tablodaki sutun sayısı yazdırılır.
    When tablodaki 3. kolon yazdırılır.
    When tablodaki first name i "Kierra" olan kişinin salary bilgisi yazdırılır.
