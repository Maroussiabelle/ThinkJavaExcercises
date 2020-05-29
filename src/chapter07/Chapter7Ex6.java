package chapter07;

public class Chapter7Ex6 {

    public static void main(String[] args) {
        System.out.println(gauss(1, 2));
    }

    public static double gauss(double x, int n) {
        double result = 1;
        double power;

        int factorialCurrent = 1;

        for (int i = 1; i <= n; i++) {

            factorialCurrent = factorialCurrent * i;

            if (i % 2 == 0) {
                power = 1;
            } else {
                power = -1;
            }

            result = result + power * x / factorialCurrent;

        }
        return result;
    }
}


//    public static void check(double x, int n) {
//        System.out.println(x + "\t" + gauss(x, n));
//    }


