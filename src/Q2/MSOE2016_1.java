package Q2;

import java.util.Scanner;

public class MSOE2016_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = input.next();
        boolean status = true;
        for (int lcv = 0; lcv < word.length(); lcv++) {
            System.out.println(lcv);
            if (word.substring(lcv) != word.substring(word.length()-1-lcv))
                status = false;
        }
        System.out.println(status); //figure out why it isnt working

    }
}
