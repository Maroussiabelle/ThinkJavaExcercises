package chapter06;

public class Chapter6Ex7 {


    public static void main(String[] args) {
        System.out.println(oddSum(4));
    }

    public static int oddSum(int n) {
        if(n%2==0){
            return -1;
        }
        if (n == 1) {
            return n;
        } else {
            return n + oddSum(n - 2);
        }

    }
}

