package Q2.lp3_9cl;
import java.util.Scanner;
public class lp3_9cl {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        int Byear = keyboard.nextInt();
        System.out.print("Month: ");
        int Bmonth = keyboard.nextInt();
        System.out.print("Day: ");
        int Bday = keyboard.nextInt();
        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        int Cyear = keyboard.nextInt();
        System.out.print("Month: ");
        int Cmonth = keyboard.nextInt();
        System.out.print("Day: ");
        int Cday = keyboard.nextInt();
        Cl3_9lp wow = new Cl3_9lp(Byear, Bmonth, Bday, Cyear, Cmonth, Cday);
        wow.calc();
        System.out.println(wow.toString());
    }
}
