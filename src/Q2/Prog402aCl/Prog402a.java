package Q2.Prog402aCl;

import Prog213b.Cl213b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prg402a.dat"));
            System.out.println("ID\t\t\tScore\t\t\tDiff");
            int id = 0;
            int score = 0;
            Cl402a wowsa = new Cl402a();
            while (input.hasNext()) {
                id = input.nextInt();
                score = input.nextInt();
                wowsa.add(id, score);
            }
            wowsa.calc();
            System.out.println(wowsa.toString());

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
