package Q3;


public class Prog152a {

    public static int SumOfSeries(int n, int sum) {
        if (n <= 9669) {
            return SumOfSeries(n+3, sum+n);
        } else {
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(SumOfSeries(3, 0));
    }
}
