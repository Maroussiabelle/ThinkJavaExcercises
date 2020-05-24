package chapter06;/* a recursive method called power that takes a double x and an integer n and
returns x n.
A recursive definition of this operation is x n = x · x n − 1 .
when n is even, using x n = x n/2)2 .*/

public class Chapter6Ex9 {
    public static void main(String[] args) {
        System.out.println(power(3, 3));

    }

    public static double power(double x, int n) {
        if (x == 1 || n == 0) {
            return 1;
        } else if (n % 2 == 0 && n != 2) {
            return power(power(x, n / 2), 2);
        } else {
            return x * power(x, n - 1);
        }
    }

}
