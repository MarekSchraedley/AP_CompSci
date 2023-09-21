public class prog166e {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        double c = 0;
        //while (condition1 && condition2) are both true... [AND]
        //while (condition1 || condition2) either one or both are true... [OR]
        while (a < 16 && b <= 15) {
            a += 1;
            if (a == b) {
                b++;
                if (a!=15) {
                    a = 1;
                }
            }
            c = (double)a / b;
            System.out.printf("%d/%d\t\t%.5f\n", a, b ,c);
        }
    }
}
