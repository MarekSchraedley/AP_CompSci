package Q2;

public class BigArray {
    public static void main(String[] args) {
        int [] array = new int[19];

        for (int lcv = 0; lcv < 19; lcv++) {
            array[lcv] = (int) (Math.random() * (91-20) + 20);
        }
        for (int lcv =0; lcv < array.length; lcv++) {
            System.out.print(array[lcv] + " ");
        }
        System.out.println();

        for (int temp : array) {
            System.out.print(temp + " ");
        }
        System.out.println();

        System.out.println("The middle number is " + array[array.length / 2]);

        double avg = array[0] + array[array.length-1] + array[array.length / 2];
        System.out.println("Average of the first, middle, and last numbers is " + (avg/3));
        int smallest = array[0];
        int largest = array[0];
        for (int num : array) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);

        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] == smallest)
                array[lcv] = largest;
            if (array[lcv] == largest)
                array[lcv] = smallest;
        }

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        int randNum = (int)(Math.random() * 10 + 1);
        array[array.length/2] = randNum;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        for (int lcv = 0; lcv < array.length; lcv++)
            array[lcv] += 10;

        for (int x : array) System.out.print(x + " ");
        System.out.println();

        int myThird = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted is " + myThird);

        for (int num : array) {
            if (num > 50 && num <= 59)
                System.out.print(num + " ");
        }
        System.out.println();

        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] % 4 == 0)
                System.out.print(array[lcv] + " ");
        }
        System.out.println();
        boolean sixty = false;
        for (int temp : array) {
            if (temp == 60) sixty = true;
        }
        System.out.println("Is 60 in the list? " + sixty);

        boolean same = true;
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] != array[array.length-1-lcv])
                same = false;
        }
        System.out.println("Is the array palindromic? " + same);

        double average = 0;
        for (int x : array)
            average += x;
        average /= array.length;

        int count = 0;
        for ( int x : array)
            if (x>average) count++;
        System.out.printf("There are %d numbers greater than the average\n", count);

        int evens = 0;
        for (int num : array)
            if (num % 2 == 0) evens++;
        System.out.printf("There are %d even numbers\n", evens);

        int[] array2 = new int[array.length];
        for (int lcv = 0; lcv < array.length; lcv++)
            array2[lcv] = array[array.length - 1 - lcv];

        for (int n : array2)
            System.out.print(n + " ");
        System.out.println();

        int[] shiftArr = circularShiftRight(array);
        for (int n : shiftArr)
            System.out.print(n + " ");
        System.out.println();

        int sum = 0;
        for (int num : array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0) {
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        System.out.println("Sum of all digits of all elements = " + sum);
    }
    public static int[] circularShiftRight(int[] array) {
        int temp = array[array.length-1];
        int[] shifted = new int[array.length];
        for (int lcv = 1; lcv < array.length; lcv++)
            shifted[lcv] = array[lcv-1];
        shifted[0] = temp;
        return shifted;
    }
}
