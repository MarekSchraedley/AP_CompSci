package Q3.Prog702q;

public class Cars extends Vehicle {
    String myName = "";
    int myTires = 0;
    double myValue = 0;
    public Cars(String name, int tires, double value) {
        super(name, tires, value);
    }

    public String getName() {return myName;}
    public int getTires() {return myTires;}
    public double getValue() {return myValue;}
}
