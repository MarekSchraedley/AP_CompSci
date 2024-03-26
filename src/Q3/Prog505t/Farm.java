package Q3.Prog505t;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Farm{
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/"));
            int numHayBales = input.nextInt();
            double costPerHayBale = input.nextDouble();
            int numCorncobs = input.nextInt();
            double costPerCorncob = input.nextDouble();
            for (int lcv = 0; lcv < input.nextInt(); lcv++) {

            }


        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
