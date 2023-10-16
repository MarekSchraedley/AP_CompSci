import java.util.Scanner;

public class Lp5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lcv = 0;
        while (lcv!=3) {
            System.out.print("Enter the password: ");
            String password = input.next();
            if (password.equals("TooSilly")) {
                System.out.println("Correct!");
                break;
            }else{
                System.out.println("The password you typed is incorrect.");
            }
            lcv++;
        }
        if (lcv == 3) {
            System.out.println("Access Denied");
        }

    }
}
