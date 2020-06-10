package Lab5;

import java.util.Objects;

/**
 * Has general data of punctuation and is used to print given punctuation
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Punctuation {

    public Punctuation(StringBuilder a) {
        if (a != null) {
            this.setPunctu(a);
            System.out.print(a + " ");
        }
    }

    private StringBuilder punctu = null;

    public void setPunctu(StringBuilder punctu) {
        this.punctu = punctu;
    }

    public StringBuilder getPunctu() {
        return Objects.requireNonNullElseGet(punctu, () -> new StringBuilder(""));
    }
}
