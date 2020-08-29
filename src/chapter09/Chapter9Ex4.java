package chapter09;
/*

1. Write some code in main that tests each of these methods. Make sure they work,
and you understand what they do.

2. Using these methods, and without using any other String methods, write a
method called printString that takes a string as a parameter and that displays
the letters of the string, one on each line. It should be a void method.

3. Again using only these methods, write a method called printBackward that does
the same thing as printString but that displays the string backward (again, one
character per line).

*/

public class Chapter9Ex4 {


    public static void main(String[] args) {
        String a = "I am not a robot";
        String b = "coffee";
        String d = "a";
        String e = "aa";
        String f = "abba";
//        printLine2(a);
//        System.out.println();
//        printBackward(a);
//        System.out.println();
//        System.out.println(reverse(b));
//        System.out.println();
//        System.out.println(isPalindrome("abcddcba"));
        System.out.println(isPalindrome("abca"));

    }

    public static boolean isPalindrome(String a) {
        if (a.length() == 0 || a.length() == 1) {
            return true;
        }
        if (a.charAt(0) != a.charAt(a.length() - 1)) {
            return false;
        }
        return isPalindrome(a.substring(1, a.length() - 1));
    }

    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

    public static void printLine(String s) {
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            System.out.println(letter);
        }

    }

    public static void printLine2(String s) {

        if (s.length() == 1) {
            System.out.println(first(s));
        } else {
            System.out.println(first(s));
            printLine2(rest(s));
        }

    }

    public static void printBackward(String s) {

        if (s.length() == 1) {
            System.out.println(first(s));
        } else {
            String r = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                r = r + "\n" + s.charAt(i);
            }
            System.out.println(r);
        }

    }

    public static String reverse(String s) {
        String reversed = "";

        if (s.length() == 1) {
            System.out.println(first(s));
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                reversed = reversed + s.charAt(i);
            }
        }
        return reversed;

    }


}
