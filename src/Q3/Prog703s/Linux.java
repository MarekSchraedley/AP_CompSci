package Q3.Prog703s;

public class Linux extends Computer {
    private int myCode;
    public Linux(String name, int num, int val, int code) {
        super(name, num, val);
        myCode = code;
    }

    public int getCode() {
        return myCode;
    }
}
