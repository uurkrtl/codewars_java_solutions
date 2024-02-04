-- Created by Ugur Kartal

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        if (seconds == 0){
            return "now";
        }
        StringBuilder result = new StringBuilder();
        int years = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int second = 0;

        if (seconds>=31536000){
            years = seconds / 31536000;
            seconds -= years * 31536000;
            result.append(years + " year");
            if (years>1){
                result.append("s");
            }
        }

        if (seconds>=86400){
            days = seconds / 86400;
            seconds -= days * 86400;
            if ((seconds) == 0 && years > 0){
                result.append(" and ");
            } else if (years > 0) {
                result.append(", ");
            }
            result.append(days + " day");
            if (days>1){
                result.append("s");
            }
        }

        if (seconds>=3600){
            hours = seconds / 3600;
            seconds -= hours * 3600;
            if ((seconds) == 0 && (years + days) > 0){
                result.append(" and ");
            } else if ((years + days) > 0) {
                result.append(", ");
            }
            result.append(hours + " hour");
            if (hours>1){
                result.append("s");
            }
        }

        if (seconds>=60){
            minutes = seconds / 60;
            seconds -= minutes * 60;
            if ((seconds) == 0 && (years + days + hours) > 0){
                result.append(" and ");
            } else if ((years + days + hours) > 0) {
                result.append(", ");
            }
            result.append(minutes + " minute");
            if (minutes>1){
                result.append("s");
            }
        }

        if (seconds>0){
            second = seconds;
            if ((years + days + hours + minutes) > 0) {
                result.append(" and ");
            }
            result.append(second + " second");
            if (second>1){
                result.append("s");
            }
        }
        return result.toString();
    }
}