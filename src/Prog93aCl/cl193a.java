package Prog93aCl;

public class cl193a {
    private double myKilos;
    private double myBase;
    private double mySurcharge;
    private double myCity;
    private double myamount;
    private double myextrapay; //I want to kill myself please finish this



    public cl193a(int kWatts) {
        myKilos = kWatts;
        double myBase = 0.0;

    }

    public double getBase() { return myBase; }
    public double getSurcharge() { return mySurcharge; }
    public double getCity() { return myCity; }
    public double getAmount() { return myamount; }
    public double getExtra() { return myextrapay; }

    public void calc() {
        bRate = 0.0475 *
    }


    public String toString(){
        return myKilos + "\n" +myBase +"\n" + mySurcharge +"\n"+ myCity +"\n"+ myamount +"\n"+myextrapay;
    }
}
