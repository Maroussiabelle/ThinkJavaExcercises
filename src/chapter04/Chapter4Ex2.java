package chapter04;

public class Chapter4Ex2 {
    //1. Write the first line of a method named zool that takes three parameters: an int
    //and two String s.
    //2. Write a line of code that calls zool , passing as arguments the value 11 , the name
    //of your first pet, and the name of the street you grew up on.

    public static void zool(int x, String a, String b) {
        System.out.println("The default number is: " + x);
        System.out.println("Your first pet was: " + a);
        System.out.println("The street you grew up on is: " + b);

    }

    public static void main(String[] args) {
        final int x = 11;
        zool(x, "Zhunja", "Esplanades");


    }
}
