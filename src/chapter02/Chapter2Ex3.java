package chapter02;

public class Chapter2Ex3 { //Time
        public static void main( String[] args){
            int hour = 19;
            int minute = 18;
            int second = 45;
            System.out.print("Number of seconds since midnight: ");
            int currentSeconds = ((hour * 3600) + (minute * 60) + second);
            System.out.println(currentSeconds);
            System.out.print("Number of seconds remaining in the day: ");
            System.out.println((24*3660)-currentSeconds);
        }
    }


