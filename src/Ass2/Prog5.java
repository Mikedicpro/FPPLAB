package Ass2;

import java.util.Arrays;

/*
Problem -5. Create a class Prog5 and implement the given method which takes the two arrays of inputs
and combine the two arrays into single array.
public int[] combine(int[] a, int[] b);
Example:    Input array a : [5,6,-4,3,1]
            Input array b: [ 3,8,9,11]
            Output arrays: [ 5,6,-4,3,1, 3,8,9,11]
* */
public class Prog5 {

    public static void main(String[] args) {
        int[] arr1={5,6,-4,3,1};
        int[] arr2={3,8,9,11};
        int[] sumArr=new int[arr1.length+arr2.length];
         System.arraycopy(arr1,0,sumArr,0, arr1.length);
        System.arraycopy(arr2,0,sumArr,arr1.length, arr2.length);
        System.out.println(Arrays.toString(sumArr));
    }
}
