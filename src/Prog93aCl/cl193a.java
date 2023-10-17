package Prog93aCl;

public class cl193a {
    private double myKilos;
    private double myBase;
    private double mySurcharge;
    private double myCity;
    private double myAmount;
    private double myExtrapay;



    public cl193a(int kWatts) {
        myKilos = kWatts;
        double myBase = 0.0;
        double mySurcharge = 0.0;
        double myCity = 0.0;
        double myAmount = 0.0;
        double myExtrapay = 0.0;

    }

    public double getBase() { return myBase; }
    public double getSurcharge() { return mySurcharge; }
    public double getCity() { return myCity; }
    public double getAmount() { return myAmount; }
    public double getExtra() { return myExtrapay; }

    public void calc() {

        myBase = Math.round(0.0475 * myKilos*100.0)/100.0;
        mySurcharge = Math.round(0.1 * myBase*100.0)/100.0;
        myCity = Math.round(0.03 * myBase*100.0)/100.0;
        myAmount = myBase + mySurcharge + myCity;
        myExtrapay = Math.round(1.04 * myAmount*100.0)/100.0;

    }


    public String toString(){
        return myKilos + "\n" +myBase +"\n" + mySurcharge +"\n"+ myCity +"\n"+ myAmount +"\n"+myExtrapay;
    }
}
