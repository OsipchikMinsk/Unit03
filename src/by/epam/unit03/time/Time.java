package by.epam.unit03.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

     Time(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    int getHour() {
        return hour;
    }

    void setHour(int hour) {
        if (hour<0||hour>23){
            this.hour = 0;
            return;
        }
        this.hour = hour;
    }

    int getMinute() {
        return minute;
    }

    void setMinute(int minute) {
        if (minute<0||minute>59){
            this.minute = 0;
            return;
        }
        this.minute = minute;
    }

    int getSecond() {
        return second;
    }

    void setSecond(int second) {
        if (second<0||second>59){
            this.second = 0;
            return ;
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
