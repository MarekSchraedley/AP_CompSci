package Q2.Prog214bcl;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog214b.dat"));
            while (input.hasNext()) {
                double ID = input.nextDouble();
                double ytd = input.nextDouble();
                double bp = input.nextDouble();
                double decshift = input.nextDouble();
                double hours = input.nextDouble();
                Cl214b wowsa = new Cl214b(ID, ytd, bp, decshift, hours);
                wowsa.calc();
                System.out.println(wowsa.toString());
            }

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
