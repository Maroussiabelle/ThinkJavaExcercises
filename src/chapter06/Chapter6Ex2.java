package chapter06;

public class Chapter6Ex2 {

    public static void main(String[] args) {
//        System.out.println(isDivisible(8, 2));
        if (isDivisible(8, 2)) {
            System.out.println("is divisible");
        } else {
            System.out.println("is not divisible");
        }

        System.out.println("Is " +(isDivisible(8, 2) ? "" : "not ") + "divisible");

        System.out.println(isDivisible(8, 2) ? "Is divisible" : "Is not divisible");
    }

    public static boolean isDivisible(int n, int m) {
        return n % m == 0;
//        if (n % m == 0) {
//            System.out.println("is divisible");
//            return true;
//        } else {
//            System.out.println("is not divisible");
//            return false;
//        }
    }
}

