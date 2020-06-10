package Lab6;

/**
 * Has data of carriage and extends Train class
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Carriage extends Train {
    Carriage(String classification, String name, String destination, int num, int passengers, int luggage, int comfort) {
        super(classification, name, destination);
        int max_comfort = 100;
        this.comfort = Math.min(comfort, max_comfort);
        int max_passengers = 25;
        this.passengers = Math.min(passengers, max_passengers);
        this.num = num;
        int max_luggage = 15;
        this.luggage = Math.min(luggage, max_luggage);
    }

    private int comfort;

    public int getComfort() {
        return comfort;
    }

    private int luggage;

    public int getLuggage() {
        return luggage;
    }

    private int passengers;

    public int getPassengers() {
        return passengers;
    }

    private int num;

    public int getNum() {
        return num;
    }

    public String toString() {
        return getClassification() + ". Тип: " + getName() + ". Потяг \"" + getTrainDestination() + "\". Вагон №" + getNum() + ". Кількість пасажирів: "
         + getPassengers() + ". Кількість багажу: " + getLuggage() + ". Рівень комфортності: " + getComfort() + "%";
    }
}
