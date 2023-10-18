package Lang82aClass;

public class Cl82a {
    private double mySpeedlim;
    private double mySpeed;
    private double myFine;

    public Cl82a(int Speedlim, int Speed) {
        mySpeedlim = Speedlim;
        mySpeed = Speed;
        myFine = 0.0;
    }

    public void calc() {
        myFine = 20+((mySpeed-mySpeedlim)*5);
    }

    public String toString() {
        return "Fine: " + myFine;
    }
}
