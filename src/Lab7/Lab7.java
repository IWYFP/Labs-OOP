package Lab7;

/**
 * Task: C2 - Set
 * C3 - Масив із початковою кількістю елементів 15 та збільшенням кількості елементів на 30%
 *
 * Has main method that adds carriage to a train sets and uses different manipulations with sets
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Lab7 {
    public static void main(String[] args) {
        MySet train = new MySet();
        MySet train1 = new MySet();
        MySet train2 = new MySet();
        Carriage c1 = new Carriage( 1, 17, 5, 74);
        Carriage c2 = new Carriage( 2,10, 4, 85);
        Carriage c3 = new Carriage(3,23, 13, 53);
        Carriage c4 = new Carriage(4,25, 11, 93);
        Carriage c5 = new Carriage(5,13, 10, 77);
        Carriage c6 = new Carriage(6,9, 4, 41);
        Carriage c7 = new Carriage(7,23, 15, 68);
        train.add(c1);
        train.add(c2);
        train.add(c3);
        train.add(c3);
        train1.add(c4);
        train1.add(c5);
        train2.add(c6);
        train2.add(c7);
        train2.add(c1);
        System.out.println("Потяг №1: ");
        for (Carriage n : train) {
            System.out.println(n);
        }
        System.out.println("\nПотяг №2: ");
        for (Carriage n : train1) {
            System.out.println(n);
        }
        System.out.println("\nПотяг №3: ");
        for (Carriage n : train2) {
            System.out.println(n);
        }
        train.remove(c3);
        System.out.println("\nЗ потягу №1 був видалений вагон №3: ");
        for (Carriage n : train) {
            System.out.println(n);
        }
        train2.removeAll(train);
        System.out.println("\nЗ потягу №3 було видалено всі вагони, що входять до потягу №1: ");
        for (Carriage n : train2) {
            System.out.println(n);
        }
        System.out.println("\nПеревірка на те, що потяг №3 не має вагонів: " + train2.isEmpty());
        System.out.println("Перевірка на рівність потягу №1 та потягу №2: " + train.equals(train1));
        System.out.println("Перевірка на присутність вагона №1 в потязі №1: " + train.contains(c1));
        System.out.println("Перевірка на присутність вагонів з потягу №2 в потязі №1: " + train.containsAll(train1));
        train.addAll(train1);
        System.out.println("\nДо потягу №1 були додані вагони з потягу №2: ");
        for (Carriage n : train) {
            System.out.println(n);
        }
        train.retainAll(train1);
        System.out.println("\nЗ потягу №1 були видалені вагони, що не входять до потягу №2: ");
        for (Carriage n : train) {
            System.out.println(n);
        }
        System.out.println("\nДовжина потягу №1: " + train.size() + ". Довжина потягу №2: " + train1.size()
                + ". Довжина потягу №3: " + train2.size());

    }
}
