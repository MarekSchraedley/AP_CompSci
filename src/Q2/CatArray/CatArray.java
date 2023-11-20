package Q2.CatArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CatArray {
    public static void printCat(Cat cat) {
        System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
    }
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = input.nextInt();
            Cat[] cats = new Cat[50];
            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats[lcv] = new Cat(name, weight, age, cost);

            }
            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (int lcv = 0; lcv < numCats; lcv++) {
                printCat(cats[lcv]);
            }

            System.out.println("\n2. The third cat is named: " + cats[2].getName());

            cats[numCats-1].setWeight(cats[numCats-1].getWeight() + 10);
            System.out.println("3. The updated weight is: " + cats[numCats-1].getWeight());

            int rascalIndex = 0;
            for (int lcv = 0; lcv < numCats; lcv++) {
                if (cats[lcv].getName().equals("Rascal"));
                rascalIndex = lcv;

            }
            for (int lcv = 0; lcv < numCats -1; lcv++) {
                cats[lcv] = cats[lcv+1];
            }
           numCats--;


            for (int lcv = numCats; lcv > 1; lcv--)
                cats[lcv] = cats[lcv-1];
            cats[1] = new Cat("Angel", 3.6, 1, 25.99);
            numCats++;

            cats[numCats] = new Cat("Gimpy", 14.3, 10, 29.99);
            numCats++;

            System.out.println("\n7. the updated list is: ");
            System.out.println("Name\nWeight\nAge\nCost");
            for (Cat cat : cats) {
                if (cat != null) printCat(cat);
            }

            Cat temp = cats[2];
            cats[2] = new Cat("Sugar", 23.6, 7, 33.25);
            cats[numCats] = temp;
            numCats++;

            Cat tempCat = cats[1];
            cats[1] = cats[3];
            cats[3] = tempCat;



        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
