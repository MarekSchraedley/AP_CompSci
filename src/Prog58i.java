import java.util.*;

public class Prog58i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount I wish to borrow is: $");
        double p = input.nextDouble(); //principal

        System.out.print("The loan rate is: ");
        double r = input.nextDouble(); //rate

        System.out.print("The number of months to pay off the loan is ");
        double m = input.nextDouble();  //months

        double r_over_1200 = r / 1200;
        double MP = p * (r_over_1200 * (Math.pow((1+r_over_1200), m)
                                     / (Math.pow((1+r_over_1200), m)-1)));
        System.out.printf("My monthly payments will be $%.2f\n", MP);
        System.out.printf("The total interest paid is $%.2f\n", MP * m);
        System.out.printf("The total amount paid is $%.2f\n", (MP * m) + p);
    }
}
/*
The amount I wish to borrow is: $7500
The loan rate is: 14.5
The number of months to pay off the loan is 36
My monthly payments will be $258.16
The total interest paid is $9293.66
The total amount paid is $16793.66
 */