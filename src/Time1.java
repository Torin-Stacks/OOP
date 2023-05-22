public class Time1 {

    private int hour;
    private int second;
    private int minute;

    public Time1(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    private static void validateHour(int hour){
        boolean inValid = hour < 0 || hour > 23;
        if (inValid){
            throw  new IllegalArgumentException("hour is out of range");
        }

    }

    private static void validateMinute(int minute){
        boolean inValid = minute < 0 || minute > 59;
        if (inValid){
            throw  new IllegalArgumentException("minute is out of range");
        }

    }

    private static void validateSecond(int second){
        boolean inValid = second < 0 || second > 59;
        if (inValid){
            throw  new IllegalArgumentException("second is out of range");
        }

    }

    public String toUniversalFormatString(){

        return String.format("%02d:%02d:%02d", hour, minute,second);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", (hour ==0 || hour ==12 ? 12:hour % 12), minute, second, (hour < 12? "AM": "PM"));
    }



}
