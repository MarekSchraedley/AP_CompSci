package Q3.Prog702q;

public class Buses extends Vehicle
{
    String myHome = "";
    public Buses(String name, int tires, String home) {
        super(name, tires, 50000.0);
        myHome = home;
    }

    public String getHome() {return myHome;}
}
