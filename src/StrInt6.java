import java.util.*;

public class StrInt6 {
    public static void main(String[] args) {
        Scanner cool = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mytext = cool.nextLine().toLowerCase().trim();
        int count = 0;
        while (mytext.length() != 0) {
            mytext = mytext.replace(mytext.substring(0, 1), "");
            count++;

        }
        System.out.print(count);
    }
}
