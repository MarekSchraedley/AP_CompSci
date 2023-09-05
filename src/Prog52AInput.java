import java.util.*;

public class Prog52AInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter length: ");
        int len = input.nextInt();
        System.out.println();

        System.out.print("Please enter Width: ");
        int wid = input.nextInt();
        System.out.println();

        int area = len*wid;
        int perim = 2*len + 2*wid;
        System.out.println("Area = " + area);
        System.out.println("Perimiter = " + perim);

    }
}
/*
Please enter length: 15

Please enter Width: 2

Area = 30
Perimiter = 34
 */