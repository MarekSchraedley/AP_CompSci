import java.util.Scanner;

public class LP5_14 {
    public static void main(String[] args) {
        int lcv = 1;
        System.out.println("Dice1\tDice2\tTotal");
        while (lcv < 6) {
            double num1 = Math.round(Math.random() * 5)+1;
            double num2 = Math.round(Math.random() * 5)+1;
            System.out.println(num1 + "\t\t" + num2 + "\t\t" + (num1+num2));
            lcv++;
        }
    }

}
