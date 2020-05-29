package chapter07;

public class Chapter7Ex2 {

    /*As your initial guess, you should use a/2.
     Your method should iterate until it gets two
consecutive estimates that differ by less than 0.0001.
 You can use Math.abs to calculate the absolute value of the difference.*/

    public static void main(String[] args) //throws InterruptedException {
    {
        System.out.println(squareRoot(16.00));
        System.out.println(squareRoot2(16.00));
        System.out.println(squareRoot3(16.00));
    }

    public static double squareRoot(double a) {
        double xCurrent = a / 2;
        double xNext = (xCurrent + a / xCurrent) / 2;
//        if (Math.abs(xNext - xCurrent) <= 0.0001) {
//            return xNext;
//        }
//        double x2 = (xNext + a / xNext) / 2;
//        if (Math.abs(x2 - xNext) <= 0.0001) {
//            return x2;
//        }
//        double x3 = (x2 + a / x2) / 2;
//        if (Math.abs(x3 - x2) <= 0.0001) {
//            return x3;
//        }

        do {
            xCurrent = xNext;
            xNext = (xNext + a / xNext) / 2;

        } while (Math.abs(xNext - xCurrent) >= 0.0001);

        return xNext;
    }

    public static double squareRoot2(double a) {
        double xCurrent = a / 2;
        double xNext = (xCurrent + a / xCurrent) / 2;

        while (Math.abs(xNext - xCurrent) >= 0.0001) {
            xCurrent = xNext;
            xNext = (xCurrent + a / xCurrent) / 2;
        }
        return xNext;

    }

    public static double squareRoot3(double a) {
        double xCurrent = a / 2;
        double xNext = (xCurrent + a / xCurrent) / 2;

        for (; Math.abs(xNext - xCurrent) >= 0.0001; ) {
            xCurrent = xNext;
            xNext = (xCurrent + a / xCurrent) / 2;
        }
        return xNext;

    }

}

