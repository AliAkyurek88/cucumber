Feature: Regular web table ile çalışmak

  Scenario: CRegular web table ile örnekler yapılır.

    When "https://www.amazon.com" adresine gidilir.
    When sayfanın en altına inilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When sayfanın altındaki tablonun tüm body'si yazdırılır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When sayfanın altındaki tablonun satır sayısının 9 olduğu test edilir.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When sayfanın altındaki tablonun tüm satırlarını yazdırın.
    When sayfanın altındaki tablonun ilk satırının sutun sayısının 13 olduğunu test edin.
    When sayfanın altındaki tablonun besinci sutununu yazdırın.
    When hazırladığınız bir method yardımı ile satır ve sutun sayısını parametre olarak alıp hücredeki bilgiyi string olarak döndürün.