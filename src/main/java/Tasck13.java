/*
    Задача - удалить из текста указанные слова
    Напиши класс WordDeleter. У этого класса создай метод public String remove(String phrase, String[] words).
    Этот метод принимает строку phrase, которая состоит из отдельных слов, разделенных ровно одним пробелом,
и удаляет из нее все слова, указанные в массиве words.

    Возвращается строка без этих слов. Оставшиеся слова должны так же быть разделены ровно одним пробелом.

Примеры тестов
вызов new WordDeleter().remove("Hello Java", new String[] {"Java"}) возвращает Hello;
вызов new WordDeleter().remove("This is Sparta", new String[] {"is"}) возвращает This Sparta;
 */

class WordDeleter13 {
    public String remove(String phrase, String[] words) {
        String[] text = phrase.split(" ");
        String[] result = new String[text.length];
        int i = 0;
        for (String value: text) { // по строчки слов с которой вырезать
            int c = 0;
            for (String a: words) { //по списку вырезаемых слов
                if (a.equals(value)) { // если вырезаемое совпало с позицией
                    c++;
                    break;
                }
            }
            if (c == 0) {
                result[i] = value;
                i++;
            }
        }

        StringBuilder finish = new StringBuilder();
        for (String hg: result) {
            if (hg != null) {
                finish.append(hg).append(" ");
            }
        }
        return finish.toString().trim();
    }
}

class Tasck13 { //class WordDeleterTest
    public static void main(String[] args) {
        WordDeleter13 wordDeleter13 = new WordDeleter13();

        //Hello
        System.out.println(wordDeleter13.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter13.remove("This is Sparta", new String[] {"is"}));
    }
}