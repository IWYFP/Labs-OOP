package Lab7;

/**
 * Has general data of carriage
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Carriage {
    private int num = 1;
    private int luggage = 0;
    private int passengers = 0;
    private int comfort = 50;

    public Carriage(int num, int passengers, int luggage, int comfort) {
        this.num = num;
        this.passengers = passengers;
        this.luggage = luggage;
        this.comfort = comfort;
    }

    public int getComfort() {
        return comfort;
    }

    public int getLuggage() {
        return luggage;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getNum() {
        return num;
    }

    public String toString() {
        return "Вагон №" + getNum() + ". Кількість пасажирів: "
                + getPassengers() + ". Кількість багажу: " + getLuggage() + ". Рівень комфортності: " + getComfort() + "%";
    }
}
