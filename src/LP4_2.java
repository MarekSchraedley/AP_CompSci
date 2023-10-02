import java.util.Scanner;

public class LP4_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter package weight in kilograms: ");
        int kilo = keyboard.nextInt();
        System.out.print("Enter package length in centimeters: ");
        int len = keyboard.nextInt();
        System.out.print("Enter package width in centimeters: ");
        int wid = keyboard.nextInt();
        System.out.print("Enter package height in centimeters: ");
        int height = keyboard.nextInt();
        if (len*wid*height > 10000) {
            if (kilo > 27) {
                System.out.print("Too heavy and too large");
            }else{
                System.out.print("Too large");
            }
        }else{
            if (kilo > 27) {
                System.out.print("Too heavy");
            }else {
                System.out.print("Good package");
            }
        }
    }
}
