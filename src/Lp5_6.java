import java.util.Scanner;

public class Lp5_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = keyboard.nextInt();
        String nums = Integer.toString(num);
        int lcv = 0;
        int sum = 0;
        while (lcv != nums.length()) {
            sum += Integer.parseInt(nums.substring(lcv, lcv + 1)); //convert the string to int
            lcv++;
        }
        System.out.print(sum);
    }
}
