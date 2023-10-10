import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    public static class Lang65h {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter Pounds: ");
            double pound = keyboard.nextInt();
            System.out.print("Enter Shillings: ");
            double shil = keyboard.nextInt();
            System.out.print("Enter Pence: ");
            double pence = keyboard.nextInt();

            System.out.printf("Decimal pounds: %.2f", ((pound+((((shil*12)+pence)/240)))));
        }
    }
}
