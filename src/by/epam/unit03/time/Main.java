package by.epam.unit03.time;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(10,20,45);
        System.out.println(t1.toString());
        System.out.println(KeeperTime.increaseHour(t1,15));
        System.out.println(KeeperTime.increaseMinutes(t1,41));
        System.out.println(KeeperTime.increaseSeconds(t1,3601));
        System.out.println(KeeperTime.increaseAllParameters(t1,13,39,15));
    }
}
