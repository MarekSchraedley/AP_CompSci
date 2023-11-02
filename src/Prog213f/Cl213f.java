package Prog213f;

public class Cl213f {
    private double myKWH;
    private double myCost;
    // Input sSection (Constructor)
    public Cl213f(double KWH) {
        // Set up private data
        myKWH = KWH;
    }

    // Calculation Section (Mutators/Setters)
    public void calc() {
        if (myKWH <=2000 && myKWH >=0) myCost = 0.07 * myKWH;
        else if (myKWH <=10000) myCost = 0.05 * (myKWH-2000) + (2000 * 0.07);
        else if (myKWH > 10000) myCost = 0.04 * (myKWH-10000) + (8000* 0.05) + (2000 * 0.07);
    }

    //Output Section (Accessors/Getters)
    public String toString() {
        return "The cost of " + myKWH + " is $" + myCost;
    }
}
