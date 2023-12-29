package Prog215h;

import java.util.ArrayList;

public class Cl215h {
    private ArrayList<Double> myScores = new ArrayList<Double>();
    private double mySum;
    private double myAverage;

    private String myStrscores;

    public Cl215h(ArrayList<Double> scores) {
        myScores = scores;
        mySum = 0;
        myAverage = 0;
        myStrscores = "";
    }

    public void calc() {
        for(double num : myScores) {
            myStrscores += Double.toString(num) + " ";
        }
        double myMin = myScores.get(0);
        double myMinindex = 0;
        double myMax = 0;
        double myMaxindex = 0;
        for (int lcv = 0; lcv < myScores.size(); lcv++) {
            if (myScores.get(lcv) > myMax) {
                myMax = myScores.get(lcv);
                myMaxindex = lcv;
            }
            if (myScores.get(lcv) < myMin) {
                myMin = myScores.get(lcv);
                myMinindex = lcv;
            }
        }
        myScores.remove(myMaxindex);
        myScores.remove(myMinindex);
        for(double num : myScores) {
            mySum += num;
        }
        myAverage = mySum/myScores.size();
    }

    public String toString() {
        return myStrscores + " =" + myAverage;
    }
}
