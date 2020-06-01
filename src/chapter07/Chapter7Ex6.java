package chapter07;

public class Chapter7Ex6 {

    public static void main(String[] args) {
        System.out.println(gauss(2, 5));
    }

    public static double gauss(double x, double n) {
        double koef;
        double factorial = 1;
        double result = 1;

        for (double i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                koef = 1;
            } else {
                koef = -1;
            }
            System.out.println(koef);

            factorial = factorial * i;
            System.out.println(factorial);

            double result1 = 1;
            for (double j = 1; j <= 2 * i; j++) {
                result1 = result1 * x;

            }
            System.out.println(result1);
            System.out.println("\n");

            result = result + koef * result1 / factorial;

        }


        return result;
    }
}
