package Q2.Prog214c;

public class Cl214c {
    private double myGallons;
    private String myType;
    private String myFulltype;
    private String myCarWash;

    private double myRate;

    private double myGascost;
    private double myCarwashcost;
    private double myTotal;

    public Cl214c(double gallons, String type, String carwash) {
        myGallons = gallons;
        myType = type;
        myCarWash = carwash;
        myFulltype = "";
        myRate = 0;
        myGascost = 0;
        myCarwashcost = 0;
        myTotal = 0;
    }

    public void calc() {
        if (myType.equals("R")) {
            myRate = 1.359;
            myFulltype = "Regular";
        }
        if (myType.equals("P")) {
            myRate = 1.479;
            myFulltype = "Premium";
        }
        if (myType.equals("H")) {
            myRate = 1.429;
            myFulltype = "High Octane";
        }
        myGascost = myGallons * myRate;
        if (myCarWash.equals("N")) myCarwashcost = 0;
        else if (myGallons > 20) myCarwashcost = 0;
        else if (myGallons < 10) myCarwashcost = 2;
        else myCarwashcost = (((10 - Math.floor(myGallons-10))*0.1)*2);
        myTotal = myGascost + myCarwashcost;
    }

    public String toString() {
        return "COMPSCI PETROLEUM COMPANY\n" +
                "------------------------------------\n" +
                myFulltype + "\t\t" + myGallons + " gallons @ " + myRate + "\n" +
                "------------------------------------\n" +
                "Gasoline \t\t"  + myGascost + "\n" +
                "Wash " + myCarWash + "\t\t" + myCarwashcost + "\n" +
                "Total Due \t\t" + myTotal + "\n";

    }

}
