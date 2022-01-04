/*
    Задача - посчитать количество вхождений слова в текст
    Одна из важных характеристик текста - сколько раз в текст входит то или иное слово.
    Чем чаще слово встречается в тексте относительно общего количества слов в тексте - тем, скорей всего,
текст полнее отвечает на запрос пользователя.
    Тебе для поисковой системы Goo нужно написать программу, которая будет считать частоту вхождения слова.

    Задача
    Напиши класс WordFreqCounter. В этом классе опиши метод public float countFreq(String phrase, String word).
Метод принимает на вход строку phrase и слово word, и возвращает частоту вхождения слова в фразу.

Входная фраза phrase состоит из отдельных слов, разделенных пробелами. Гарантируется, что во входной строке есть
только слова, разделенные одиночными пробелами, и нет других символов (знаков пунктуации).

Программа должна игнорировать регистр букв (слова, состоящие из маленьких и больших букв, считаются одинаковыми).

Примеры тестов
выполнение кода new WordFreqCounter().countFreq("Hello Java", "java") возвращает 0.5f;
выполнение кода new WordFreqCounter().countFreq("Hello World", "java") возвращает 0f.
 */

class WordFreqCounter08 {
    public float countFreq(String phrase, String word) {
        String result = new String(phrase.toLowerCase());
        String[] a = result.split(" ");
        float b = 0;
        for (String slovo: a) {
            if (slovo.equals(word.toLowerCase())) {
                b++;
            }
        }
        return b / a.length;
    }
}

class Tasck08 { //class WordFreqCounterTest
    public static void main(String[] args) {
        WordFreqCounter08 freqCounter = new WordFreqCounter08();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}