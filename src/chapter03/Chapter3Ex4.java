package chapter03;

import java.util.Random;
import java.util.Scanner;

public class Chapter3Ex4 {
    public static void main(String[] args) {

        System.out.println("I 'm thinking of a number between 1 and 5");
        System.out.println("(including both).Can you guess what it is?");
        System.out.println("Type a number:");
        //scan input
        Scanner in = new Scanner(System.in);
        int insertNumber = in.nextInt();
        // pick a random number
        System.out.println("Your guess is:" + insertNumber);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is:" + number);
        if (insertNumber == number) {
            System.out.println("You are right!");
        } else {
            System.out.println("You were off by: " + (insertNumber - number));
        }

    }
}



