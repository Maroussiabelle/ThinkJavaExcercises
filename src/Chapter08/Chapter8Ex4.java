package Chapter08;

public class Chapter8Ex4 {

    public static void main(String[] args) {
        int[] b = {10, 2, 4, 80, 5};
        System.out.println(findMaximum(b));
        System.out.println(indexOfMaximum(b, 80));

    }

    public static int findMaximum(int[] a) {
        int largest = a[0];
        for (int value : a) {
            if (value > largest) {
                largest = value;
                return largest;
            }
        }
        return -1;
    }

    public static int indexOfMaximum(int[] a, int largest) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == largest) {
                return i;

            }
        }
        return -1;
    }
}