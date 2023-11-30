package Q2.Prog410t;

public class Cl410t {
    private int[] myID = new int[25];
    private int[] myIncome = new int[25];
    private int[] myMembers = new int[25];
    private int count = 0;

    public Cl410t(int ID, int income, int members) {

        myID[count] = ID;
        myIncome[count] = income;
        myMembers[count] = members;
        count++;
    }

}
