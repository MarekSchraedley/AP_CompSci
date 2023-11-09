package Q2.Prog435aCl;

public class Cl435a {
    private double myCar;
    private double myGate;
    private double myType;
    private String myName;
    private double myToll;

    public Cl435a(double car, double toll) {
        myCar = car;
        myGate = toll;
        myType = 0;
        myName = "";
        myToll = 0;

    }

    public void calc() {
        if (myCar == 1) {myType = 1; myName = "Compact Car";}
        else if (myCar == 2) {myType = 1.3; myName = "Small Car";}
        else if (myCar == 3) {myType = 1.6; myName = "Mid Size Car";}
        else if (myCar == 4) {myType = 2.0; myName = "Full Size Car";}
        else if (myCar == 5) {myType = 2.4; myName = "Truck";}
        else if (myCar == 6) {myType = 2.7; myName = "16 Wheeler";}
        if (myGate == 1) {myToll = 1.35;}
        else if (myGate == 2) {myToll = 2;}
        else if (myGate == 3) {myToll = 2.5;}
        else if (myGate == 4) {myToll = 3.25;}
        else if (myGate == 5) {myToll = 4.10;}
        else if (myGate == 6) {myToll = 4.8;}
        else if (myGate == 7) {myToll = 5.5;}
        else if (myGate == 8) {myToll = 6.0;}
    }

    public String toString() {
        return myName + "\t$" + myType + "\t" + myToll + "\t$" + (myToll*myType);
    }
}
