package Lab5OOP;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * C3 = 1 - StringBuffer; C13 = 6 - sorting words of a text by the number vowels
 * words - list of words from the text, that match the character sequence of a word, which needs to be sorted by number of vowels
 * number1, number2 - numbers of vowels in two words; text - the given text
 */

public class Sentence {
    private final List<Word> sentence;
    public Sentence(String sentence) {
        this.sentence = new ArrayList<Word>();
        Pattern pattern = Pattern.compile("(([a-z]*('[a-z]|[a-z]))|(\".*\"))(,\\s|.)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) this.sentence.add(new Word(matcher.group()));
    }
    public String getSentence() {
        String s = "";
        for (Word i: sentence) s = s.concat(i.getWord());
        return s; }
}
