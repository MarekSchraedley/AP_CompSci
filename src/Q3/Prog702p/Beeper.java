package Q3.Prog702p;

public class Beeper extends Animal {
    String myExtraWord = "";
    public Beeper(String name, String word, String extraWord) {
        super(name, word);
        myExtraWord = extraWord;
    }

    public String getExtraWord() {return myExtraWord;}
}
