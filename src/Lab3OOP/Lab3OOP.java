package Lab3OOP;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * C3 = 1 - StringBuffer; C13 = 6 - sorting words of a text by the number vowels
 * words - list of words from the text, that match the character sequence of a word, which needs to be sorted by number of vowels
 * number1, number2 - numbers of vowels in two words; text - the given text
 */

public class Lab3OOP {
    private static class Word {
        private final String characters;
        Word(String characters) { this.characters = characters; }
        public String getCharacters() { return characters; }
    }
    static class VowelsCompare implements Comparator<Word>{
        public int compare(Word word1, Word word2) {
            int number1 = 0;
            int number2 = 0;
            Pattern pattern = Pattern.compile("([aeiou])", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(word1.getCharacters());
            while (matcher.find()) number1++;
            matcher = pattern.matcher(word2.getCharacters());
            while (matcher.find()) number2++;
            return number1 - number2;
        }
    }
    public static void main(String[] args) {
        StringBuffer text = new StringBuffer("In literary theory, a text is any object that can be \"read\", whether" +
                " this object is a work of literature, a street sign, an arrangement of buildings on a city block," +
                " or styles of clothing. It is a coherent set of signs that transmits some kind of informative" +
                " message. This set of signs is considered in terms of the informative message's content, rather" +
                " than in terms of its physical form or the medium in which it is represented.");
        System.out.println("Initial text:\n" + text);
        Pattern pattern = Pattern.compile("([a-z]*('[a-z]|[a-z]))", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        List<Word> words = new ArrayList<>();
        while (matcher.find()) words.add(new Word(matcher.group()));
        words.sort(new VowelsCompare());
        System.out.println("\nSorted by vowels words of the text: ");
        for (Word word: words) System.out.print(word.getCharacters() + " ");
    }
}