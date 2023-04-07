package Ass2;
/*
* Create a Java method
static int min(int[] arrayOfInts)
(in a class Prog6) that outputs the minimum of an array of ints.
Example: For the given array of int inputs, method return the result of minimum -22
[2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22]
NOTE: You may not use the sorting tools available in the Java libraries; for instance, you may not call
Arrays.sort() to sort the input array. (No credit if you do it this way.)
* */
public class Prog6 {
    public static void main(String[] args) {
        int[] arr1={2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
         int min=arr1[0];
        for (int i=0;i<arr1.length;i++){

            if (arr1[i] <min){
                min=arr1[i];
            }
        }
        System.out.println(min);;
    }
}
