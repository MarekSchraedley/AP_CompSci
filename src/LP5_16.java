import java.util.Scanner;

public class LP5_16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double Tf = Math.round(Math.random());
        double place = 4;
        System.out.print(Tf);
        while (place > 0 && place <= 7) {
            if (Tf == 1) {
                place += 1;
            }else{
                place -= 1;
            }
        }

    }
}
