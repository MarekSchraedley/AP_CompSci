import java.util.Scanner;

public class Lp5_5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = keyboard.nextInt();
        String nums = Integer.toString(num);
        int lcv = 0;
        while (lcv != nums.length()) {
            System.out.println(nums.substring(lcv, lcv + 1));
            lcv++;
        }
    }
}
