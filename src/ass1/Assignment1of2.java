package ass1;

public class Assignment1of2 {


    public static void main(String[] args) {
        long randNums = RandomNumbers.getRandomInt(0, 2_000_000_000);
        System.out.println(randNums);

        if (randNums >= Byte.MIN_VALUE && randNums <= Byte.MAX_VALUE) {
            System.out.println(randNums);
            System.out.println("Byte");
        } else if (randNums >= Short.MIN_VALUE && randNums <= Short.MAX_VALUE){
            System.out.println(randNums);
            System.out.println("Short");

    }
           else if(randNums>=Integer.MIN_VALUE && randNums<=Integer.MAX_VALUE){
            System.out.println(randNums);
            System.out.println("integer");
        }
           else {
            System.out.println("Long");
            System.out.println(randNums);
        }
    }

}

