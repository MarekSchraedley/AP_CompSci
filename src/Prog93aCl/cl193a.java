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

    public int getBase() { return myBase; }
    public int getSurcharge() { return mySurcharge; }
    public int getCity() { return myCity; }
    public int getAmount() { return myamount; }
    public int getExtra() { return myextrapay; }

    public void calc() {
        bRate = 0.0475 *
    }


    public String toString(){
        return myKilos + "\n" +myBase +"\n" + mySurcharge +"\n"+ myCity +"\n"+ myamount +"\n"+myextrapay;
    }
}
