package Chapter08;/*Write a method named areFactors that takes an integer n and an array of integers,
and that returns true if the numbers in the array are all factors of n (which is to say
that n is divisible by all of them).*/


public class Chapter8Ex6 {
    public static void main (String[] args){
        int [] numbers = {2,4,1,8};
        System.out.println(areFactors(8, numbers));


    }

    public static boolean areFactors (int n, int [] numbers){
        for (int i = 0; i<numbers.length; i++){
            if (n%numbers[i]!=0){
                return false;
            }
        }
        return true;
    }


}
