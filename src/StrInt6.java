import java.util.*;

public class StrInt6 {
    public static void main(String[] args) {
        Scanner cool = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mytext = cool.nextLine().toLowerCase().trim();
        int count = 0;
        int count2 =0;
        int check = 0;
        int letters = 0;
        String str = "";
        while (count != mytext.length()) {
            check = 0;
            count = 0;
            if (str.length() == 0) {
                str += mytext.substring(count, count+1);
            }else {
                while (count2 != str.length()) {
                    if (!mytext.substring(count, count + 1).equals(str.substring(count, count + 1)))
                        check += 1;
                    count2++;
                }
                if (check == count2)
                    letters += 1;//finish this up
            }
            count++;
        }
        System.out.print("letters:" + letters);
    }
}
