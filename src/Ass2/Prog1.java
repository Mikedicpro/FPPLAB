package Ass2;

import ass1.RandomNumbers;
/*
* Problem – 1
Create a class called Prog1. In the main method of the class, output to the console the result
of doing the following two computations:
1. get a random number x in the range 1 .. 9 and compute πx.
2. get a random number y in the range 3 .. 14 and compute yπ.
Use the RandomNumbers.java class that has been provided for you as an attachment. (Do not
use the Random class directly.) Use Math API to solve πx
and yπ.

* */
public class Prog1 {
    public static void main(String[] args) {
        int randNus = RandomNumbers.getRandomInt(1, 9);
        System.out.println("The random no generated between 1 and 9 is = "+randNus);
        int x=randNus;
        //double pix=Math.PI*x;// double pix=Math
        double pix=Math.PI;
        double calPI=Math.pow(pix,x);
        System.out.println(" Pi to the power of x is = "+calPI);

        int randNus2 = RandomNumbers.getRandomInt(3, 14);
        System.out.println("The random no generated between 3 and 14 is  = "+randNus2);
        int y=randNus2;
        //double ypi=Math.PI;
        System.out.println(" y to the power of PI is = "+Math.pow(y,pix));
        System.out.println(" The unicode for pi is  = "+"\u03C0");
    }
}
