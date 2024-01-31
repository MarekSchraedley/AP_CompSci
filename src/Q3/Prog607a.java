package Q3;

import java.io.File;
import java.util.Scanner;

public class Prog607a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = 0;
        int day = 0;
        int year = 0;
        String code = "";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int selection = 0;
        System.out.print("-----menu-----\n0) Quit\n1) Encode Date\n2) Decode Date\nSelect an option ");
        selection = input.nextInt();
        if (selection == 1) {
            System.out.println();
            System.out.println("Enter month: ");
            month = input.nextInt();
            System.out.println("Enter day: ");
            day = input.nextInt();
            System.out.println("Enter year: ");
            year = input.nextInt();
            code += letters.substring(); //finish this program
        }
    }
}
