package Q2.prog213fArrayCl;

public class CL213f {
    private double myKwh;
    private double myCost;

    public CL213f(double kwh) {
        myKwh = kwh;
        myCost = 0;
    }
    public void calc() {
        if (myKwh <=2000 && myKwh >=0) myCost = 0.07 * myKwh;
        else if (myKwh <=10000) myCost = 0.05 * (myKwh-2000) + (2000 * 0.07);
        else if (myKwh > 10000) myCost = 0.04 * (myKwh-10000) + (8000* 0.05) + (2000 * 0.07);
    }

    public String toString() {
        return "The number is " + myCost;
    }
}
