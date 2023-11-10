package Q2.Prog402aCl;

public class Cl402a {
    private double[] myID = new double[21];
    private double[] myScore = new double[21];
    private double[] myDiff = new double[21];
    private  int lcv = 0;
    private int myAvg = 0;

    public Cl402a(double ID, double Score) {
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
        while (lcv != 21) {
            myDiff[lcv] = myScore[lcv] - myAvg;
        }

    }
    public String toString() {
        String bingus = "";
        lcv = 0;
        //add to bingus using a loop to make it print in a chunk
        return "stuff";
    }

}
