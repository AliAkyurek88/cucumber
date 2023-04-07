package utilities;

import org.openqa.selenium.By;

public class ReusableMethods {

    static Driver driver = new Driver();
    public static int randomNumber(int number) {
        int min = 0; // Minimum value of range
        int max = number; // Maximum value of range
        int randomValue = (int) Math.floor(Math.random() * (max - min + 1) + min);
        // Printing the generated random numbers
        System.out.println(randomValue);
        return randomValue;
    }

    public static String getCellValue(int satir, int sutun) {
        // //tbody/tr[7]/td[3]

        String dinamikXPath = "//tbody/tr[" + satir + "]/td[" + sutun + "]";


        return driver.getDriver().findElement(By.xpath(dinamikXPath)).getText();
    }
}
