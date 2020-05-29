package chapter03;

import java.util.Scanner; //convert temperature

public class Chapter3Ex2 {
       /**
     * Converts a temperature from Celsius to Fahrenheit.
     */

        public static void main(String[] args) {

            // For example, it should display "24.0 C = 75.2 F" .
            double celsius, farenheit;
            Scanner in = new Scanner(System.in);

            // prompt the user and get the value
            System.out.print("What is the temperature in Celsius now? ");
            celsius = in.nextDouble();
            // convert and output the result
            final double CONSTANT = 1.8; // a constant taken from Celsius-Farenheit formula , 9/5;
            final double CONSTANT2 = 32.0;// a constant taken from Celsius-Farenheit formula, 32;
            farenheit = celsius * CONSTANT + CONSTANT2;
            System.out.printf("%.1f C = %.1f F \n", celsius, farenheit);

        }

    }


