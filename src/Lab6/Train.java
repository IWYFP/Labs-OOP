package Lab6;

/**
 * Has data of trains and extends PassengerTransport class
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Train extends PassengerTransport {
    Train(String classification, String name, String destination) {
        super(classification, name);
        this.trainDestination = destination;
    }

    public static void inTotal(Carriage[] train) {
        int totalPassengers = 0;
        int totalLuggage = 0;
        for (int i = 0; i < train.length; i++) {
            totalPassengers += train[i].getPassengers();
            totalLuggage += train[i].getLuggage();
        }
        System.out.println("\nЗагальна кількість пасажирів: " + totalPassengers + ". Загальна кількість багажу: " + totalLuggage);
    }

    public static void searchbyPassengers (Carriage[] train, int start, int end) {
        String result = "\nВагону, що відповідає діапазону пасажирів від " + start + " до " + end + ", немає!";
        for (int i = 0; i < train.length; i++) {
            if (start <= train[i].getPassengers() && train[i].getPassengers() <= end) {
                result = "\nВагон, що відповідає діапазону пасажирів від " + start + " до " + end + ": " + train[i];
                break;
            }
        }
        System.out.println(result);
    }

    private String trainDestination;

    public String getTrainDestination() {
        return trainDestination;
    }
}
