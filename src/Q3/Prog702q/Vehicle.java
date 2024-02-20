package Q3.Prog702q;

public class Vehicle implements names {
    String myName = "";
    int myTires = 0;
    double myValue = 0;
    public Vehicle(String name, int tires, double value) {
        myName = name;
        myTires = tires;
        myValue = value;
    }

    public String getName() {return myName;}
    public int getTires() {return myTires;}
    public double getValue() {return myValue;}
}
