package Q3.Prog505t;

public class Cow {
    private int myWeight;
    private int myMilk;
    private int myHayBales;
    private int myCorn;

    public Cow(int weight, int milk, int corn, int hay) {
        myWeight = weight;
        myMilk = milk;
        myCorn = corn;
        myHayBales = hay;
    }


    public int getWeight() {return myWeight;}
    public int getMilk() {return myMilk;}
    public int getHayBales() {return myHayBales;}
    public int getCorn() {return myCorn;}
}
