
// create a function that reverse a string:

public class reverseString {
    private String reverse (String str) {
        //check input
        if(str==null || str.length()<2) {
            return str;
        }

        String reversedStr = "";

        for(int i=str.length()-1; i>=0; i--) {
            reversedStr += str.charAt(i);
        }

        return reversedStr;
    }

    private String reverse2 (String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main (String[] args) {
        String str = "Hello World!";
        reverseString reverseString = new reverseString();
        System.out.println(reverseString.reverse(str));
        System.out.println(reverseString.reverse2(str));
    }
}
