package chapter03;

import java.util.Scanner;

public class Chapter3Ex3 {
    public static void main(String[] args) {

//       converts a total number of seconds to hours, minutes, and seconds.
//       //(1) prompt the user for input
//       //(2) read an integer from the keyboard,
//       (3) calculate the result,
//       (4) use printf to display the output.
//       For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds" .
        Scanner in = new Scanner(System.in);
        int seconds, minutes, hours, remainder, finalSeconds;
        final int MIN_PER_HOUR = 60;
        final int SEC_PER_MIN = 60;
        final int SEC_PER_HOUR = 3600;

        // prompt the user and get the value
        System.out.print("Please enter a number of seconds ");
        seconds = in.nextInt();
        // convert and output the result
        hours = seconds / SEC_PER_HOUR;
        minutes = (seconds % SEC_PER_HOUR) / SEC_PER_MIN;
        finalSeconds = seconds % SEC_PER_MIN;
        //System.out.println(seconds + " seconds = " + hours + "hours, " + minutes + "minutes, " + finalseconds + " seconds.");
        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds",seconds, hours, minutes, finalSeconds);


    }
}
