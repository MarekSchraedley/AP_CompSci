package Q2.Prog214c;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog214c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/Prog214c.dat"));

            while (input.hasNext()) {
                String type = input.next();
                double gallons = input.nextDouble();
                String carwash = input.next();
                Cl214c wowsa = new Cl214c(gallons, type, carwash);
                wowsa.calc();
                System.out.println(wowsa.toString());
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
