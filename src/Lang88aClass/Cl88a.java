package Lang88aClass;

public class Cl88a {
    private double myint1;
    private double myint2;
    private double mysum;
    private double mydiff;
    private double myprod;
    private double myavg;
    private double mydist;
    private double mymax;
    private double mymin;

    public Cl88a(int int1, int int2) {
         myint1 = int1;
         myint2 = int2;
         mysum = 0;
         mydiff = 0;
         myprod = 0;
         myavg = 0;
         mydist = 0;
         mymax = 0;
         mymin = 0;
    }
    public void calc() {
        mysum = myint1 + myint2;
        mydiff = myint1 - myint2;
        myprod = myint1 * myint2;
        myavg = (myint1+myint2)/2;
        mydist = Math.abs(mydiff);
        mymax = Math.max(myint1, myint2);
        mymin = Math.min(myint1, myint2);
    }

    public String toString() {
        return mysum + "\n" + mydiff + "\n" + myprod + "\n" + myavg + "\n" + mydist + "\n" + mymax + "\n" + mymin;
    }
}
