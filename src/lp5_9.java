import java.util.Scanner;

public class lp5_9 {
    public static void main(String[] args) {
        System.out.println("x^1\t\tx^2\t\tx^3\t\tx^4\t\tx^5");
        int lcv = 1;
        while (lcv <= 6) {
            System.out.println(lcv+"\t\t"+Math.pow(lcv, 2)+"\t\t"+Math.pow(lcv, 3)+"\t\t"+Math.pow(lcv, 4)+"\t\t"+Math.pow(lcv, 5));
            lcv++;
        }
    }
}
