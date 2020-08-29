package chapter09;/*Write a method called letterHist that takes a string as a parameter and returns a
histogram of the letters in the string. The zeroth element of the histogram should
contain the number of a’s in the string (upper- and lowercase); the 25th element
should contain the number of z’s. Your solution should only traverse the string once.*/

public class Chapter9Ex1 {

    public static void main(String[] args) {
        int a = 5;
        String word = "bla";
        char b = '-';
        double number = 2.22;
        boolean is = true;
        System.out.println(a + word + b + is + number);
        System.out.println(a + b + number);
        System.out.println(a + number);
        System.out.println(b + number);

        char c = 'a';
        char c2 = '1';
        int d = c;
        int e = c2;
        System.out.println(d);
        System.out.println(e);
    }
}

//    public static int letterHist (String word){
//
//    }

