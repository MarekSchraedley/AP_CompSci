package Q3.Prog703s;

public class Computer implements comps {
    String myName = "";
    int myNumber = 0;
    int myVal = 0;

    public Computer(String name, int number, int val) {
        myName = name;
        myNumber = number;
        myVal = val;
    }


    public String getName() {return myName;}
    public int getNumber() {return myNumber;}
    public int getValue() {return myVal;}
}
