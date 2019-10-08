package by.epam.unit03.train;

import java.util.Scanner;

public class Dispatcher {
    static Train[] sortByTrainNumber(Train[] trains) {
    int size = trains.length-1;
    for (int i =0;i<size;i++){
        for (int j=0;j<size-i;j++)
        if (trains[j].getTrainNumber()>trains[j+1].getTrainNumber()){
            Train tmpTrain = trains[j];
            trains[j] = trains[j+1];
            trains[j+1] = tmpTrain;
        }
    }
    return trains;
     }

    static void getInfoByTrainNumber(Train[] trains) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of train");
        int trainNumber = scanner.nextInt();
        int size = trains.length;
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (trains[i].getTrainNumber() == trainNumber) {
                System.out.println(trains[i].toString());
                flag = false;
            }
        }
        if (flag) {
            System.out.printf("Train №%d not found \n", trainNumber);
        }
    }
    //сортировка по длинне назавания, если название совпадает, то первый котроый отправляется раньше
    static Train[] sortByDestination(Train[] trains) {
        int size = trains.length;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size-i; j++) {
                if (trains[i].getDestination().length() > trains[j].getDestination().length()) {
                    Train tmpTrain = trains[i];
                    trains[i] = trains[j];
                    trains[j] = tmpTrain;
                }
                if (trains[i].getDestination().equals(trains[j].getDestination())) {
                    if (trains[i].getTimeOfDeparture() < trains[j].getTimeOfDeparture()) {
                        Train tmpTrain = trains[i];
                        trains[i] = trains[j];
                        trains[j] = tmpTrain;

                    }
                }
            }

        }
        return trains;

    }
}
