package Q3.Prog702q;

public class Trucks extends Vehicle {

    int myMiles = 0;
    public Trucks(String name, int tires, int miles) {
        super(name, tires, 50000 - (miles * 0.25));
        myMiles = miles;
    }


    public double getMiles() {return myMiles;}
}
