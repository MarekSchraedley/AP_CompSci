import java.util.Scanner;

public class Lang76a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number you dislike: ");
        int num = keyboard.nextInt();
        System.out.println(num);
        System.out.println("X 9");
        System.out.println("______");
        System.out.println(num*9);
        System.out.println("X 12345679");
        System.out.println("______");
        System.out.println(((num * 9) * 12345679) + " Surprise!");
    }
}
