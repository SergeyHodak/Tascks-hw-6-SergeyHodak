/*
    Задача - посчитать короткие слова
    Напиши класс ShortWordCounter. В этом классе создай метод public int count(String phrase, int minLength).
    Метод принимает на вход строку phrase и переменную minLength. Возвращает количество слов, которые меньше или равны чем minLength.

    Строка состоит исключительно из цифр и букв английского алфавита, слова разделены одним пробелом, знаков пунктуации нет.

Примеры тестов
выполнение кода new ShortWordCounter().count("Java is great language", 2) возвращает 1;
выполнение кода new ShortWordCounter().count("Java is great language", 4) возвращает 2;
выполнение кода new ShortWordCounter().count("Java is great language", 5) возвращает 3;
выполнение кода new ShortWordCounter().count("Java is great language", 100) возвращает 4.
 */

class ShortWordCounter10 {
    public int count(String phrase, int minLength) {
        int result = 0;
        String[] text = phrase.split(" ");
        for (String a: text) {
            if (a.length() <= minLength) {
                result++;
            }
        }
        return result;
    }
}

class Tasck10 { //class ShortWordCounterTest
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter10().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter10().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter10().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter10().count("Java is great language", 100));
    }
}