package Lang209aClass;

import Lang213eClass.Cl213e;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209aClass {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215a.dat"));
            int num = 0;
            Cl209a wowsa = new Cl209a();
            while (input.hasNext()) {
                num = input.nextInt();
                wowsa.calc(num);
            }
            System.out.println(wowsa.toString());

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
