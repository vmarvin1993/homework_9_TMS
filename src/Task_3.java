import java.util.Scanner;

/**
 * Дана строка произвольной длины с произвольными словами.
 *   Написать программу для проверки является ли любое выюранное слово в строке полиндромом.
 *   Например, есть строка, вводится число 3, значит необходимо проверить является ли 3ей слово в этой строке полиндромом.
 *   Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов, а на вход программе передали число 500 и т.п. ситуации.
 *   Результат:
 *   Успешный:
 abba abde accy acca akaka
 Введите номер позиции слова:
 1
 true
------------
 * Неуспешный:
 abba abde accy acca akaka
 Введите номер позиции слова:
 500
 Пожалуйста, введите существующую позицию.
 */

public class Task_3 {

    static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++)
            if (str.charAt(i) != str.charAt(n - i - 1))

                return false;
           return true;
    }


    public static void main(String[] args) {
        String str = "abba abde accy acca akaka";
        Scanner scan = new Scanner(System.in);
        System.out.println(str);
        System.out.println("Введите номер позиции слова(От 1 до 5):");
        int numb = scan.nextInt();
        String[] temp = str.split(" ");

        if (numb > temp.length) {
            System.out.println("Пожалуйста, введите существующую позицию.");
            return;
        } String result = temp[numb-1];

        System.out.println(isPalindrome(result));
    }
}

