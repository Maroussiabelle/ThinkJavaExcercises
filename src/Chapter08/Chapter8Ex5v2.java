package Chapter08;

public class Chapter8Ex5v2 {
    public static void main(String[] args) {

        int num = 10, i = 2;
        boolean flag = false;
        while (i <= num / 2) {

            if (num % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

