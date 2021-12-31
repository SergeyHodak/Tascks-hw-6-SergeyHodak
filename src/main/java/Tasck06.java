/*
    Задача - посчитать количество знаков пунктуации
    Напиши класс PunctuationMarkCounter. В этом классе создай метод public int count(String phrase).
    Он принимает строку, и возвращает количество знаков пунктуации в этой строке.

Знаками пунктуации считаются следующие: ., ,, !, :, ;.

Примеры тестов
вызов new PunctuationMarkCounter().count("Hello, world!") возвращает 2;
вызов new PunctuationMarkCounter().count("This is Sparta!") возвращает 1;
вызов new PunctuationMarkCounter().count("End.") возвращает 1.
 */

class PunctuationMarkCounter06 {
    public int count(String phrase) {
        char[] resultt = phrase.toCharArray();
        int result = 0;
        char[] i = {'.', ',', '!', ':', ';'};
        for (char a: i) {
            int b = 0;
            for (int j = 0; j < resultt.length; j++) {
                if (a == resultt[j]) {
                    b++;
                }
            }
            result += b;
        }
        return result;
    }
}

class Tasck06 { //class PunctuationMarkCounterTest
    public static void main(String[] args) {
        PunctuationMarkCounter06 counter = new PunctuationMarkCounter06();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}