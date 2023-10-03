import java.util.Scanner;

public class LP4_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of eggs purchased: ");
        int eggs = keyboard.nextInt();
        double rate = 0; //Finis
        if (0 <= eggs && eggs < 48) {
            rate = 0.50/12;
        }else if (48 <= eggs && eggs < 72) {
            rate = 0.45/12;
        }else if (72 <= eggs && eggs < 132) {
            rate = 0.40/12;
        }else if (132 <= eggs) {
            rate = 0.35/12;
        }
        System.out.print("The bill is equal to: " + eggs * rate);
    }
}
