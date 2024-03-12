package Q3.Prog702p;

public class Hicca extends Animal {
    double myFurValue = 0.0;
    public Hicca(String name, String word, double value) {
        super(name, word);
        myFurValue = value;
    }

    public double getFurValue() {return myFurValue;}
}
