package by.epam.unit03.time;

 class KeeperTime {

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
    // метод котрый изменяет текущее состояне времени по трем парметрам (увеличивает его), причем может случиться так что
    // пользователь может изменить часы на 25 часов 300 мин и 500 сек вперед. Часы должны показать время в 24 часовом формате

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

     static Time decreaseHour(Time time, int hour){
        int realHour = time.getHour()-hour;
        time.setHour(realHour);
         return new Time(time.getHour(), time.getMinute(), time.getSecond());
     }
     // метод котрый изменяет текущее состояне времени по трем парметрам (уменьшает его), если изменяемое время меньше по продол
     //жительности на сумму времени в методе, то вернуть неправильное время со значениями ==0
     static Time decreaseAllParameters(Time time, int hour, int minute, int seconds) {
         int hourReal = time.getHour();//в часах
         int minReal = time.getMinute(); //действующее время в минутах
         int secReal = time.getSecond(); //действующеее время в сек
         int timeInSec = hourReal * 3600 + minReal * 60 + secReal;      //переведем все время в секудны
         int timeInSecInput = hour * 3600 + minute * 60 + seconds;//переведем продолжительность входящего  время в секудны
         if ((timeInSec - timeInSecInput) <= 0) {
             return new Time(); //вернем "неправильное время" со значеними 0
         } else {
             time.setSecond((timeInSec - seconds) % 60);
             time.setMinute(((timeInSec - minute) / 60) % 60);
             time.setHour(timeInSec - hour / 3600);
             return time;
         }

     }


}
