package Q3.Prog702p;

public class Wallie extends Animal {
    int mySteps = 0;
    public Wallie(String name, String word, int steps) {
        super(name, word);
        mySteps = steps;
    }

    public int getSteps() {return mySteps;}
}
