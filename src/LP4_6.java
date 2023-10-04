import java.util.Scanner;

public class LP4_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num1 = Math.floor(Math.random() * 10);
        double sign = Math.floor(Math.random() * 10);
        double num2 = Math.floor(Math.random() * 10);
        String signtext = "";

        if (sign >= 0 && sign < 2) {
            signtext = "*";
        }
        else if (sign >= 2 && sign < 4) {
            signtext = "+";
        }
        else if (sign >= 4 && sign < 7) {
            signtext = "-";
        }
        else if (sign >= 7 && sign < 10) {
            signtext = "/";
        }

        System.out.println(num1 + " " + signtext + " " + num2);

        System.out.print("Enter your answer rounded down: ");
        int answer = keyboard.nextInt();
        if (signtext == "*") {
            if (answer == Math.floor(num1*num2)) {
                System.out.print("Correct!");
            } else {
                System.out.print("Incorrect.");
            }
        }
        else if (signtext == "+") {
            if (answer == Math.floor(num1+num2)) {
                System.out.print("Correct!");
            } else {
                System.out.print("Incorrect.");
            }
        }
        else if (signtext == "-") {
            if (answer == Math.floor(num1-num2)) {
                System.out.print("Correct!");
            } else {
                System.out.print("Incorrect.");
            }
        }
        else if (signtext == "/") {
            if (answer == Math.floor(num1/num2)) {
                System.out.print("Correct!");
            } else {
                System.out.print("Incorrect.");
            }
        }

    }
}
