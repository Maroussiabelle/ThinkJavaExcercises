package chapter05;

public class Chapter5Ex5 {
    public static void main(String[] args) {
        song(9);
    }

    public static void song(int n) {
        if (n == 0) {
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around,\n" +
                    "’cause there are no more bottles of beer on the wall!");
            return;
        }
        System.out.println(n + " bottles of beer on the wall,\n" +
                n + " bottles of beer,\n" +
                "ya’ take one down, ya’ pass it around,\n" +
                (n - 1) + " bottles of beer on the wall. \n \n");
        song(n - 1);

    }

}