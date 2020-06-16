package Chapter08;/*Write a method named arePrimeFactors that takes an integer n and an array of integers,
 and that returns true if the numbers in the array are all prime and their product is n .*/

public class Chapter8Ex7 {

    public static void main(String[] args) {
        int[] num = {1,4};
        System.out.println(arePrimeFactors(4, num));

    }


    public static boolean arePrimeFactors(int n, int[] numbers) {
        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result = result * numbers[i];
        }
        if (n != result) {
            return false;
        }
        for (int a = 0; a < numbers.length; a++) {
            for (int i = 2; i <= numbers[a]/ 2; i++) {
                if (numbers[a] % i == 0) {
                    return false;
                }
            }
        }
        return true;


    }
}