package chapter09;

import java.util.Arrays;

public class Chapter9Ex2 {

    public static void main(String[] args) {
        String words = "абвгдейкаяъьйё";

        System.out.println(Arrays.toString(letterHist(words)));

    }

    public static int[] letterHist(String word) {

        int[] alphabet = new int[34];
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char letter = charArray[i];
            int index = letter;
            alphabet[index -1072]++;
        }
        return alphabet;

    }

}