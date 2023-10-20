package Lang54cClass;

public class Cl54c {
    private double myRadius;
    private double myArea;
    private double myCircum;

    public Cl54c(double radius) {
        myRadius = radius;
        myArea = 0;
        myCircum = 0;
    }

    public void calc() {
        myArea = Math.pow(myRadius, 2)*3.14159;
        myCircum = myRadius * 3.14159 * 2;
    }

    public String toString() {
        return "The Radius of the circle = " + myRadius + "\nThe Area of the circle = " + myArea + "\nThe Circumference of the circle = " + myCircum;
    }

}
