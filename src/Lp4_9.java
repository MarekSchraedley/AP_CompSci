import java.util.Scanner;

public class Lp4_9 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double r = Math.floor(Math.random()*20);
        System.out.print("Enter a number between 1 and 20: ");
        double guess = keyboard.nextInt();
        if (guess == r) System.out.println("Correct");
        else System.out.println("Incorrect");
        System.out.println("The answer was " + r);
    }
}
