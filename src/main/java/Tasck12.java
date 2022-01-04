/*
    Задача - посчитать количество уникальных символов
    Напиши класс UniqueCharCounter. В этом классе создай метод public int count(String phrase), который принимает
    строку и возвращает количество уникальных символов в этой строке.

    Строка состоит лишь из цифр, символов английского алфавита, и пробелов.

Примеры тестов
вызов new UniqueCharCounter().count("123") возвращает 3;
вызов new UniqueCharCounter().count("ab100") возвращает 4;
вызов new UniqueCharCounter().count("Java") возвращает 3.
 */

class UniqueCharCounter12 {
    public int count(String phrase) {
        char[] text = phrase.toCharArray();
        char[] test = new char[phrase.length()];
        int i = 0;
        for (char a: text) {
            if (!String.valueOf(test).contains(String.valueOf(a))) {
                test[i] = a;
                i++;
            } else {
                test[i] = '\u0000';
                i++;
            }
        }

        int c = 0;
        for (char value : test) {
            if (value == '\u0000')
                c++;
        }
        return (test.length)-c;
    }
}

class Tasck12 { //class UniqueCharCounterTest
    public static void main(String[] args) {
        UniqueCharCounter12 charCounter = new UniqueCharCounter12();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}