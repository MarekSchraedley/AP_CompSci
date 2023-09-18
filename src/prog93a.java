import java.util.*;

public class prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter KWH used: ");
        double Total = 0.0;
        double KWH = input.nextDouble();
        double BR = Math.round((KWH * 0.0475) * 100.0) / 100.0;
        double SC = Math.round((BR * 0.1) * 100.0) / 100.0;
        double CT = Math.round((BR * 0.03) * 100.0) / 100.0;
        System.out.print("Base Rate " + KWH + " X $0.0475 $ " + (BR));
        System.out.print("Surcharge $" + SC);
        System.out.print("Citytax $" + CT); //Finish this up

    }
}
