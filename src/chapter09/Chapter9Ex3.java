package chapter09;

public class Chapter9Ex3 {

    public static void main(String[] args) {
        String s = "((3 + 7) * 2)";
        String s1 = ")(";
        System.out.println(Check(s));

    }


    public static int Check (String a){
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;

    }
}
