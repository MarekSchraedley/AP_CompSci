public class prog122c {
    public static void main(String[] args) {
        int num = 2; //Loop Control Variable
        while (num <= 10) {
            System.out.println(num + "     " + (num+1) + "     " + num*2 + "     " + Math.pow(num, 2));
            num += 2;
        }
    }
}
