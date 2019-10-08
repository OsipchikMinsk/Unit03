package by.epam.unit03.counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(10, 100);
        System.out.println(counter.getCount());
        counter.increase();
        counter.increase();
        System.out.println(counter.getCount());
        counter.decrease();
        System.out.println(counter.getCount());
        Counter counterDefault = new Counter();
        System.out.println(counterDefault.getCount());
        counterDefault.increase();
        counterDefault.increase();
        counterDefault.decrease();

        System.out.println(counterDefault.getCount());
    }
}
