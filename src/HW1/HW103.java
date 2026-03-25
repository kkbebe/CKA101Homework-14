package HW1;

public class HW103 {
    public static void main(String[] args) {
        

        int totalSec = 256559;
        int day = totalSec / (60 *60 *24);
        int remainSec = totalSec % (60 *60 *24);
        int hour = remainSec / (60 * 60);
        remainSec %= (60 * 60);
        int minute = remainSec / 60;
        remainSec %= 60;
        int sec = remainSec;
        System.out.printf("256559 = %d days %d hours %d minute %d sec", day, hour, minute, sec );



    }
}
