package Q2.ArrayListLab;

public class IntArrayList {
    private int[] myArray;
    private int mySize;
    private int myCapacity;
    private final int DEFAULT_SIZE = 16;

    public IntArrayList() {
        myArray = new int[DEFAULT_SIZE];
        mySize = 0;
        myCapacity = DEFAULT_SIZE;
    }

    private void doubleCapacity() {
        myCapacity = myCapacity * 2;
        int[] tempArray = new int[myCapacity];
        for (int lcv = 0; lcv < mySize; lcv++) {
            tempArray[lcv] = myArray[lcv];

        }
        myArray = tempArray;
    }

    private void halfCapacity() {
        myCapacity = myCapacity / 2;
        int[] tempArray = new int[myCapacity];
        for (int lcv = 0; lcv < mySize; lcv++) {
            tempArray[lcv] = myArray[lcv];

        }
        myArray = tempArray;
    }

    public void add(int num) {
        if (mySize+1==myCapacity) {}
    }


}