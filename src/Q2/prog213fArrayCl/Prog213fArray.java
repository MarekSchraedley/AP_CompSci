package Q2.prog213fArrayCl;

import Prog213f.Cl213f;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213fArray {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213f.dat"));
            CL213f[] list = new CL213f[1000];
            int cnt = 0;

            while (input.hasNext()) {
                int kwh = input.nextInt();
                if (kwh != -999) {
                    CL213f yikes = new CL213f(kwh);
                    list[cnt] = yikes;
                    cnt++;
                }
            }
            for (int lcv = 0; lcv < cnt; lcv++)
                list[lcv].calc();

            for (int lcv = 0; lcv < cnt; lcv++)
                System.out.println(list[lcv]);

        } catch (IOException e) {
            System.out.println("cant find data file!");
        }
    }
}
