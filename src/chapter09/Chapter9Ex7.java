package chapter09;
import java.util.Arrays;

public class Chapter9Ex7 {

    public static void main(String[] args) {
        String str1 = "stop";
        String str2 = "pottttss";
        isAnagram(str1, str2);
    }

    private static void isAnagram(String str1, String str2) {
        if (str1.length()==str2.length()) {
            char[] arr1 = str1.toCharArray();
            Arrays.sort(arr1);
            String string1 = Arrays.toString(arr1);
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr2);
            String string2 = Arrays.toString(arr2);
            System.out.println(string1.equals(string2));
            if(string1.equals(string2)) {
                System.out.println("Given strings are anagrams");
            } else {
                System.out.println("Given strings are not anagrams");
            }
        }
        else{
            System.out.println("Given strings are not anagrams.");
        }
    }
}


