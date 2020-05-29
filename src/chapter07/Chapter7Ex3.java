package chapter07;

public class Chapter7Ex3 {


    public static void main(String[] args) {
        System.out.println(power(3, 3));
        System.out.println(power2(2, 2));

    }

    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        double result = 1;

        while (exponent != 0) {
            result = result * base;
            exponent--;
        }
        return result;
    }

    public static double power2(double base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        double result = 1;

        for (; exponent != 0; exponent--) {
            result = result * base;
        }
        return result;
    }
}
