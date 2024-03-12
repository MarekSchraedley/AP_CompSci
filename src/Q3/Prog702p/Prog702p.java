package Q3.Prog702p;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog701g.dat"));
            List<Animal> list = new ArrayList<Animal>();
            int type = 0;
            String name = "";
            String word = "";
            int animals = 0;
            int totalHiccas = 0;
            double avgFurValue = 0.0;
            int totalWallies = 0;
            int totalSteps = 0;
            int totalBeepers = 0;
            double avgExtraWord = 0.0;
            String allExtraWords = "";
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int[] letterCount = new int[26];
            int biggestLetterCount = 0;
            type = input.nextInt();
            while (type != 99) {
                name = input.next();
                word = input.next();
                if (type == 1) {
                    double furValue = input.nextDouble();
                    Animal a = new Hicca(name, word, furValue);
                    list.add(a);
                }
                if (type == 2) {
                    int steps = input.nextInt();
                    Animal a = new Wallie(name, word, steps);
                    list.add(a);
                }
                if (type == 3) {
                    String extraWord = input.next();
                    Animal a = new Beeper(name, word, extraWord);
                    list.add(a);
                }
                type = input.nextInt();
                animals++;
            }
            for (Animal hicca : list) {
                if (hicca instanceof Hicca) {
                    avgFurValue += ((Hicca) hicca).getFurValue();
                    totalHiccas++;
                }
            }
            avgFurValue = avgFurValue/totalHiccas;
            System.out.println("The average amount the Hiccas fur is worth is " + avgFurValue);
            for (Animal wallie : list) {
                if (wallie instanceof Wallie) {
                    totalSteps += ((Wallie) wallie).getSteps();
                    totalWallies++;
                }
            }
            System.out.println("The total number of steps taken by the Wallies is " + totalSteps);
            for (Animal beeper : list) {
                if (beeper instanceof Beeper) {
                    avgExtraWord += ((Beeper) beeper).getExtraWord().length();
                    totalBeepers++;
                }
            }

            avgExtraWord = avgExtraWord/totalBeepers;
            System.out.println("The average size of the Beepers extra word is " + avgExtraWord);
            System.out.println("The total number of animals is " + animals);
            System.out.println("The total number of Hiccas is " + totalHiccas);
            System.out.println("The total number of Wallies is " + totalWallies);
            System.out.println("The total number of Beepers is " + totalBeepers);

            for (Animal beeper : list) {
                if (beeper instanceof Beeper) {
                    allExtraWords += ((Beeper) beeper).getExtraWord();
                }
            }
            for (int lcv = 0; lcv < allExtraWords.length(); lcv++) {
                letterCount[alphabet.indexOf(allExtraWords.substring(lcv, lcv+1))] += 1;
            }
            for (int lcv = 0; lcv < letterCount.length; lcv++) {
                if (letterCount[lcv] > biggestLetterCount) {
                    biggestLetterCount = letterCount[lcv];
                }
            }
            System.out.print("The letter that appears most often in the beepers words is ");
            for (int lcv = 0; lcv < letterCount.length; lcv++) {
                if (letterCount[lcv] == biggestLetterCount) {
                    System.out.print(alphabet.substring(lcv, lcv+1) + " ");
                }
            }
        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
