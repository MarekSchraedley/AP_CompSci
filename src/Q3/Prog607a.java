package Q3;

import java.io.File;
import java.util.Scanner;

public class Prog607a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = 0;
        int day = 0;
        String dayString = "";
        int year = 0;
        String code = "";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String backwards="ZYXWVUTSRQPONMLKJIHGFEDCBA";
        int selection = 0;
        System.out.print("-----menu-----\n0) Quit\n1) Encode Date\n2) Decode Date\nSelect an option ");
        selection = input.nextInt();
        if (selection == 1) {
            System.out.println();
            System.out.print("Enter month: ");
            month = input.nextInt();
            System.out.print("Enter day: ");
            day = input.nextInt();
            System.out.print("Enter year: ");
            year = input.nextInt();
            code += letters.substring(month-1, month);
            if (day / 10 >= 1) {
                code += letters.substring(day/10 + 15, day/10 + 16);
            } else {
                code += "O";
            }
            code += letters.substring(day % 10 + 15, day % 10 + 16);
            code += backwards.substring(year-70-1, year-70);
            System.out.println(code);
        }
        if (selection == 2) {
            System.out.print("Enter Code: ");
            code = input.next();
            month = letters.indexOf(code.substring(0,1))+1;
            if (!(code.substring(1, 2).equals("O"))) {
                dayString += (letters.indexOf(code.substring(1, 2)) - 16);
            }
            dayString += (letters.indexOf(code.substring(2, 3)) - 16);
            year = letters.indexOf(code.substring(3,4))+70;
            System.out.println(month + "/" + dayString + "/" + year); //Decode Date does not work correctly. Fix it
        }
    }
}
