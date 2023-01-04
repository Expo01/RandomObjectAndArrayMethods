
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10); //array set to randomized value from method
        Arrays.sort(firstArray); //Array.sort method orders numerically lowest to highest
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10]; // all indexes default to 0
        Arrays.fill(secondArray, 5); //.fill method assigns all values to '5'
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10); //generate array 3
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length); //copy array 3: full length
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray)); // 4h array will show sorted, but not 3rd. when .copyOf used
        // new array object formed

        int[] largerArray = Arrays.copyOf(thirdArray, 15); //all excess indexes defaulted to 0.
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) { //array sorted for binary search of 'key' value "Mark"
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 0};

        if (Arrays.equals(s1, s2)) { // internal boolean. only is true if length, elements and order are equal
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random(); //Random is class that returns random numbers
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100); //random.nextInt returns a random int value
        }

        return newInt;
        //returns any number from 0 to max int value. 'bound' (exclusive upper bound) limits the return. bound value exclusive
    }
}
