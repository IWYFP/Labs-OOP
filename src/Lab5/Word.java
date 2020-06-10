package Lab5;

/**
 * Has general data of words and refers to Letters class
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Word {
    private Letter[] letters;
    private String builder;

    public void delChar() {
        if (builder != null) {
            char c = builder.charAt(builder.length() - 1);
            StringBuilder strB = new StringBuilder();
            for (int i = 0; i < builder.length(); i++) {
                if (builder.charAt(i) != c) {
                    strB.append(builder.charAt(i));
                }
            }
            strB.append(c);
            letters = new Letter[strB.length()];
            for (int i = 0; i < strB.length(); i++) {
                letters[i] = new Letter(strB.substring(i, i + 1));
            }
        }
    }

    public void setWord(StringBuilder b) {
        String s = b.toString();
        if (!s.equals("")) {
            String word = new String(b);
            letters = new Letter[word.length()];
            builder = word;
            for (int i = 0; i < b.length(); i++) {
                letters[i] = new Letter(b.substring(i, i + 1));
            }
        }
    }

    public String getWord() {
        StringBuilder strB = new StringBuilder();
        return strB.toString();
    }

    public String toString() {
        String tab = " ";
        for (int i = 0; i < letters.length; i++) {
            tab += letters[i].toString();
        }
        return tab;
    }
}
