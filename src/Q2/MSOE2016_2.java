package Q2;

import java.util.Scanner;

public class MSOE2016_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side a length: ");
        double sideA = input.nextDouble();
        System.out.print("Enter side c length: ");
        double sideC = input.nextDouble();
        System.out.print("Enter degree measure of angle a: ");
        double angleA = input.nextDouble();
        double angleC = (Math.toDegrees(Math.asin((Math.sin(Math.toRadians(angleA))/sideA)*sideC)));
        if (angleA + angleC < 180) {
            System.out.println("The two solutions are " + angleC + " and " + (180-angleC));
        } else {
            System.out.println(angleC);
        }
    }
}
