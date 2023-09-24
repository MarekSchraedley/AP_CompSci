import java.util.*;

public class prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter KWH used: ");
        double KWH = input.nextDouble();
        double BR = Math.round((KWH * 0.0475) * 100.0) / 100.0;
        double SC = Math.round((BR * 0.1) * 100.0) / 100.0;
        double CT = Math.round((BR * 0.03) * 100.0) / 100.0;
        double Total = BR + SC + CT;
        double LateTotal = Math.round(100*((BR + SC + CT)*1.04))/100.0;
        System.out.println("Base Rate " + KWH + " X $0.0475 $ " + (BR));
        System.out.println("Surcharge $" + SC);
        System.out.println("Citytax $" + CT); //Finish this up
        System.out.println("Pay this amount: " + Total);
        System.out.println("After May 20th Pay: " + LateTotal);

    }
}
