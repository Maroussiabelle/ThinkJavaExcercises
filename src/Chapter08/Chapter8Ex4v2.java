package Chapter08;

public class Chapter8Ex4v2 {

    public static void main(String[] args) {
        int[] b = {10, 2, 4, 80, 5};
        System.out.println(findMaximum(b));


    }

    public static int findMaximum(int[] a) {
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = i;
                return largest;
            }
        }
        return -1;
    }
}
