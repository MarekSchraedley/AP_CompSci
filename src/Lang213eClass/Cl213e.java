package Lang213eClass;

public class Cl213e {
    private double myAge;
    private double from0_19;
    private double from20_39;
    private double from40_59;
    private double from60_79;
    private double from79_;
    private double sum;




    public void calc(int age)
    {
        myAge = age;
        if (myAge<20) {
            from0_19++;
        }
        else if (myAge>=20 && myAge<=39) {
            from20_39++;
        }
        else if (myAge>=40 && myAge<=59) {
            from40_59++;
        }
        else if (myAge>=60 && myAge<=79) {
            from60_79++;
        }
        else if (myAge>79) {
            from79_++;
        }
    }

    public String toString() {
        //return everything in one big chunk & do percentages on the spot
        sum = from0_19+from20_39+from40_59+from60_79+from79_;
        return "Age group\tDistribution\tPercentage\n" +
                "<20\t\t\t" + from0_19 + "\t\t\t\t" + Math.round(from0_19/sum*100.0) + "\n" +
                "20-39\t\t\t" + from20_39 + "\t\t\t\t" + Math.round(from20_39/sum*100.0) + "\n" +
                "40-59\t\t\t" + from40_59 + "\t\t\t\t" + Math.round(from40_59/sum*100.0) + "\n" +
                "60-79\t\t\t" + from60_79 + "\t\t\t\t" + Math.round(from60_79/sum*100.0) + "\n" +
                ">79\t\t\t" + from79_ + "\t\t\t\t" + Math.round(from79_/sum*100.0);
    }
}
