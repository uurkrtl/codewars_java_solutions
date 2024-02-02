-- Created by Ugur Kartal

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hour = 0;
        int minute = 0;
        int second = seconds;

        if (second >= 3600) {
            hour = seconds / 3600;
            second -= hour * 3600;
        }

        if (second >= 60){
            minute = second / 60 ;
            second -= minute * 60;
        }

        String sHour = hour<10 ? "0" + hour : String.valueOf(hour);
        String sMinute = minute<10 ? "0" + minute : String.valueOf(minute);
        String sSecond = second<10 ? "0" + second : String.valueOf(second);

        return String.format("%s:%s:%s", sHour, sMinute, sSecond);
    }
}