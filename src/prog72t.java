import java.util.*;

public class prog72t {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Time 1: ");
        int a = keyboard.nextInt();
        System.out.print("Enter Time 2: ");
        int b = keyboard.nextInt();
        int count = 0;
        int iterate = a;
        while (iterate != b) {
            if (iterate % 100 == 59) { //
              System.out.println(iterate);
              if (iterate == 2359) {
                iterate = 0;
              } else {
                iterate -= 59;
                iterate += 100;
              }
            }else{
            iterate += 1;
            
            }
            if (count % 100 == 59) { //
                System.out.println(count);
                count -= 59;
                count += 100;
            }else{
            count += 1;
            }
        }

        System.out.println(count);
    }
}
