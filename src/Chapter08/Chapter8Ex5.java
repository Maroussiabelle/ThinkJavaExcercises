package Chapter08;

import java.util.Arrays;

public class Chapter8Ex5 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(10)));

    }

    public static boolean[] sieve(int n) {
        boolean[] result = new boolean[n];
        for (int a = 0; a < n-1; a++) {
            result[a] = isPrime(a);
        }

        return result;
    }

    private static boolean isPrime(int i) {
//        if (i==1){
//            return true;
//        }
        for (int number = 2; number <= i/2; number++) {
            if (i%number==0){
                return false;
            }
        }
        return true;
    }


}




