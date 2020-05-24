package chapter06;

public class Chapter6Ex6 {
    public static void main(String[] args) {
        System.out.println(prod(1, 4));
    }

    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            return 48;
        }
    }

//    public static int prod(int m, int n) {
//        if (m == n) {
//            return n;
//        } else {
//            return n * prod(m, n - 1);
//        }
//    }


}
