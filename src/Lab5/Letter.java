package Lab5;

/**
 * Has general data of letters and is used to print given letters
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Letter {
    private String letter;

    public Letter(String letter) {
        setLetter(letter);
        System.out.print(getLetter());
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    public String toString() {
        return letter;
    }
}
