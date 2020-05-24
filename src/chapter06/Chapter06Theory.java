package chapter06;

public class Chapter06Theory {

    public static void main (String[]args){
        countup(3);
    }
    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }
}
