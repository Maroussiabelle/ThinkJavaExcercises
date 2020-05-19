package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Chapter5Ex7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        guess();
    }

    public static void guess() {

        System.out.println("I 'm thinking of a number between 1 and 5");
        System.out.println("(including both).Can you guess what it is?");
        System.out.println("Type a number:");
        //scan input

        int insertNumber = in.nextInt();
        // pick a random number
        if (insertNumber<1 || insertNumber>5){
            System.out.println("The entered number is not valid.");
            return;
        }
        System.out.println("Your guess is:" + insertNumber);
        Random random = new Random();
        int number = random.nextInt(5) + 1;
        System.out.println("The number I was thinking of is:" + number);
        if (insertNumber == number) {
            System.out.println("You are right!");
        } else {

            System.out.println("You were too " + (insertNumber > number ? "high" : "low") + " by: "
                    + Math.abs(insertNumber - number) + " Please try again.");
            guess();

        }
    }
}


