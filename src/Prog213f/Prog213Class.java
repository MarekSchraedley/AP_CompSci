package Prog213f;

import Lang213eClass.Cl213e;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213Class {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213f.dat"));
            double num = 0;

            while (input.hasNext()) {
                num = input.nextInt();
                if (num != -999) {
                    Cl213f wowsa = new Cl213f(num);
                    wowsa.calc();
                    System.out.println(wowsa);
                }
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
