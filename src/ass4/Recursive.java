package ass4;

public class Recursive {
    /*
    * Solve the following problems using recursion and draw the runtime stack representation of that
code.
1. Write a method to display the digits of a given integer value n in reverse order.
2. Write a method to count the number of digits in an integer value n. Assume that n is
nonnegative and represented in base ten.
3. Write a method to compute the sum of all elements of the array arr, of size n.
    * */
//1
    public static void reverseDigits(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            reverseDigits(n / 10);
        }
    }
    /* The runtime memory stack...
    * countDigits(1234)
    countDigits(123)
        countDigits(12)
            countDigits(1)
                return 1
            return 2
        return 3
    return 4
    * */
    //2
    public static int countDigits(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + countDigits(n / 10);
        }
        /* The run time memory stack
        * countDigits(1234)
    countDigits(123)
        countDigits(12)
            countDigits(1)
                return 1
            return 2
        return 3
    return 4
        * */
    }
    //3
    public static int sumArray(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            return arr[n-1] + sumArray(arr, n-1);
        }
    }
    /*
    * sumArray([1, 2, 3, 4], 4)
    sumArray([1, 2, 3], 3)
        sumArray([1, 2], 2)
            sumArray([1], 1)
                return 1
            return 1 + 2
        return 1 + 2 + 3
    return 1 + 2 + 3 + 4
    * */
}
