package Q2.clLP48;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class clLP48Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = keyboard.nextInt();

        System.out.print("Enter c: ");
        int c = keyboard.nextInt();

        System.out.print("Enter m: ");
        int m = keyboard.nextInt();

        System.out.print("Enter the seed: ");
        int x0 = keyboard.nextInt();

        clLP48 wow = new clLP48(a, c, m, x0);
        wow.nextInt();
        for (int i = 0; i <= 10; i++) {
            String wew = wow.toString();
            System.out.println(wew);
        }
    }
}
