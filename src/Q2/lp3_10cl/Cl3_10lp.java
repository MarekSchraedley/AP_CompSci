package lp3_10cl;

public class Cl3_10lp {
    private int myBurgers;
    private int myFries;
    private int mySodas;
    private double myTotal;
    private double myTax;

    private double myTender;

    public Cl3_10lp(int Burgers, int Fries, int Sodas){
        myBurgers = Burgers;
        myFries = Fries;
        mySodas = Sodas;
        myTotal = 0;
        myTotal = 0;

    }

    public void calc() {
        myTotal = Math.round(((myBurgers*1.69) + (myFries*1.09) + (mySodas*0.99))*100.0)/100.0;
        myTax = Math.round(myTotal * 0.065 * 100.0)/100.0;
    }

    public String toString() {
        return "Total before tax: $" + myTotal + "\nTax: $" + myTax + "\nFinal total: $" + (myTotal+myTax);
    }

    public String tender(double amount) {
        return "Change: $" + (amount-(myTotal + myTax));
    }
}
