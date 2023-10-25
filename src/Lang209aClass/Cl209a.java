package Lang209aClass;

public class Cl209a {
    private double myNum;
    private double myLess;
    private double myGreat;
    private double myCount;




    public void calc(int num)
    {
        myNum = num;
        if (myNum<500) {
            myLess++;
        }
        else if (myNum>=79) {
            myGreat++;
        }
        myCount++;
    }

    public String toString() {
        return "The number of numbers less than 500 is " + myLess + "\nThe number of numbers greater than or equal to 500 is " + myGreat + "\nThe number of numbers is " + myCount;
    }
}
