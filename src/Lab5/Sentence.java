package Lab5;

/**
 * Has general data of sentences and refers to both Punctuation and Letter classes
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Sentence {
    private int numPunctu = 0;
    private int numWord = 0;
    private Punctuation[] punctuations;
    private Word[] words;
    private int sizeofword = 100;
    private int sizeofpunctu = 100;

    public Sentence() {
        words = new Word[sizeofword];
        punctuations = new Punctuation[sizeofpunctu];
    }

    public void setSentence(StringBuilder ss) {
        char e;
        String d = ss.toString();
        String [] strings = d.split(" ");
        char[] f;
        for (String word: strings) {
            e = word.charAt(word.length() - 1);
            if ((e == ',') || (e == '.') || (e == '?') || (e == ';') || (e == '!') || (e == ':') || (e == '"')) {
                if (word.length() > 3 && !Character.isAlphabetic(word.charAt(word.length() - 3)) &&
                        !Character.isAlphabetic(word.charAt(word.length() - 2))) {
                    setWord(word.substring(0, word.length() - 3));
                    setPunctu(new StringBuilder(d.substring(d.length() - 3)));
                } else {
                    f = new char[1];
                    f[0] = e;
                    setWord(word.substring(0, word.length() - 1).trim());
                    setPunctu(new StringBuilder(new String(f)));
                }
            } else {
                setWord(word.trim());
                setPunctu(null);
                System.out.print(" ");
            }
        }
    }

    public void setPunctu(StringBuilder sp) {
        punctuations[numPunctu] = new Punctuation(sp);
        numPunctu++;
    }

    public void setWord(String sw) {
        StringBuilder b = new StringBuilder(sw);
        words[numWord] = new Word();
        words[numWord].setWord(b);
        numWord++;
    }

    public void deleteChar() {
        for (int i = 0; i < words.length; i++) {
            if (punctuations[i] != null && words[i] != null) {
                System.out.print(" ");
                words[i].delChar();
                System.out.print(punctuations[i].getPunctu());
            }
        }
    }

    public String toString() {
        String fin = "";
        for (int i = 0; i < numWord; i++) {
            if (i < numWord - 1) {
                fin += words[i].getWord() + " ";
            } else {
                fin += words[i].getWord();
            }
        }
        return fin;
    }
}
