package Q2.Prog215i;
import Q2.Prog215i.Cl215i;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215i.dat"));
            int vehicle = 0;
            double miles = 0;
            double gallons = 0;
            double myMPG = 0;
            int bestVehicle = 0;
            double bestMPG = 0;
            int worstVehicle = 0;
            double worstMPG = 0;
            double fleetAVG = 0;
            int numVehicles = 0;
            System.out.println("Vehicle\tMiles\tGallons\tMPG");
            while (input.hasNext()) {

                vehicle = input.nextInt();
                if (vehicle == 0)
                    break;
                gallons = input.nextDouble();
                miles = input.nextDouble();
                Cl215i wowsa = new Cl215i(vehicle, miles, gallons);
                if (miles != 0 && gallons != 0) {
                    wowsa.calc();
                    System.out.println(wowsa.toString());
                    myMPG = miles/gallons;
                    if (worstMPG == 0 || myMPG < worstMPG) {
                        worstMPG = myMPG;
                        worstVehicle = vehicle;
                    }
                    if (bestMPG == 0 || myMPG > bestMPG) {
                        bestMPG = myMPG;
                        bestVehicle = vehicle;
                    }
                    fleetAVG += myMPG;
                    numVehicles += 1;
                }

            }
            fleetAVG = fleetAVG/numVehicles;
            System.out.println("\nMPG Statitstics:\nBest:\t\t\t" + bestVehicle +
                    "\nWorst\t\t\t" + worstVehicle +
                    "\nFleet Average:\t" + fleetAVG +
                    "\nNumber of Vehicles:\t" + numVehicles);


        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
