package Q3.Prog702q;

public class Buses extends Vehicle
{
    String myName = "";
    int myTires = 0;
    double myValue = 50000;
    String myHome = "";
    public Buses(String name, int tires, double value, String home) {
        super(name, tires, 50000);
        myHome = home;
    }

    public String getName() {return myName;}
    public int getTires() {return myTires;}
    public double getValue() {return myValue;}
    public String getHome() {return myHome;}
}
