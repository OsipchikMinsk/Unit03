package by.epam.unit03.time;

public class KeeperTime {

    static Time increaseHour(Time time, int hour){
    return new Time((time.getHour()+hour)%24, time.getMinute(), time.getSecond());
    }
    static Time increaseMinutes (Time time, int minute){
        int hour = time.getHour(); //в часах
        int min = time.getMinute(); //действующее время в минутах
            hour = hour + (min+minute)/60;
            min = (min + minute)%60;
            time.setHour(hour);
            time.setMinute(min);
            time.setSecond(time.getSecond());
            return time;
        }
    static Time increaseSeconds(Time time, int seconds) {
        int hour = time.getHour(); //в часах
        int min = time.getMinute(); //действующее время в минутах
        int sec = time.getSecond(); //действующеее время в сек
        int timeInSec = hour * 3600 + min * 60 + sec + seconds; //переведем все время в секудны
        time.setSecond(timeInSec % 60);
        time.setMinute((timeInSec / 60) % 60);
        time.setHour(timeInSec / 3600);
        return time;
    }
    static Time increaseAllParameters(Time time, int hour, int minute, int seconds) {
        int hourReal = time.getHour(); //в часах
        int minReal = time.getMinute(); //действующее время в минутах
        int secReal = time.getSecond(); //действующеее время в сек
        int timeInSec = (hourReal + hour) * 3600 +
                        + (minReal+ minute) * 60 +
                        secReal + seconds;      //переведем все время в секудны
        time.setSecond(timeInSec % 60);
        time.setMinute((timeInSec / 60) % 60);
        time.setHour(timeInSec / 3600);
        return time;
    }

}
