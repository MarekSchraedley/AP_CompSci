public class prog122h {
    public static void main(String[] args) {
        int num = 1; //Loop Control Variable
        System.out.println("Number  Square  Square Root  Cube  4th Root");
        while (num <= 20) {
            System.out.println(num + "     " + Math.pow(num, 2) + "       " + Math.sqrt(num) + "     " + Math.pow(num, 3) + "     " + Math.pow(num, 0.25));
            num += 1;
        }
    }
}
