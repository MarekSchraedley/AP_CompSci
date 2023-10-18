package Lang76aClass;

import Lang82aClass.Cl82a;

import java.util.Scanner;

public class Prog76aClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a you dislike from 1-9: ");
        int num = keyboard.nextInt();
        Cl76a wow = new Cl76a(num);
        wow.calc();
        System.out.print(wow.toString());
    }
}
