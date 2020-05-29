package chapter07;

public class Chapter7Ex4 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        for(int i = n-1; i > 1; i--){
            n *= i;
        }
        return n;
    }

}
