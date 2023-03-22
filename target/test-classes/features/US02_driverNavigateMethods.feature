Feature: Driver navigate methodları kullanılır

  Scenario: navigate methodlarının işlemleri  kullanılır.

    Given navigate methodu kullanılarak amazon.com a gidilir
    When console a navigate methodu kullanıldı yazdırılır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When navigate methodu kullanılarak youtube.com a gidilir.
    When console a navigate methodu tekrar kullanıldı yazdırılır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When navigate back methodu kullanılarak sayfada geriye gidilir.
    When console a navigate back methodu kullanıldı yazdırılır.
    When navigate forward methodu kullanılarak sayfada ileriye gidilir.
    When console a navigate forward methodu kullanıldı yazdırılır.
    When navigate refresh methodu kullanılarak sayfa yenilenir
    When console a refresh methodu kullanıldı yazdırılır.
    When console a driver navigate methodları kullanıldı yazdırılır.
    Then driverdan çıkılır.