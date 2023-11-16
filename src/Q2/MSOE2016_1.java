package Q2;

import java.util.Scanner;

public class MSOE2016_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = input.next();
        String word1 = "";
        String word2 = "";
        for (int lcv = 0; lcv < word.length(); lcv++) {
            word1 += word.substring(lcv, lcv+1);
            word2 += word.substring(word.length()-1-lcv, word.length()-lcv);
        }
        if (word1.equals(word2)) System.out.println("true");
        else System.out.println("false");//figure out why it isnt working

    }
}
