import java.util.*;

public class Prog88a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //enter number 1-13
        //enter number  2-20
        // Math.random() * (max - min) + min
        int num1 = (int)(Math.random() * (13 - 1)) + 1;
        int num2 = (int)(Math.random() * (20 - 2)) + 2;
        int sum = num1 + num2;
        int dif = num1 - num2;
        int absdif = Math.abs(dif);
        int max, min;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }

        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
