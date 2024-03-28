package Q3.Prog505t;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Farm implements IFarm{
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


        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }

    private boolean feedCows() {
        for (int i = 0; i < myCows.size(); i++) {

        }
    }
}
