package Lang54bClass;

public class Cl54b {
    private double myNum1;
    private double myNum2;
    private double myNum3;
    private double myNum4;
    private double mySum;
    private double myAverage;

    public Cl54b(double num1, double num2, double num3, double num4) {
        myNum1 = num1;
        myNum2 = num2;
        myNum3 = num3;
        myNum4 = num4;
    }

    public void calc() {
        mySum = myNum1 + myNum2 + myNum3 + myNum4;
        myAverage = mySum/4;
    }

    public String toString() {
        return "The sum of the four numbers is " + mySum + "\nThe average of the four numbers is " + myAverage;
    }
}
