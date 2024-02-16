package Q3.Prog703s;

import Q3.Prog701g.Person;
import Q3.Prog701g.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog703s.txt"));
            List<Computer> list = new ArrayList<Computer>();
            int type = 0;
            String name = "";
            int num = 0;
            double val = 0;
            while (input.hasNext()) {
                type = input.nextInt();
                name = input.next();
                num = input.nextInt();
                val = input.nextDouble();
                if (type == 1) {
                    String color = input.next();
                    Computer c = new Apple(name, num, val, color);
                    list.add(c);
                }
                else if (type == 2) {
                    Double ver = input.nextDouble();
                    Computer c = new Windows(name, num, val, ver);
                    list.add(c);
                }
                else if (type == 3) {
                    int code = input.nextInt();
                    Computer c = new Linux(name, num, val, code);
                    list.add(c);
                }
            }
            int greengold = 0;
            int ver70 = 0;
            int end5 = 0;
            for (Computer thing : list) {
                if (thing instanceof Apple) {
                    if (((Apple) thing).getColor().equals("Green") || ((Apple) thing).getColor().equals("Gold")){
                        greengold += 1;
                    }
                }
                if (thing instanceof Windows) {
                    if (((Windows) thing).getVersion() == 7.0) {
                        ver70 += 1;
                    }
                }
                if (thing instanceof Linux) {
                    if (((Linux) thing).getCode()%10 == 5) {
                        end5 += 1;
                    }
                }
            }
            System.out.println("Amount of green/gold Apple computers: " + greengold);
            System.out.println("Amount of Windows computers in version 7.0: " + ver70);
            System.out.println("Amount of Linux codes that end in 5: " + end5);
        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
