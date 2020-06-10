package Lab5;

/**
 * Task: C3 - StringBuilder
 * C17 - В кожному слові заданого тексту, видалити всі попередні входження останньої літери цього слова
 *
 * Executes main method that creates a new Text object which is used to
 * delete all previous occurrences of the last letter of that word and replace
 * the sequence of tabs and spaces with one space
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class Lab5 {
    public static void main(String[] args) {
        Text result = new Text();
        StringBuilder str = new StringBuilder("Миоидиифікувати лабуоруатуорну ууроботу №3 наступммним чинмом: дляя літер, слів, речень, " +
                "розділхових знваків ата туеуксту ситвоиирити окрііемі            клаисии.");
        System.out.print("Текст із заміною послідовності табуляцій та пробілів: ");
        result.setText(str);
        System.out.print("\n\nРезультат:");
        result.delChars();
    }
}
