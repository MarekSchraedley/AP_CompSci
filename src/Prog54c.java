import java.util.*;

public class Prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double pi = 3.14159;
        double area = Math.pow(radius, 2) * pi;
        double circum = pi * radius * 2;
        System.out.printf("Radius: %.3f", radius);
        System.out.println();
        System.out.printf("Area: %.3f", area);
        System.out.println();
        System.out.printf("Circumference: %.3f", circum);

    }
}
