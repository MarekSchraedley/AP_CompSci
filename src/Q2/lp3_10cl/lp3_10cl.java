package Q2.lp3_10cl;

import lp3_10cl.Cl3_10lp;

import java.util.Scanner;

public class lp3_10cl {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of burgers: ");
        int Burgers = keyboard.nextInt();
        System.out.print("Enter the number of fries: ");
        int Fries = keyboard.nextInt();
        System.out.print("Enter the number of sodas: ");
        int Sodas = keyboard.nextInt();
        Cl3_10lp wow = new Cl3_10lp(Burgers, Fries, Sodas);
        wow.calc();
        System.out.println(wow.toString());
        System.out.print("Enter amount tendered: $");
        System.out.println(wow.tender(keyboard.nextInt()));
    }
}
