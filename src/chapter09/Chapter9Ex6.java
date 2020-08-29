package chapter09;

public class Chapter9Ex6 {


    public static void main(String[] args) {
        String bla = "Otto";
        String bla2 = "abcdefg";
        int[] alphabet = (hist(bla));
        System.out.println(isDoubloon(alphabet));

    }

    public static int[] hist(String word) {
        int[] alphabet = new int[25];
        String check = word.toLowerCase();
        char[] charArray = check.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char letter = charArray[i];
            int index = letter;
            alphabet[index - 97]++;
        }
        return alphabet;
    }

    public static boolean isDoubloon(int[] alphabet) {
        int previous = -1;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                if (previous ==-1) {
                    previous=alphabet[i];
                }
                else {
                    if (alphabet[i] != previous){
                        return false;
                    }
                }

            }

        }
        return true;
    }
}
