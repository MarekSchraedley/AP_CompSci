package Lang213eClass;

import Prog213b.Cl213b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213eClass {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213e.dat"));
            int age = 0;
            Cl213e wowsa = new Cl213e();
            while (input.hasNext()) {
                age = input.nextInt();
                wowsa.calc(age);
            }
            System.out.println(wowsa.toString());

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
