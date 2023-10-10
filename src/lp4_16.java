import java.util.Scanner;

public class lp4_16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = keyboard.nextInt();
        System.out.println("Sine: " + Math.sin(Math.toRadians(angle)));
        System.out.println("Cosine: " + Math.cos(Math.toRadians(angle)));
        System.out.println("Tangent: " + Math.tan(Math.toRadians(angle)));
    }
}
