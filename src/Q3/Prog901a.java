package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog901a {
    public static void printFile(Scanner input) {
        String text = "";
        while (input.hasNext()) {
            text += input.nextLine() + "\n";
        }
        System.out.println(text);
        System.out.println(reverseString(text));
    }

    public static String reverseString(String s) {
        String text = "";
        for (int lcv = s.length(); lcv > 0; lcv--) {
            text += s.substring(lcv-1, lcv);
        }
        return text;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog901a.dat"));
            printFile(input);

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
