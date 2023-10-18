package Lang82aClass;

import Lang88aClass.Cl88a;

import java.util.Scanner;

public class Prog82aClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the Speed Limit: ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter the Vehicle Speed: ");
        int num2 = keyboard.nextInt();
        Cl82a wow = new Cl82a(num1, num2);
        wow.calc();
        System.out.print(wow.toString());
    }
}
