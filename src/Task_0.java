/** Задание №0 от лекции №9
 * Результат:
 Задание 1
 1234 5678
 End

 Задание 2
 1234-***-5678-***-9*1*
 End

 Задание 3
 qwe/rty/a/b
 End

 Задание 4
 LETTERS:QWE/RTY/A/B
 End

 Задание 5
 Документ содержит запрошенную подстроку " qwe "
 End

 Задание 6
 Документ не начинается с запрошенной подстроки " 555 "
 End

 Задание 7
 Документ заканчивается на запрошенную подстроку " 9a1b "
 End

 Process finished with exit code 0

 */

public class Task_0 {
    static String doc = new String("1234-qwe-5678-rty-9a1b");

    static String docType;
    static String docType1;
    static StringBuilder docSb = new StringBuilder(doc);


            static void task1() {
                // TODO: Вывести на экран в одну строку два первых блока по 4 цифры
                System.out.println();
                System.out.println("Задание 1");
                System.out.println(doc.substring(0, 4) + " " + doc.substring(9, 13));
                System.out.println("End");
            }
            static void task2() {
                // TODO: Вывести на экран номер документа, но блоки из трех букв заменить на *(каждая буква заменятся на *)
                    System.out.println();
                    System.out.println("Задание 2");
                    docType = doc.replaceAll("[a-zA-Z]", "*");
                    System.out.println(docType);
                    System.out.println("End");

            }
            static void task3() {
                // TODO: Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
                    System.out.println();
                    System.out.println("Задание 3");
                    docType1 = doc.replaceAll("[0-9]", "/").replaceAll("-", "");
                    System.out.println(docType1.substring(4, 8) + docType1.substring(11, 18));
                    System.out.println("End");
            }
            static void task4() {
                // TODO: Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder)
                    System.out.println();
                    System.out.println("Задание 4");
                    docSb.insert(0, "Letters:");
                    docSb.delete(8, 13).delete(11, 17).delete(14, 16).replace(11, 11, "/").replace(15, 15, "/").replace(17, 18, "/");
                    System.out.println(docSb.toString().toUpperCase());
                    System.out.println("End");
            }
            static void task5() {
                // TODO: Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
                    System.out.println();
                    System.out.println("Задание 5");
                    if (doc.contains("qwe")) {
                        System.out.println("Документ содержит запрошенную подстроку");
                    } else {
                        System.out.println("Документ не содержит запрошенную подстроку");
                    }
                    System.out.println("End");


            }
            static void task6() {
                // TODO: Проверить начинается ли номер документа с последовательности 555.
                    System.out.println();
                    System.out.println("Задание 6");
                    if (doc.startsWith("555")) {
                        System.out.println("Документ начинается с запрошенной подстроки");
                    } else {
                        System.out.println("Документ не начинается с запрошенной подстроки");
                    }
                    System.out.println("End");

            }
            static void task7() {
                // TODO: Проверить заканчивается ли номер документа на последовательность 1a2b.
                System.out.println();
                System.out.println("Задание 7");
                if (doc.endsWith("9a1b")) {
                    System.out.println("Документ заканчивается на запрошенную подстроку");
                } else {
                    System.out.println("Документ не заканчивается на запрошенный подстроке");
                }
                System.out.println("End");
            }


        public static void main(String[] args) {
            System.out.println("Номер документа:");
            System.out.println("1234-qwe-5678-rty-9a1b");
            System.out.println("------------------------");
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();



        }
}
