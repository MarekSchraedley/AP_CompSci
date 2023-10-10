import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Dfile {
    //Copy this
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/"));

            while (input.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
    //To this
}
