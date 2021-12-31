/*
    Задача - список слов
    Напиши класс Phrase.
    У класса должен быть публичный конструктор, принимающий один параметр:
        String[] words - список слов.
    Конструктор должен сохранить этот параметр в приватное поле с таким же именем.
    Не создавай для этого поля ни геттеров, ни сеттеров.

    Переопредели метод toString() у этого класса, чтобы он возвращал строку,
состоящую из элементов поля words, разделенных пробелом.

    Позаботься о иммутабельности класса. Если мы меняем массив, который передавали классу
Phrase, внутреннеe поле words не должно меняться.

Примеры тестов
Выполнение кода:

   String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
выводит в консоль:

alpha beta gamma
alpha beta gamma
 */

class Phrase04 {
    private final String[] words;

    public Phrase04(String[] words) {
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = words[i];
        }
        this.words = result;
    }

    @Override
    public String toString() {
        String res = String.join(" ", words);
        return new String(res);
    }
}

class Tasck04 { //class PhraseTest
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase04 phrase = new Phrase04(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}