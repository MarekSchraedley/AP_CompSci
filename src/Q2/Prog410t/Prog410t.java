package Q2.Prog410t;

import Q2.Prog214bcl.Cl214b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/survey.dat"));
            System.out.println("id\tincome\tmembers");
            int ID = 0;
            double Income = 0;
            int Members = 0;
            int totalIncome = 0;
            int participants = 0;
            while (input.hasNext()) {
                ID = input.nextInt();
                Income = input.nextInt();
                Members = input.nextInt();
                Cl410t wowsa = new Cl410t(ID, Income, Members);
                System.out.println(wowsa.toString());
                totalIncome += Income;
                participants++;
            }
            input = new Scanner(new File("Langdat/survey2.dat"));
            while (input.hasNext()) {
                ID = input.nextInt();
                Income = input.nextInt();
                Members = input.nextInt();
                Cl410t wowsa = new Cl410t(ID, Income, Members);
                System.out.println(wowsa.toString());
                totalIncome += Income;
                participants++;
            }
            input = new Scanner(new File("Langdat/survey.dat"));
            System.out.println("Households exceeding the an average income of $" + (totalIncome/participants));
            System.out.println("id\tincome\tmembers");

            while (input.hasNext()) {
                ID = input.nextInt();
                Income = input.nextInt();
                Members = input.nextInt();
                if (Income > (totalIncome/participants)) {
                    Cl410t wowsa = new Cl410t(ID, Income, Members);
                    System.out.println(wowsa.toString());
                }

            }
            input = new Scanner(new File("Langdat/survey2.dat"));
            while (input.hasNext()) {
                ID = input.nextInt();
                Income = input.nextInt();
                Members = input.nextInt();
                if (Income > (totalIncome/participants)) {
                    Cl410t wowsa = new Cl410t(ID, Income, Members);
                    System.out.println(wowsa.toString());
                }//print percentage of households below poverty level

            }
        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
