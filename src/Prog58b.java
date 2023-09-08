import java.util.*;


public class Prog58b {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter A: ");
        Double A = keyboard.nextDouble();

        System.out.print("Enter B: ");
        Double B = keyboard.nextDouble();

        System.out.print("Enter C: ");
        Double C = keyboard.nextDouble();

        Double root1 = (-B+Math.sqrt((B*B)-4*A*C))/2*A;
        Double root2 = (-B-Math.sqrt((B*B)-4*A*C))/2*A;
        System.out.print("The roots are:" + root1 + ", " + root2);

    }
}
