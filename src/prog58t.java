import java.util.*;

public class prog58t {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter The purchased price: ");
        double p = keyboard.nextDouble();

        System.out.print("Enter the amount recived: ");
        double r = keyboard.nextDouble();
        double due = r - p;
        due = Math.round(due * 100.0) /100.0;
        System.out.println("Change Due: " + due ); //round to 2 decimal points
        double dollars = Math.floor(due/1); //swap division to match this one
        due -= dollars;
        double quarters = Math.floor(due/0.25);
        due -= quarters * 0.25;
        double dimes = Math.floor(due/0.10);
        due -= dimes * 0.10;
        double nickels = Math.floor(due/0.05);
        due -= nickels * 0.05;
        double pennies = Math.floor(due/0.01);
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);


    }
}
