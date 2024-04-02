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
            Scanner input = new Scanner(new File("Langdat/"));
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
            for (int lcv = 0; lcv < myFarm.getCows().size(); lcv++) {
                myFarm.getCows().remove(1);
            }


        } catch (
                IOException e) {
            System.out.println("cant find data file!");
        }
    }

}
