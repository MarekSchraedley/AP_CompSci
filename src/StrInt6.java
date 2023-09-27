import java.util.*;

public class StrInt6 {
    public static void main(String[] args) {
        Scanner cool = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mytext = cool.nextLine().toLowerCase().trim();
        int count = 0;
        int count2 =0;
        String str = "";
        while (count != mytext.length());
            if (str.length() == 0) {
                str += mytext.substring(count, count+1);
            }else{
            while (count2 != str.length()); //iterate through every thing in str before confirming

                count2++;
            count++;
        }
    }
}
