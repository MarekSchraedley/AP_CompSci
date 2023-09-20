public class prog122a {
    public static void main(String[] args) {
        int num = 0; //Loop Control Variable
        System.out.println("Number  Square  Square Root");
        while (num < 50) {
            num += 1;
            System.out.println(num + "         " + Math.pow(num, 2) + "        " + Math.sqrt(num));
        }
    }
}
