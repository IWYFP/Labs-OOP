package Lab5;

/**
 * Has general data of text and refers to Sentence class
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Text {
    private Sentence[] sentences;
    int currentposition;
    private int numSentence = 0;
    private int sentencesize = 300;

    public Text() {
        sentences = new Sentence[sentencesize];
    }

    public void setText (StringBuilder txt) {
        StringBuilder g = delTab(txt);
        for (int i = currentposition; i < g.length(); i++) {
            char h = g.charAt(i);
            if ((h == ',') || (h == '.') || (h == '?') || (h == ';') || (h == '!') || (h == ':') || (h == '"')) {
                if (i + 3 < g.length() && !Character.isAlphabetic(g.charAt(i + 1)) && !Character.isAlphabetic(g.charAt(i + 2))) {
                    String y = g.substring(currentposition, i + 3);
                    StringBuilder check = new StringBuilder(y);
                    sentences[numSentence] = new Sentence();
                    sentences[numSentence].setSentence(check);
                    numSentence++;
                    i += 3;
                    currentposition = i;
                } else {
                    String y = g.substring(currentposition, i + 1);
                    y = y.trim();
                    StringBuilder check = new StringBuilder(y);
                    sentences[numSentence] = new Sentence();
                    sentences[numSentence].setSentence(check);
                    numSentence++;
                    currentposition = i + 1;
                }
            }
        }
    }

    public void delChars() {
        for (int i = 0; i < numSentence; i++) {
            sentences[i].deleteChar();
        }
    }

    public StringBuilder delTab(StringBuilder str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
                str.replace(i, i + 1, "");
                i--;
            }
        }

        return str;
    }
}
