import java.util.Scanner;

public class LP4_10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Rectangular Prism");
        System.out.print("Enter the length: ");
        int len = keyboard.nextInt();
        System.out.print("Enter the width: ");
        int wid = keyboard.nextInt();
        System.out.print("Enter the height: ");
        int height = keyboard.nextInt();
        System.out.println("The volume is: " + len*wid*height);
        System.out.println("Sphere");
        System.out.print("Enter the radius: ");
        double rad = keyboard.nextInt();
        System.out.println("The volume is: " + (4.0/3)*Math.pow(rad, 3)*3.14159);
        System.out.println("Cube");
        System.out.print("Enter the length of each side: ");
        int side = keyboard.nextInt();
        System.out.println("The volume is: " + Math.pow(side, 3));
    }
}
