import java.util.*;
/**
 *   Дана строка произвольной длины с произвольными словами.
 *   Найти самое короткое слово в строке и вывести его на экран.
 *   Найти самое длинное слово в строке и вывести его на экран.
 *   Если таких слов несколько, то вывести последнее из них.
 */
public class Task_1 {

    public static void main(String[] args) {
        String word = "Зеленая зелень зеленеет ";

        List<String> words = new ArrayList<>();

        StringBuilder str = new StringBuilder();

        for (char i : word.toCharArray()) {
            str.append(i);
            if (i == ' ') {
                words.add(str.toString());
                str = new StringBuilder();
            }
        }
        String min = words.stream().min(Comparator.comparingInt(String::length)).get();
        String max = words.stream().max(Comparator.comparingInt(String::length)).get();

        System.out.println(min);
        System.out.println(max);

        }
}

