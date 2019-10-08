package by.epam.unit03.train;

public class Train {
    private String destination;  //пункт назначения
    private int trainNumber;   //номер поезда
    private int timeOfDeparture;  //время отправления


     Train(String destination, int trainNumber, int timeOfDeparture) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.timeOfDeparture = timeOfDeparture;
    }

     String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

     int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

     int getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(int timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    @Override
    public String toString() {
        return  "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", timeOfDeparture=" + timeOfDeparture +
                '}' + "\n";
    }
}
