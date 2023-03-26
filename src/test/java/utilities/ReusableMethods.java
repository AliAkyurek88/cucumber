package utilities;

public class ReusableMethods {
    public static int randomNumber(int number ) {
        int min = 0; // Minimum value of range
        int max = number; // Maximum value of range
        int randomValue = (int)Math.floor(Math.random() * (max - min + 1) + min);
        // Printing the generated random numbers
        System.out.println(randomValue);
        return randomValue;
    }
}
