package chapter06;

import static java.lang.Math.PI;

public class Chapter6Ex4Multadd {

    public static void main(String[] args) {
        System.out.println(multadd(1.0, 2.0, 3.0));
        System.out.println(multadd(Math.sin(PI / 4), 0.5, Math.cos(PI / 4)));
        System.out.println(multadd(Math.log(10), 1, Math.log(20)));
        System.out.println(expSum(2.0));
    }

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt((1 - Math.exp(-x))));

    }
}
