package Lang88aClass;

import Prog93aCl.cl193a;

import java.util.Scanner;

public class Prog88aClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = keyboard.nextInt();
        Cl88a wow = new Cl88a(num1, num2);
        wow.calc();
        System.out.print(wow.toString());

    }
}
