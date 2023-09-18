import java.util.*;

public class prog72t {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Time 1: ");
        int a = keyboard.nextInt();
        System.out.print("Enter Time 2: ");
        int b = keyboard.nextInt();
        int count = 0;
        int iterate = a;
        while (iterate != b) {
            if (a % 100 == 59) { //
                iterate = 0;
                count += 1;
            }
            iterate += 1;
            count += 1;
        }

        System.out.print(count);
    }
}
