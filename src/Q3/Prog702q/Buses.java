package Q3.Prog702q;

public class Buses extends Vehicle
{
    String myHome = "";
    public Buses(String name, int tires, double value, String home) {
        super(name, tires, 50000);
        myHome = home;
    }

    public String getHome() {return myHome;}
}
