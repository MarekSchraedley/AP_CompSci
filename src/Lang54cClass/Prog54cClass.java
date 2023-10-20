package Lang54cClass;

import Lang76aClass.Cl76a;

import java.util.Scanner;

public class Prog54cClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the Radius of the circle: ");
        double radius = keyboard.nextDouble();
        Cl54c wow = new Cl54c(radius);
        wow.calc();
        System.out.print(wow.toString());
    }
}
