package chapter06;

public class Chapter6Ex3 {
    public static void main(String[] args) {
        isTriangle(16, 4, 5);
    }

    public static boolean isTriangle(int a, int b, int c) {
//       if (a > b+c || b > a+c || c > a+b){
//           System.out.println("You cannot form a triangle from sticks with these lengths: " +a + "," + b + "," + c+ ".");
//           return false;
//        }else{
//           System.out.println("Go ahead and build!");
//           return true;
//       }
        // is equivalent to without else

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("You cannot form a triangle from sticks with these lengths: " + a + "," + b + "," + c + ".");
            return false;
        }
        System.out.println("Go ahead and build!");
        return true;

    }
    /*
    * If any of the three lengths is greater than the sum of the other two, you cannot form a
triangle.
Write a method named isTriangle that takes three integers as arguments and
returns either true or false , depending on whether you can or cannot form a trian‐
gle from sticks with the given lengths.*/
}
