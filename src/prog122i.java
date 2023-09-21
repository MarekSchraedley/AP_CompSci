public class prog122i {
    public static void main(String[] args) {
        int num = -25; //Loop Control Variable
        System.out.println("Number  Square Root  Cube");
        while (num <= 25) {
            if (num > 0) {
                System.out.println(num + "     " + (Math.cbrt(num * -1) * -1) + "       " + Math.pow(num, 3)); //Finish this up
                num += 1;
            }
            else {
                System.out.println(num + "     " + Math.cbrt(num) + "       " + Math.pow(num, 3));
                num += 1;
            }
        }
    }
}
