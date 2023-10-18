package Lang76aClass;

public class Cl76a {
    private double myNum;
    private double myNum2;
    private double myNum3;

    public Cl76a(int num) {
        myNum = num;
        myNum2 = 0;
        myNum3 = 0;
    }

    public void calc() {
        myNum2 = myNum*9;
        myNum3 = myNum2*12345679;
    }

    public String toString() {
        return myNum + "\nx 9\n_____\n" + myNum2 + "\nx 12345679\n_____\n" + myNum3;
    }
}
