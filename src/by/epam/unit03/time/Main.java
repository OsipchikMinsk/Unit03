package by.epam.unit03.time;

public class Main {
    public static void main(String[] args) {

        Time t1 = new Time(10,20,45);
        System.out.println(t1.toString());
        System.out.println(KeeperTime.increaseHour(t1,15));
        System.out.println(KeeperTime.increaseMinutes(t1,41));
        System.out.println(KeeperTime.increaseSeconds(t1,3601));
        System.out.println(KeeperTime.increaseAllParameters(t1,13,39,15));
        Time timeDefault = new Time();
        System.out.println(timeDefault.toString());
        timeDefault.setHour(1);
        timeDefault.setMinute(50);
        timeDefault.setSecond(50);
        System.out.println(timeDefault.toString());
        KeeperTime.decreaseAllParameters(timeDefault,0,50,1);
        System.out.println(timeDefault.toString());




    }
}
