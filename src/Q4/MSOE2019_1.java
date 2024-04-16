package Q4;

import java.util.Scanner;

public class MSOE2019_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two letters: ");
        String letter1 = input.next();
        String letter2 = input.next();
        String string1 = letter1 + letter2;
        String string2 = letter2 + letter1;
        int count = 0;
        System.out.println("Enter a string: ");
        input.nextLine();
        String longString = input.nextLine();
        for (int lcv = 0; lcv < longString.length()-1; lcv++) {
            if (longString.substring(lcv, lcv+2).equals(string1) || longString.substring(lcv, lcv+2).equals(string2)) count++;
        }
        System.out.println(count);

    }
}
