/**
 * Дана строка произвольной длины с произвольными словами.
 *   Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
 *   Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 *   Результат

 Результат: fffff
 */

public class Task_2 {

    private static int words(String st){
        StringBuffer sb = new StringBuffer();
        String str;
        for (int i=0;i<st.length();i++) {
            str = String.valueOf(st.charAt(i));
            if (sb.indexOf(str)==-1)
                sb.append(str);
        }

        return sb.length();
    }

    public static void main(String[] args) {
        String words = "fffff ab f 1234 jkjk";
        System.out.println("Строка: fffff ab f 1234 jkjk");
        String[] arrayStr;
        arrayStr = words.split (" ", 0);
        String result = arrayStr[0];
        for (int i = 1; i < arrayStr.length; i++){
            if ( words(arrayStr[i])< words(result))
                result = arrayStr[i];
        }
        System.out.println();
        System.out.println("Результат: " + result);
    }
}
