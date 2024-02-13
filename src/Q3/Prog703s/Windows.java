package Q3.Prog703s;

public class Windows extends Computer {
    private Double myVersion;
    public Windows(String name, int num, int val, Double version) {
        super(name, num, val);
        myVersion = version;
    }

    public Double getColor() {
        return myVersion;
    }
}
