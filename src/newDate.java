public class newDate {
    public static void main(String[] args) {
        String day = "Monday";
        int date = 12;
        String month = "May";
        int year = 2020;
        System.out.println("Today is " + day + ", " + date + " of " + month + " " + year + ".");

        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);

        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + " " + year);
        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);


    }

    public static void printAmerican(String day, int date, String month, int year) {
        //System.out.println("The date and time in American format is: " + day + ", " + month + " " + date + ", " + year);
        System.out.printf("The date and time in American format is: %s, %s, %d, %d. \n", day, month, date, year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.printf("The date and time in European format is: %s, %d, %s, %d. \n",  day,  date, month, year);
    }
}
