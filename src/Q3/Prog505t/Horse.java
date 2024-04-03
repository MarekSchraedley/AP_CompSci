package Q3.Prog505t;

public class Horse {
    private int myWeight;
    private int myHayBales;
    private int myCorn;
    private int myRides;
    private double myRideCost;

    public Horse(int weight, int corn, int hay, int rides, double rideCost) {
        myWeight = weight;
        myCorn = corn;
        myHayBales = hay;
        myRides = rides;
        myRideCost = rideCost;

    }

    public void setHorse(int weight, int corn, int hay, int rides, double rideCost) {
        myWeight = weight;
        myCorn = corn;
        myHayBales = hay;
        myRides = rides;
        myRideCost = rideCost;

    }


    public int getWeight() {return myWeight;}
    public int getHayBales() {return myHayBales;}
    public int getCorn() {return myCorn;}
    public int getRides() {return myRides;}
    public double getRideCost() {return myRideCost;}


}
