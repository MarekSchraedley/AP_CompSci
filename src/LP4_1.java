import java.util.Scanner;

public class LP4_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of copies to be printed: ");
        int copies = keyboard.nextInt();
        double rate = 0;
        if (0 < copies && copies < 99) {
            rate = 0.30;
        }else if (100 <= copies && copies <= 499) {
            rate = 0.28;
        }else if (500 <= copies && copies <= 749) {
            rate = 0.27;
        }else if (750 <= copies && copies <= 1000) {
            rate = 0.26;
        }else if (1000 < copies) {
            rate = 0.25;
        }
        System.out.println("Price per copy is: $" + rate);
        System.out.printf("Total cost is: $%.2f", (copies * rate));
    }
}
