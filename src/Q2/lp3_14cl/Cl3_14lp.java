package lp3_14cl;

public class Cl3_14lp {
    private int myNya;
    private int myNym;
    private int myNja;
    private int myNjm;
    private int myCa;
    private int myCm;
    private double myAwbrey;
    private double myMartinez;
    private double myTotal;


    public Cl3_14lp(int Nya, int Nym, int Nja, int Njm, int Ca, int Cm){
        myNya = Nya;
        myNym = Nym;
        myNja = Nja;
        myNjm = Njm;
        myCa = Ca;
        myCm = Cm;
        myAwbrey = 0;
        myMartinez = 0;
        myTotal = 0;
    }

    public void calc() {
        myAwbrey = myNya + myNja + myCa;
        myMartinez = myNym + myNjm + myCm;
        myTotal = myAwbrey + myMartinez;
    }

    public String toString() {
        return "Candidate\t\t\tVotes  Percentage\nAwbrey\t\t\t" +
                myAwbrey + "\t" + ((myAwbrey/myTotal)*100) + " %\nMartinez\t\t"+
                myMartinez + "\t" + ((myMartinez/myTotal)*100) + " %\nTOTAL VOTES:\t\t" + myTotal;
    }
}
