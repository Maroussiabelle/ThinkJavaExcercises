public class Time {
    public static void main(String[] args) {
        int hour = 12;
        int minute = 49;
        int second = 45;
        System.out.print("Number of seconds since midnight: ");
        int currentSeconds = ((hour * 3600) + (minute * 60) + second);
        System.out.println(currentSeconds);
        System.out.print("Number of seconds remaining in the day: ");
        System.out.println((24 * 3600) - currentSeconds);
        double totalSeconds = 24 * 3600;
        System.out.print("The percentage of the day that has passed is: ");
        System.out.printf("%.2f %% \n", ((double) currentSeconds / totalSeconds) * 100); // %% ekranirovanie
        hour = 20;
        minute = 23;
        second = 10;
        int newCurrentSeconds = ((hour * 3600) + (minute * 60) + second);
        int elapsedSeconds = newCurrentSeconds - currentSeconds;
        System.out.println("The time passed since start of doing exercise is: " + elapsedSeconds + " seconds.");
        int elapsedHours = elapsedSeconds / 3600;
        int elapsedMinutes = (elapsedSeconds - (elapsedHours * 3600)) / 60;
        int leftSeconds = elapsedSeconds - (elapsedHours * 3600) - (elapsedMinutes * 60);
        System.out.println("The time passed since start of doing exercise is: " + elapsedHours + " hours " + elapsedMinutes + " minutes " + leftSeconds + " seconds.");

    }
}
