package Lab6;

/**
 * Has general data of passenger's transport and extends Transport class
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class PassengerTransport extends Transport {
    PassengerTransport(String classification, String name) {
        super(classification);
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
