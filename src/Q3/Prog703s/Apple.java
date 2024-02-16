package Q3.Prog703s;

public class Apple extends Computer {

    private String myColor;
     public Apple(String name, int num, Double val, String color) {
         super(name, num, val);
         myColor = color;
     }

     public String getColor() {
         return myColor;
     }
}
