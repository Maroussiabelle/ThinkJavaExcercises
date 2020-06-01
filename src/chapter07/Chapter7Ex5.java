package chapter07;

public class Chapter7Ex5 {

    public static void main(String[] args) {
//        System.out.println(Math.exp(-100));
//        System.out.println(myExp(-100));
//        System.out.println();
        System.out.println(Math.exp(3));
        System.out.println(myExp(-50));

        System.out.println("\n");


        for (double i = 0.1; i <= 100; i *= 10) {
            check(i);
        }

        System.out.println("\n");

        for (double i = -0.1; i >= -100; i *= 10) {
            check(i);
        }
    }


    // x3 = 1 + x + x2/2! + x3/3!
    // x4 = 1 + x + x2/2! x3/3! + x4/4!
    // x5 = 1 + x + x2/2! + x3/3! + x4/4! + x5/5!
    // xn = 1 + x + x2/2! .... + xn/n!

//        double x2 = 1 + x + x * x / 2 * 1;
//        double x3 = 1 + x + x * x / 2 * 1 + x * x * x / 3 * 2 * 1;
//        double x4 = 1 + x + x * x / 2 * 1 + x * x * x / 3 * 2 * 1 + x * x * x * x / 4 * 3 * 2 * 1;
//        double x5 = 1 + x + x * x / 2 * 1 + x * x * x / 3 * 2 * 1 + x * x * x * x / 4 * 3 * 2 * 1 + x * x * x * x * x / 5 * 4 * 3 * 2 * 1;


    public static double myExp(double x) {// n =10, i =5 (na 5 iteracii);
        double result = 1;
        double factorialCurrent = 1; // izbavljaemsja ot metoda factorial
        double power = 1; // izbavljaemsja ot metoda power
        for (double i = 1; i <= 150; i++) {
            factorialCurrent = factorialCurrent * i;
            power = power * x;
            result = result + power / factorialCurrent;

//            System.out.println ("x" + i +"/" +i + "! = " + (power(x, i) / factorial(i)));

        }
        return result;
    }

//
//    public static double power(double x, double n) {
//        double result = 1;
//
//        while (n != 0) {
//            result = result * x;
//            n--;
//        }
//        return result;
//    }
//
//
//    public static double factorial(double n) {
//        for (double i = n - 1; i > 1; i--) {
//            n *= i;
//        }
//        return n;
//    }

    public static void check(double x) {
        System.out.println(x + "\n" + myExp(x) + "\n" + Math.exp(x));
    }
}

