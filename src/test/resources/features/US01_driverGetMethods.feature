Feature: Driver get methodları kullanılır

  Scenario: amazon sitesine gidilir, get methodu kullanılır.

    Given get methodu kullanılarak amazon.com a gidilir
    When console a get methodu kullanıldı yazdırılır.
    When getTitle methodu kullanılarak sayfanın başlığı çekilir.
    When getTitle methodu kullanılarak çekilen başlık console a yazdırılır.
    When getCurrentUrl methodu kullanılarak sayfanın url adresi çekilir.
    When getCurrentUrl methodu kullanılarak çekilen url console a yazdırılır.
    When getWindowHandle methodu kullanılarak sayfanın window handle değeri çekilir.
    When getWindowHandle methodu kullanılarak çekilen handle değeri console a yazdırılır.
    When getWindowHandles methodu kullanılarak sayfanın window handles değeri çekilir.
    When getWindowHandles methodu kullanılarak çekilen handle seti değeri console a yazdırılır.
    Then console a get methodları kullanıldı yazdırılır.
    Then driverdan çıkılır.