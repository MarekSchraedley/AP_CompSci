package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505w.dat"));

            List<Animal> animals = new ArrayList<Animal>();

            int hay = input.nextInt();
            double hayCost = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

            int cowRows = input.nextInt();
            int cowPens = input.nextInt();
            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int milk = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    Cow wow = new Cow(name, weight, milk, hayEaten, cornEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;


                }

            }

            int horseRows = input.nextInt();
            int horsePens = input.nextInt();

            for (int r = 0; r < horseRows; r++) {
                for (int p = 0; p < horsePens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    int rides = input.nextInt();
                    double rideCost = input.nextDouble();
                    Horse fred = new Horse(name, weight, cornEaten, hayEaten, rides, rideCost);
                    animals.add(fred);
                    hay-= hayEaten;
                    corn -= cornEaten;
                }
            }

            //TODO: report income of the day,
            double incomeOfTheDay = 0;
            for (int lcv =0; lcv < animals.size(); lcv++) {
                incomeOfTheDay += animals.get(lcv).value(cornCost, hayCost);
            }
            System.out.println("Income of the day: " + incomeOfTheDay);

            //TODO: cumulative weight of all animals,
            double cumulativeWeight = 0;
            for (int lcv =0; lcv < animals.size(); lcv++) {
                cumulativeWeight += animals.get(lcv).getWeight();
            }
            System.out.println("Cumulative weight: " + cumulativeWeight);



            //TODO: if there's enough food to feed all, cow that makes the most money
            Double maxCowValue = Double.MIN_VALUE;
            int maxCowIndex = 0;
            if (hay > 0 && corn > 0) {
                for (int lcv = 0; lcv < animals.size(); lcv++) {
                    if (animals.get(lcv) instanceof Cow) {
                        Cow cow = (Cow)animals.get(lcv);
                        double cValue = cow.value(cornCost, hayCost);
                        if (cValue > maxCowValue) {
                            maxCowValue = cValue;
                            maxCowIndex = lcv;
                        }
                    }
                }
            }
            System.out.printf("Cow %s makes the most money\n", animals.get(maxCowIndex).getName());

            double minHorseValue = Double.MAX_VALUE;
            int minHorseIndex = 0;
            for (int lcv =0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse)animals.get(lcv);
                    double hValue = horse.value(cornCost, hayCost);
                    if (hValue < minHorseValue) {
                        minHorseValue = hValue;
                        minHorseIndex = lcv;
                    }
                }
            }

            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
