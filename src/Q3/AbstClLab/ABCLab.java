package Q3.AbstClLab;


import java.util.Scanner;

public class ABCLab {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double r = kbd.nextDouble();
        Shape sh1 = new Circle(r);
        System.out.print("Enter height: ");
        double rh = kbd.nextDouble();
        System.out.print("Enter width: ");
        double rw = kbd.nextDouble();
        Shape sh2 = new Rectangle(rh, rw);
        System.out.print("Enter triangle base: ");
        double tb = kbd.nextDouble();
        System.out.print("Enter triangle height: ");
        double th = kbd.nextDouble();
        Shape sh3 = new Triangle(th, tb);

        ((Circle)sh1).printClass();
        sh1.calculateArea();
        sh1.calculateCircumference();

        ((Rectangle)sh2).printClass();
        sh2.calculateArea();
        ((Rectangle) sh2).calculatePerimiter();

        ((Triangle)sh3).printClass();
        sh3.calculateArea();
        ((Triangle) sh3).calculatePerimiter();
    }
}
