package Lab6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Task: C13 - изначити ієрархію рухомого складу залізничного транспорту. Створити пасажирський потяг.
 * Порахувати загальну чисельність пасажирів і багажу в потязі. Провести сортування вагонів потягу за рівнем комфортності.
 * Знайти вагон в потязі, що відповідає заданому діапазону кількості пасажирів.
 *
 * Has main method that creates objects of Carriage class, then counts all the passengers and luggage on the train,
 * sorts the carriage by comfort and finds a carriage with given range of passengers
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Lab6 {
    public static void main(String[] args) {
        final int numofcarriages = 7;


        class ComparatorByComfort implements Comparator<Carriage> {
            @Override
            public int compare(Carriage o1, Carriage o2) {
                return o2.getComfort()-o1.getComfort();
            }
        }


        Carriage[] train = new Carriage[numofcarriages];
        train[0] = new Carriage("Залізничний транспорт", "Пасажирський","Ліверпуль — Манчестер", 1, 17, 5, 74);
        train[1] = new Carriage("Залізничний транспорт","Пасажирський","Ліверпуль — Манчестер", 2,10, 4, 85);
        train[2] = new Carriage("Залізничний транспорт","Пасажирський","Ліверпуль — Манчестер", 3,23, 13, 53);
        train[3] = new Carriage("Залізничний транспорт","Пасажирський","Ліверпуль — Манчестер", 4,25, 11, 93);
        train[4] = new Carriage("Залізничний транспорт","Пасажирський","Ліверпуль — Манчестер", 5,13, 10, 77);
        train[5] = new Carriage("Залізничний транспорт","Пасажирський","Ліверпуль — Манчестер", 6,9, 4, 41);
        train[6] = new Carriage("Залізничний транспорт","Пасажирський","Ліверпуль — Манчестер", 7,23, 15, 68);
        System.out.println("Транспорт: ");

        for (Carriage n : train) {
            System.out.println(n);
        }

        Train.inTotal(train);

        System.out.println("\nВагони потягу, відсортовані за зменшенням рівня комфортності: ");
        Arrays.sort(train, new ComparatorByComfort());
        for (Carriage n : train) {
            System.out.println(n);
        }

        Train.searchbyPassengers(train, 10, 15);
    }
}
