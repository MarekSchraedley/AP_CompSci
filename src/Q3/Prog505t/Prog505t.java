package Q3.Prog505t;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog505t {
    private static ArrayList<Horse> myHorses;
    private static ArrayList<Cow> myCows;
    private static int myNumHayBales;
    private static int myNumCorn;
    private static double myHayCost;
    private static double myCornCost;
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/Prog505t.dat"));
            myCows = new ArrayList<>();
            myHorses = new ArrayList<>();
            myNumHayBales = input.nextInt();
            myHayCost = input.nextDouble();
            myNumCorn = input.nextInt();
            myCornCost = input.nextDouble();
            for (int lcv = 0; lcv < input.nextInt(); lcv++) {
                myCows.add(new Cow(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()));
            }
            for (int lcv = 0; lcv < input.nextInt(); lcv++) {
                myHorses.add(new Horse(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextDouble()));
            }
            Farm myFarm = new Farm(myHorses, myCows, myNumHayBales, myNumCorn, myHayCost, myCornCost);
            System.out.println(myFarm.farmIncome());
            System.out.println(myFarm.getCost());
            System.out.println(myFarm.getWeight());
            if (myFarm.feedAllAnimals() == true) {
                System.out.println("Enough food to feed all animals");
                System.out.println("Hay: " + myFarm.getHayBales() + " Corn: " + myFarm.getCorn());
            } else {
                System.out.println("Not enough food to feed all animals, requesting shipment");
            }
            for (int lcv = 0; lcv < 3; lcv++) {
                int lowestMilk = Integer.MAX_VALUE;
                int lowestCowIndex = 0;
                for (int lcv2 = 0; lcv2 < myFarm.getCows().size(); lcv2++) {
                    if (myFarm.getCows().get(lcv2).getMilk() < lowestMilk) {
                        lowestMilk = myFarm.getCows().get(lcv2).getMilk();
                        lowestCowIndex = lcv2;
                    }
                }
                myFarm.removeCow(lowestCowIndex);
                System.out.println("Removed cow at index " + lowestCowIndex);
            }
            for (int lcv = 0; lcv < 2; lcv++) {
                int lowestIncome = Integer.MAX_VALUE;
                int lowestHorseIndex = 0;
                for (int lcv2 = 0; lcv2 < myFarm.getCows().size(); lcv2++) {
                    if (myFarm.getHorses().get(lcv2).getRideCost() < lowestIncome) {
                        lowestIncome = myFarm.getCows().get(lcv2).getMilk();
                        lowestHorseIndex = lcv2;
                    }
                }
                myFarm.removeHorse(lowestHorseIndex);
                System.out.println("Removed cow at index " + lowestHorseIndex);
            }

            myFarm.getCows().get(0).setCow(1250, 80, 3, 4);

            System.out.println("Total number of cows: " + myFarm.getCows().size() + "\nTotal number of Horses: " + myFarm.getHorses().size());

        } catch (
                IOException e) {
            System.out.println("cant find data file!");
        }
    }

}
