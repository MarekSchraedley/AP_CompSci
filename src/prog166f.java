public class prog166f {
    public static void main(String[] args) {
        int num = 100; //Loop Control Variable
        int num2 = 1;
        int count = 0;
        while (num <= 110) {
            count = 0;
            num2 = 1;
            while (num2 <= num) { //finish this up
                count += num2;
                num2 += 1;
            }
            System.out.println("The sum of the numbers from 1 to " + num + " is " + count); //finish
            num += 1;
        }
    }
}
