package Lab6;

/**
 * Has general data of transport
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Transport {
    Transport(String classification) {
        this.classification = classification;
    }

    private String classification;

    public String getClassification() {
        return classification;
    }
}
