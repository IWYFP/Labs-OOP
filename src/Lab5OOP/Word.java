package Lab5OOP;

import java.util.*;

/**
 * C3 = 1 - StringBuffer; C13 = 6 - sorting words of a text by the number vowels
 * words - list of words from the text, that match the character sequence of a word, which needs to be sorted by number of vowels
 * number1, number2 - numbers of vowels in two words; text - the given text
 */

public class Word {
    private final List<Letter> word;
    public Word(String word) {
        this.word = new ArrayList<Letter>();
        for (char c: word.toCharArray()) this.word.add(new Letter(c));
    }
    public String getWord() {
        String s = "";
        for (Letter i: word) s = s.concat("" + i.getLetter());
        return s; }
}
