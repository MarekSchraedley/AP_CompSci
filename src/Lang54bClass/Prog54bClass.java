package Lang54bClass;

import Lang54cClass.Cl54c;

import java.util.Scanner;

public class Prog54bClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = keyboard.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = keyboard.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = keyboard.nextDouble();
        System.out.print("Enter the fourth number: ");
        double num4 = keyboard.nextDouble();
        Cl54b wow = new Cl54b(num1, num2, num3, num4);
        wow.calc();
        System.out.print(wow.toString());
    }
}
