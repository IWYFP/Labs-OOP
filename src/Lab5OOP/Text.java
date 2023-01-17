package Lab5OOP;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * C3 = 1 - StringBuffer; C13 = 6 - sorting words of a text by the number vowels
 * words - list of words from the text, that match the character sequence of a word, which needs to be sorted by number of vowels
 * number1, number2 - numbers of vowels in two words; text - the given text
 */

public class Text {
    private final List<Sentence> text;
    public Text(String text) {
        System.out.println("Initial text:\n" + text);
        this.text = new ArrayList<Sentence>();
        Pattern pattern = Pattern.compile("[a-z][\\s,\"'[a-z]]*([?!]|\\.*)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) this.text.add(new Sentence(matcher.group()));
    }
    public String getText() {
        String s = "";
        for (Sentence i: text) s = s.concat(i.getSentence());
        return s; }
}
