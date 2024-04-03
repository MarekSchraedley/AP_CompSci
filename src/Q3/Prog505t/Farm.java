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

    public Farm(ArrayList<Horse> Horses, ArrayList<Cow> Cows, int numHayBales, int numCorn, double hayCost, double cornCost) {
        myHorses = Horses;
        myCows = Cows;
        myNumHayBales = numHayBales;
        myNumCorn = numCorn;
        myHayCost = hayCost;
        myCornCost = cornCost;
    }

    private boolean feedCows() {
        int tempHay = myNumHayBales;
        int tempCorn = myNumCorn;
        for (int lcv = 0; lcv < myCows.size(); lcv++) {
            tempHay -= myCows.get(lcv).getHayBales();
            tempCorn -= myCows.get(lcv).getCorn();
        }
        if (tempHay >= 0 && tempCorn >= 0) {
            myNumHayBales = tempHay;
            myNumCorn = tempCorn;
            return true;
        }
        return false;
    }

    private boolean feedHorses() {
        int tempHay = myNumHayBales;
        int tempCorn = myNumCorn;
        for (int lcv = 0; lcv < myHorses.size(); lcv++) {
            tempHay -= myHorses.get(lcv).getHayBales();
            tempCorn -= myHorses.get(lcv).getCorn();
        }
        if (tempHay >= 0 && tempCorn >= 0) {
            myNumHayBales = tempHay;
            myNumCorn = tempCorn;
            return true;
        }
        return false;
    }

    public boolean feedAllAnimals() {
        int tempHay = myNumHayBales;
        int tempCorn = myNumCorn;
        for (int lcv = 0; lcv < myCows.size(); lcv++) {
            tempHay -= myCows.get(lcv).getHayBales();
            tempCorn -= myCows.get(lcv).getCorn();
        }
        for (int lcv = 0; lcv < myHorses.size(); lcv++) {
            tempHay -= myHorses.get(lcv).getHayBales();
            tempCorn -= myHorses.get(lcv).getCorn();
        }
        if (tempHay >= 0 && tempCorn >= 0) {
            myNumHayBales = tempHay;
            myNumCorn = tempCorn;
            return true;
        }
        return false;
    }

    private double cowIncome(double perPound)  {
        double income = 0;
        for (int lcv = 0; lcv < myCows.size(); lcv++) {
            income += perPound * myCows.get(lcv).getMilk();
        }
        return income;
    }
    private double horseIncome() {
        double income = 0;
        for (int lcv = 0; lcv < myHorses.size(); lcv++) {
            income += myHorses.get(lcv).getRides() * myHorses.get(lcv).getRideCost();
        }
        return income;
    }

    public double farmIncome() {
        return cowIncome(0.20) + horseIncome();
    }

    public int getWeight() {
        int weight = 0;
        for (int lcv = 0; lcv < myCows.size(); lcv++) {
            weight += myCows.get(lcv).getWeight();
        }
        for (int lcv = 0; lcv < myHorses.size(); lcv++) {
            weight += myHorses.get(lcv).getWeight();
        }
        return weight;
    }

    public double getCost() {
        int tempHay = 0;
        int tempCorn = 0;
        for (int lcv = 0; lcv < myCows.size(); lcv++) {
            tempHay += myCows.get(lcv).getHayBales();
            tempCorn += myCows.get(lcv).getCorn();
        }
        for (int lcv = 0; lcv < myHorses.size(); lcv++) {
            tempHay += myHorses.get(lcv).getHayBales();
            tempCorn += myHorses.get(lcv).getCorn();
        }
        return (tempHay * myHayCost) + (tempCorn * myCornCost);
    }

    public ArrayList<Cow> getCows() {
        return myCows;
    }

    public ArrayList<Horse> getHorses() {
        return myHorses;
    }

    public int getHayBales() {
        return myNumHayBales;
    }

    public int getCorn() {
        return myNumCorn;
    }

    public void removeCow(int index) {myCows.remove(index);}

    public void removeHorse(int index) {myHorses.remove(index);}

}
