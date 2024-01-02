package Prog215h;
import Prog214c.Cl214c;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog215h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/Prog215h.txt"));

            while (input.hasNext()) {
                ArrayList<Double> scores = new ArrayList<Double>();
                for (int lcv = 0; lcv < 8; lcv++) {
                    scores.add(input.nextDouble());
                }
                Cl215h wowsa = new Cl215h(scores);
                wowsa.calc();
                System.out.println(wowsa.toString());
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
