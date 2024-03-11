package Q3.Prog702q;

import Q3.Prog703s.Computer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog702q.txt"));
            List<Vehicle> list = new ArrayList<Vehicle>();
            String longestHome = "";
            int vehicles = 0;
            double carValue = 0.0;
            double vehicleValue = 0.0;
            double smallTruckValue = Integer.MAX_VALUE;
            String smallTruckName = "";
            int type = 0;
            String name = "";
            int tires = 0;
            int carWheels = 0;
            int truckWheels = 0;
            int busWheels = 0;
            while (input.hasNext()) {
                type = input.nextInt();
                name = input.next();
                tires = input.nextInt();
                if (type == 1) {
                    double worth = input.nextInt();
                    Vehicle v = new Cars(name, tires, worth);
                    list.add(v);
                } else if (type == 2) {
                    int miles = input.nextInt();
                    Vehicle v = new Trucks(name, tires, miles);
                    list.add(v);
                } else if (type == 3) {
                    String home = input.next();
                    Vehicle v = new Buses(name, tires, home);
                    list.add(v);
                }
                vehicles++;
            }
            System.out.println("The total number of vehicles is " + vehicles);

            for (Vehicle myVehicle :  list) {
                if (myVehicle instanceof Cars) {
                    carValue += myVehicle.getValue();
                }
                vehicleValue += myVehicle.getValue();
            }
            System.out.println("The total amount that the cars are worth is " + carValue);
            System.out.println("The total amount that the vehicles are worth is " + vehicleValue);

            for (Vehicle bus : list) {
                if (bus instanceof Buses) {
                    if (((Buses) bus).myHome.length() > longestHome.length()) {
                        longestHome = ((Buses) bus).myHome;
                    }
                }
            }
            System.out.println("The longest home destination is " + longestHome);

            for (Vehicle truck : list) {
                if (truck instanceof Trucks) {
                    if (truck.getValue() < smallTruckValue) {
                        smallTruckValue = truck.getValue();
                        smallTruckName = truck.getName();
                    }
                }
            }
            System.out.println("The truck with the least value is " + smallTruckName);

            for (Vehicle myVehicle : list) {
                if (myVehicle instanceof Cars) {
                    carWheels += myVehicle.getTires();
                }
                if (myVehicle instanceof Trucks) {
                    truckWheels += myVehicle.getTires();
                }
                if (myVehicle instanceof Buses) {
                    busWheels += myVehicle.getTires();
                }
            }
            System.out.println("The total amount of wheels on cars is " + carWheels);
            System.out.println("The total amount of wheels on trucks is " + truckWheels);
            System.out.println("The total amount of wheels on buses is " + busWheels);

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
