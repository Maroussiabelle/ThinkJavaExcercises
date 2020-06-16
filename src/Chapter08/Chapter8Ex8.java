package Chapter08;

public class Chapter8Ex8 {

    public static void main(String[] args) {
        int[] b = {10, 2, 100, 4, 20, 50};
        System.out.println(max(b));

    }

    public static int maxInRange(int[] a, int lowIndex, int highIndex) {

        int firstHalfEnd = (lowIndex + highIndex) / 2;
        int secondHalfStart = firstHalfEnd;
        if (lowIndex == highIndex) {
            return a[lowIndex];
        } else if (highIndex - lowIndex == 1) {
            secondHalfStart = firstHalfEnd + 1;
        }
        int result1 = maxInRange(a, lowIndex, firstHalfEnd);
        int result2 = maxInRange(a, secondHalfStart, highIndex);
        return result1 > result2 ? result1 : result2;

    }

    public static int max (int[]a){
        return maxInRange(a, 0, a.length - 1);
    }
}