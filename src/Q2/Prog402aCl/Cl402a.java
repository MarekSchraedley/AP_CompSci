package Q2.Prog402aCl;

public class Cl402a {
    private static double[] myID = new double[21];
    private static double[] myScore = new double[21];
    private static double[] myDiff = new double[21];
    private static int lcv;
    private static double myAvg;

    public Cl402a() {
        lcv = 0;
        myAvg = 0;
    }

    public void add(double ID, double Score) {
        myID[lcv] += ID;
        myScore[lcv] += Score;
        lcv++;
    }

    public void calc() {
        lcv = 0;
        while (lcv != 21) {
            myAvg += myScore[lcv];
            lcv++;
        }
        myAvg /= 21;
        lcv = 0;
        while (lcv != 21) {
            myDiff[lcv] = myScore[lcv] - myAvg;
            lcv++;
        }

    }
    public String toString() {
        String bingus = "";
        lcv = 0;
        while (lcv != 21) {
            bingus += "\n" + myID[lcv] + "\t\t" + myScore[lcv] + "\t\t" + myDiff[lcv];
            lcv++;
        }
        bingus += "\nAverage Score = " + myAvg;
        return bingus; //finish the program section
    }

}
