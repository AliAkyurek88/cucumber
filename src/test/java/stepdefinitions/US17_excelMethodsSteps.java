package stepdefinitions;

import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class US17_excelMethodsSteps {
    String dosyaYolu= "src/test/resources/features/ulkeler.xlsx";
    FileInputStream fis;
    FileOutputStream fos;
    Workbook workbook;
    Sheet sheet;
    Row row;
    Cell cell;

    @When("fiziki excel dosyasına java kullanarak ulaşılır.")
    public void fiziki_excel_dosyasına_java_kullanarak_ulaşılır() throws FileNotFoundException {
        /*
            Excel dosyasi fiziki olarak bilgisayarimizda
            Bizim kod ortaminda online olarak bilgisayardaki bir dosya uzerinde calismamiz mumkun degil

            Java bize ihtiyacimiz oldugunda
            bilgisayarimizdaki fiziki bir dosyadaki bilgileri okuma,
            ve kod ortamimizdan yolladigimiz bilgilerle
            dosyayi update etme imkanlari veriyor

            Bu sebepten oturu
            biz kod ortamimizda excel'in bir kopyasini olusturup
            exceldeki tum bilgileri, kopya excelimize kaydedecegiz
            kod ortamimizda oldugundan kopya excel uzerinde istedigimiz islemleri yapip
            isimiz bittikten sonra excel dosyasini update etmek istersek
            kopya exceldeki tum bilgileri, fiziki excel dosyasina kaydedebiliriz

         */

        fis = new FileInputStream(dosyaYolu);

    }
    @When("java ile ulaşılan excel dosyasının bir kopyası kod ortamında oluşturulur.")
    public void java_ile_ulaşılan_excel_dosyasının_bir_kopyası_kod_ortamında_oluşturulur() throws IOException {
        workbook = WorkbookFactory.create(fis);

        // Bundan sonra excelin bir kopyasina kod ortaminda sahibiz

    }
    @When("excelin içindeki ilk sayfaya ulaşılır.")
    public void excelin_içindeki_ilk_sayfaya_ulaşılır() {
        // Şimdi excelde birden fazla sayfa olabileceginden ilgili sayfaya gitmeliyiz.
       sheet = workbook.getSheet("Sayfa1");
    }
    @When("excel içindeki azerbeycan ülkesinin başkent ismine yani {int}. satır, {int}. sutuna ulaşalım.")
    public void excel_içindeki_azerbeycan_ülkesinin_başkent_ismine_yani_satır_sutuna_ulaşalım(Integer rowIndex, Integer cellIndex) {
        // excel'deki Azerbaycan'in turkce baskent ismi
        // 12.satir, 4.sutunda
        // Ancak excel otomasyonunda satir ve cell bilgileri index kullandigi icin
        // 11.index'deki satirin, 3.indexindeki cell'i yazdirdik.
           row = sheet.getRow(rowIndex-1);
           cell= row.getCell(cellIndex-1);
           System.out.println("11.index'deki satirin, 3.indexindeki cell: "+cell);
    }
    @When("excel içindeki {int}.satirdaki {int}.hucreye gidelir ve yazdırılır.")
    public void excel_içindeki_satirdaki_hucreye_gidelir_ve_yazdırılır(Integer rowIndex, Integer cellIndex) {
        Cell istenenCell = workbook.getSheet("Sayfa1").getRow(rowIndex-1).getCell(cellIndex-1);
        System.out.println("1.satirdaki 2.cell : "+istenenCell);
        String satir1cell2Str = istenenCell.toString();
        System.out.println("1.satirdaki 2.cell String olan : "+satir1cell2Str);

    }
    @When("{int}.satir {int}.cell’in afganistan’in baskenti Kabil oldugunu test edilir.")
    public void satir_cell_in_afganistan_in_baskenti_kabil_oldugunu_test_edilir(Integer rowIndex, Integer cellIndex) {
        Cell satir2cell4Cell= workbook.getSheet("Sayfa1").getRow(1).getCell(3);
        String expectedResult="Kabil";
        String actualResult= satir2cell4Cell.toString(); // string istediğimiz için to string ile stringe eşitlememiz lazım.
        Assert.assertEquals(expectedResult,actualResult);
    }
    @When("excelde  toplam kullanılan ve fiziki olarak kullanılıp boş olmayan satır sayısı ayrı ayrı bulunur.")
    public void excelde_toplam_kullanılan_ve_fiziki_olarak_kullanılıp_boş_olmayan_satır_sayısı_ayrı_ayrı_bulunur() {
        //		- Satir sayisini bulalim
        // getLastRowNum() kullanilan son satirin index'ini verir

        System.out.println(workbook.getSheet("Sayfa1").getLastRowNum()+1);
    }
    @When("exceldeki ingilizce ülke isimleri ve baskentleri loop'a alınarak bir map olarak kaydedilir.")
    public void exceldeki_ingilizce_ülke_isimleri_ve_baskentleri_loop_a_alınarak_bir_map_olarak_kaydedilir() {
        // Fiziki olarak kullanilan satir sayisini bulun
        // getPhysicalNumberOfRows() bos olmayan satir sayisini verir
        System.out.println("Fiziki kullanilan satir sayisi : "+workbook.getSheet("Sayfa1").getPhysicalNumberOfRows());
    }
    @When("kayıt edilen map için ülke ismi verilerek baskenti yazdırılır.")
    public void kayıt_edilen_map_için_ülke_ismi_verilerek_baskenti_yazdırılır() {
        //		- Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim

        Map<String,String> ulkeisimleriMap= new TreeMap<>();

        for (int i = 0; i <= workbook.getSheet("Sayfa1").getLastRowNum(); i++) {

            String ulkeIsmi= workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            String baskentIsmi= workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString();
            ulkeisimleriMap.put(ulkeIsmi,baskentIsmi);
        }

        System.out.println(ulkeisimleriMap);

        System.out.println(ulkeisimleriMap.get("Turkey"));
        System.out.println(ulkeisimleriMap.get("Albania"));

    }
    @When("excelin içindeki ilk sayfaya ulaşılır ve {int}.hucreye yeni bir cell olusturulur ve  olusturulan hucreye “Nufus” yazdirilir.")
    public void excelinIçindekiIlkSayfayaUlaşılırVeHucreyeYeniBirCellOlusturulurVeOlusturulanHucreyeNufusYazdirilir(int cellIndex) throws IOException {
        System.out.println("dosyaYolu"+dosyaYolu);
        fis = new FileInputStream(dosyaYolu);
        System.out.println("fis"+fis);
        workbook  = WorkbookFactory.create(fis);
        System.out.println("workbook"+workbook);
        sheet= workbook.getSheet("Sayfa1");
        System.out.println("sheet"+sheet);
        sheet.getRow(0).createCell(cellIndex-1).setCellValue("Nufus");
    }
    @When("{int}.satir nufus kolonuna {int} yazdirilir.")
    public void satir_nufus_kolonuna_yazdirilir(Integer rowIndex, Integer number) {
        sheet.getRow(rowIndex-1).createCell(4).setCellValue(number);
    }

    @When("Dosyayi kaydedilir.")
    public void dosyayi_kaydedilir() throws IOException {
        //   yaptigimiz degisiklikleri fiziki excel'in kopyasi olan workbook uzerinde yaptik
        //   bu degisiklikleri excel'e kaydetmek istersek bu defa FileOutputStream olusturmaliyiz
        fos = new FileOutputStream(dosyaYolu);
        workbook.write(fos);
    }

    @When("dosya kapatilir.")
    public void dosya_kapatilir() throws IOException {
        fis.close();
        fos.close();
        workbook.close();
    }

}
