public class StringManipulation {
    public static void main(String[] args){
        String inputString = "Hello World";
        String reversedString = reverseString(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);

        String uppercaseString = convertToUppercase(inputString);
        System.out.println("Uppercase String: " + uppercaseString);
    }

    public static String reverseString(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public static String convertToUppercase(String input){
        return input.toUpperCase();
    }
}
