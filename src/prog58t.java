import java.util.*;

public class prog58t {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter The purchased price: ");
        double p = keyboard.nextDouble();

        System.out.print("Enter the amount recived: ");
        double r = keyboard.nextDouble();
        double due = r - p;
        System.out.print("Change Due: " + due);
        double dollars = due/1; //swap division to match this one
        due = due/1;
        double quarters = 0.25/due;
        due = 0.25/due;
        double dimes = 0.10/due;
        due = 1/due;
        double nickels = 0.5/due;
        due = 1/due;
        double pennies = 0.01/due;
    }
}
