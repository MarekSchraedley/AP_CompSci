import java.util.*;

public class Prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        double num2 = input.nextInt();

        System.out.print("Enter number 3: ");
        double num3 = input.nextInt();

        System.out.print("Enter number 4: ");
        double num4 = input.nextInt();

        double sum = num1 + num2 + num3 + num4;
        double average = sum / 4;
        System.out.print("Sum: "+sum);
        System.out.print("Average: " + average);


    }
}
