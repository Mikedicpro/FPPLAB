package Ass2;
/*
Problem-4.
 Create a class Prog4. Inside its main method, create float variables to store each of the
following numbers:
1.27, 3.881, 9.6
Output to the console the following two values:
1. the sum of the floats as an integer, obtained by casting the sum to type int
2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer,
using the Math.round function
* */
public class Prog4 {
    public static void main(String[] args) {
        float num1=1.27f;
        float num2=3.881f;
        float num3=9.6f;

        int sum1=(int) (num1+num2+num3);
        int sum2=Math.round(num1+num2+num3);

        System.out.println("The Sum as int (cast): boxing "+sum1);
        System.out.println("The Sum as int (round)  " + sum2);
        float actualSum=num1+num2+num3;
        System.out.println("The actual sum using calculator " +actualSum);
    }
}
