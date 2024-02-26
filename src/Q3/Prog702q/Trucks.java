package Q3.Prog702q;

public class Trucks extends Vehicle {
    String myName = "";
    int myTires = 0;
    double myValue = 50000;
    int myMiles = 0;
    public Trucks(String name, int tires, int miles) {
        super(name, tires, 50000);
        myMiles = miles;
    }

    public String getName() {return myName;}
    public int getTires() {return myTires;}
    public double getValue() {return myValue;}
    public double getMiles() {return myMiles;}
}
