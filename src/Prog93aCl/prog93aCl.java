package Prog93aCl;

import Prog52aClass.Cl52a;

import java.util.Scanner;

public class prog93aCl {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter KWH: ");
        int input = keyboard.nextInt();
        cl193a wow = new cl193a(input);
        wow.calc();
        System.out.print(wow.toString());

    }
}
