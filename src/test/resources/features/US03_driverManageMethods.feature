Feature: Driver manage methodları kullanılır

  Scenario: manage methodlarının işlemleri  kullanılır.

    Given navigate methodu kullanılarak amazon.com a gidilir
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When driver manage maximize methodu kullanılarak sayfa maximize edilir
    When console a drive manage maximize methodu  kullanıldı yazdırılır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When driver manage set size methodu kullanılarak sayfa width bin height beşyüz olarak set size edilir
    When console a drive manage set size methodu  kullanıldı yazdırılır.
    When iki dk thread sleep methodu kullanılarak beklenilir.
    When driver manage set position methodu kullanılarak sayfa x yüz y yüz olarak pozisyon edilir
    When console a drive manage set position methodu  kullanıldı yazdırılır.
    Then driverdan çıkılır.


