package chapter05;

public class Chapter5Ex3 {
    public static void main(String[] args) {
        nLines(4);
    }

    public static void nLines(int n) {
        if (n > 0) {
            System.out.println();
            nLines(n - 1);
        }
    }
}
