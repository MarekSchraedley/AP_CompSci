package Q2.clLP48;

public class clLP48 {
    private final int myA;
    private final int myC;
    private final int myM;
    private int myXn;  //Seed

    public clLP48(int a, int c, int m, int x0) {
        myA = a;
        myC = c;
        myM = m;
        myXn = x0;
    }
    public int nextInt() {
        myXn = (myA*myXn+myC) % myM;
        return myXn;
    }

    public String toString() {
        return String.format("(%d * %d + %d) % d = %d",
                             myA, myXn, myC, myM, this.nextInt());
    }
}
