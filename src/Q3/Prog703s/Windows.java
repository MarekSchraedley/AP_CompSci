package Q3.Prog703s;

public class Windows extends Computer {
    private Double myVersion;
    public Windows(String name, int num, Double val, Double version) {
        super(name, num, val);
        myVersion = version;
    }

    public Double getVersion() {
        return myVersion;
    }
}
