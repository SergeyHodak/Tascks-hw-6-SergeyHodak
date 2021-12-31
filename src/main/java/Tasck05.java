/*
    Задача - нарезать строку на слова
    Напиши класс WordSplitter. В этом классе создай метод public String[] split(String phrase).
    Метод принимает на вход строку, разделяет ее на слова, и возвращает массив строк. Каждая строка - отдельное слово.

Словом считается любая последовательность символов, кроме пробелов.

Гарантируется, что входная строка содержит лишь символы английского алфавита, цифры и пробелы.

Примеры тестов
вызов new WordSplitter().split("Hello      world") возвращает [hello, world];
вызов new WordSplitter().split("This is Sparta") возвращает [this, is, sparta];
 */

import java.util.Arrays;

class WordSplitter05 {
    public String[] split(String phrase) {

        String result = new String(phrase);
        for (int i = 0; i < (result.length())/2; i++) {
            result = result.replace("  ", " ");
        }
        result = result.toLowerCase();
        return result.split(" ");
    }
}

class Tasck05 { //class WordSplitterTest
    public static void main(String[] args) {
        WordSplitter05 wordSplitter05 = new WordSplitter05();

        String[] words = wordSplitter05.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}