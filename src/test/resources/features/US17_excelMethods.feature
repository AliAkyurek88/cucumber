Feature: excel methodları ile çalışmak

  Scenario: excel read komutları kullanılır.

    When fiziki excel dosyasına java kullanarak ulaşılır.
    When java ile ulaşılan excel dosyasının bir kopyası kod ortamında oluşturulur.
    When excelin içindeki ilk sayfaya ulaşılır.
    When excel içindeki azerbeycan ülkesinin başkent ismine yani 12. satır, 4. sutuna ulaşalım.
    When excel içindeki 1.satirdaki 2.hucreye gidelir ve yazdırılır.
    When 12.satir 4.cell’in afganistan’in baskenti Kabil oldugunu test edilir.
    When excelde  toplam kullanılan ve fiziki olarak kullanılıp boş olmayan satır sayısı ayrı ayrı bulunur.
    When exceldeki ingilizce ülke isimleri ve baskentleri loop'a alınarak bir map olarak kaydedilir.
    When kayıt edilen map için ülke ismi verilerek baskenti yazdırılır.

  Scenario: excel write komutları kullanılır.

    When excelin içindeki ilk sayfaya ulaşılır ve 5.hucreye yeni bir cell olusturulur ve  olusturulan hucreye “Nufus” yazdirilir.
    When 2.satir nufus kolonuna 1500000 yazdirilir.
    When 10.satir nufus kolonuna 250000 yazdirilir.
    When 15.satir nufus kolonuna 54000 yazdirilir.
    When Dosyayi kaydedilir.
    When dosya kapatilir.
