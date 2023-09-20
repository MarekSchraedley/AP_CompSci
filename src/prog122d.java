public class prog122d {
    public static void main(String[] args) {
        int x = -12; //Loop Control Variable
        System.out.println("Hours    Pay");
        while (x <= 16) {
            System.out.println(x + "         " + (Math.pow(x, 6) -3 *Math.pow(x, 5) -93 * Math.pow(x, 4) + 87*Math.pow(x, 3) + 1596*Math.pow(x, 2) -1380*x -2800));
            x += 1;
        }
    }
}
