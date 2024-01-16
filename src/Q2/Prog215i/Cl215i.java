package Prog215i;

import Prog215h.Cl215h;

public class Cl215i {
    private int myVehicle;
    private double myMiles;
    private double myGallons;
    private double myMPG;



    public Cl215i(int vehicle, double miles, double gallons) {
        myVehicle = vehicle;
        myMiles = miles;
        myGallons = gallons;
        myMPG = 0;
    }
    public void calc() {
        myMPG = myMiles/myGallons;
    }

    public String toString() {
        return myVehicle + "\t" + myMiles + "\t" + myGallons + "\t" + myMPG;
    }


}
