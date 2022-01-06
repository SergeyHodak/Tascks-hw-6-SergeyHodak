/*
    Задача - можно ли из слова составить другое слово
Напиши программу, которая будет определять - можно ли из одного слова составить другое.
Буквы можно использовать сколько угодно раз. Регистр букв не учитывай.
    Задача
    Напиши класс WordCombine. В этом классе создай метод public boolean canCombine(String sourceWord, String targetWord).
    Он должен возвращать true лишь в том случае, если из слова sourceWord можно составить слово targetWord.

Примеры тестов
выполнение кода new WordCombine().canCombine("Forest", "tor") возвращает true;
выполнение кода new WordCombine().canCombine("Magic", "Mama") возвращает true;
выполнение кода new WordCombine().canCombine("War", "Piece") возвращает false.
 */

class WordCombine21 {
    public boolean canCombine(String sourceWord, String targetWord) {
        String sourceWords = sourceWord.toLowerCase();
        String targetWords = targetWord.toLowerCase();
        for (int i = 0; i < targetWords.length(); i++) {
            if (!(sourceWords.contains(String.valueOf(targetWords.charAt(i))))) {
                return false;
            }
        }
        return true;
    }
}

class Tasck21 { //class WordCombineTest
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine21().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine21().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine21().canCombine("War", "Piece"));
    }
}