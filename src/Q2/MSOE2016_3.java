import java.util.Scanner;

public class MSOE2016_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the lens in positive inches: ");
        double R1 = input.nextDouble();
        System.out.print("Enter the radius of the lens in negative inches: ");
        double R2 = input.nextDouble();
        System.out.print("Enter the thickness of the lens in inches: ");
        double d = input.nextDouble();
        System.out.print("Enter the refractive index: ");
        double n = input.nextDouble();
        double f = 1/((n-1)*((1/R1)-(1/R2)+(((n-1) * d)/n*R1*R2)));
        System.out.println(f);
    }
}
