public class Assignment1 {
    public static void main(String[] args) {
        String name="Hi   \uD83D\uDC4B "+"My name is "+ "\" \u121A\u12AB\u12A4\u120D\"";
        int length=name.length();
        System.out.println(length);// 26 My name is composed of 4 Unicode characters and the Emoji character has 2 Unicode and the length function return total 26 characters
        System.out.println("Hi   \uD83D\uDC4B "+"My name is "+ "\" \u121A\u12AB\u12A4\u120D\"");

    }
}
