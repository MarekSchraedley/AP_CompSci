package Q2.Prog410t;

public class Cl410t {
    private int myID;
    private double myIncome;
    private int myMembers;

    public Cl410t(int ID, double income, int members) {

        myID = ID;
        myIncome = income;
        myMembers = members;
    }

    public int getID() {return myID;}
    public double getIncome() {return myIncome;}
    public int getMembers() {return myMembers;}

    public String toString() {
        return String.format("%d\t%.2f\t%d", myID, myIncome, myMembers);
    }

}
