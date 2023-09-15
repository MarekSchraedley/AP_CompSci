import java.util.*;

public class prog72t {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Time 1: ");
        int a = keyboard.nextInt();
        System.out.print("Enter Time 2: ");
        int b = keyboard.nextInt();
        int add100 = 0;
        int count = 0;
        int iterate = a;
        while (iterate != b) {
            if (iterate % 100 == 59) { //
              System.out.println(iterate);
              if (iterate == 2359) {
                  add100 = 1;
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
        if (add100 == 1) {
            count += 100;
        }

        System.out.println("Hours " + Math.floor(count/100) + "  Minutes " + (count % 100));
    }
}
