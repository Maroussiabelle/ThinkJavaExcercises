package chapter09;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Chapter9Ex71 {

    public static void main(String[] args) {
        String str1 = "stop";
        String str2 = "pota";
        if (str1.length()==str2.length()) {
            char[] arr1 = str1.toCharArray();
            Arrays.sort(arr1);
            System.out.println(Arrays.toString(arr1));
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr2);
            System.out.println(Arrays.toString(arr2));
            System.out.println(arr1.equals(arr2));
            if(arr1.equals(arr2)) {
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


