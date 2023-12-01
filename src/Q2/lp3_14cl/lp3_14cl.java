package Q2.lp3_14cl;

import lp3_14cl.Cl3_14lp;

import java.util.Scanner;

public class lp3_14cl {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Election results for New York: ");
        System.out.print("Awbrey: ");
        int Nya = keyboard.nextInt();
        System.out.print("Martinez: ");
        int Nym = keyboard.nextInt();
        System.out.println("Election results for New Jersey: ");
        System.out.print("Awbrey: ");
        int Nja = keyboard.nextInt();
        System.out.print("Martinez: ");
        int Njm = keyboard.nextInt();
        System.out.println("Election results for new Conneticut: ");
        System.out.print("Awbrey: ");
        int Ca = keyboard.nextInt();
        System.out.print("Martinez: ");
        int Cm = keyboard.nextInt();
        Cl3_14lp wow = new Cl3_14lp(Nya, Nym, Nja, Njm, Ca, Cm);
        wow.calc();
        System.out.println(wow.toString());
    }
}
