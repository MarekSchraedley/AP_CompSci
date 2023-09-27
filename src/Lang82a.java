import java.util.*;

public class Lang82a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Speed Limit: ");
        int limit = keyboard.nextInt();
        System.out.print("Enter Vehicle Speed: ");
        int speed = keyboard.nextInt();
        System.out.print("Fine: $" + (20.0 +  ((speed-limit) * 5.00)));
    }
}
