package chapter02;

public class Chapter2Ex2 {//Date
    public static void main(String[] args) {
        String day = "Monday";
        int date = 11;
        String month = "May";
        int year = 2020;
        System.out.println("Today is " + day + ", " + date + " of " + month + " " + year + ".");

        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);

        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + " " + year);


    }
}
