import java.util.Scanner;

public class Prog58h {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double A = keyboard.nextDouble();

        System.out.print("Enter the rate of interest in percent: ");
        double r = keyboard.nextDouble();

        System.out.print("Enter the number of days compounded per year: ");
        double n = keyboard.nextDouble();

        System.out.print("Enter the number of days the money is to be kept in the savings account: ");
        double t = keyboard.nextDouble();

        System.out.print("Enter The amount originally saved: ");
        double p = keyboard.nextDouble();
    }
}
