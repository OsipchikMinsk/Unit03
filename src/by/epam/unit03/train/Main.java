package by.epam.unit03.train;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Train berlin = new Train("Berlin", 1010, 2020);
        Train moscow = new Train("Moscow", 1020, 1020);
        Train berlin1 = new Train("Berlin", 1910, 1020);
        Train roma = new Train("Rom00", 1000, 920);
        Train minsk = new Train("Minsk", 1900, 2020);
        Train[] trains = new Train[5];
        trains[0] = berlin;
        trains[1] = moscow;
        trains[2] = berlin1;
        trains[3] = roma;
        trains[4] = minsk;
        System.out.println(Arrays.toString(trains));
        System.out.println(Arrays.toString(Dispatcher.sortByTrainNumber(trains)));
        Dispatcher.getInfoByTrainNumber(trains);
        System.out.println(Arrays.toString(Dispatcher.sortByDestination(trains)));


    }
}
