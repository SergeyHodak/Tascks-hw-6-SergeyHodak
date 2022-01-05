/*
    Задача - есть ли математическое выражение в тексте
Когда поисковая система ищет какой-то текст по теме "Математика", то найденные тексты оцениваются
по параметру - есть ли в тексте математические выражения.

+Такие тексты ранжируются выше.

Для поисковой системы Goo текст считается таким, что в нем есть математические выражения, если:

в тексте есть хотя бы один символ =;
в тексте есть хотя бы один математический оператор +, -, *, /;
в тексте есть минимум 2 цифры.
    Задача
    Напиши класс MathDetector. В этом классе создай метод public boolean isMath(String text). Этот метод принимает
    текст, и возвращает true, если в тексте есть математические выражения согласно алгоритма выше.

Примеры тестов
-вызов new MathDetector().isMath("2+2=4") возвращает true; -вызов new MathDetector().isMath("1992 is great year") возвращает false; -вызов new MathDetector().isMath("Venus vs Earth") возвращает false.
 */

class MathDetector17 {
    public boolean isMath(String text) {
        int ravno = 0; // в тексте есть хотя бы один символ =
        int operator = 0; // в тексте есть хотя бы один математический оператор +, -, *, /
        int cifru = 0; // в тексте есть минимум 2 цифры
        for (char a: text.toCharArray()) {
            switch(a) {
                case '=':
                    ravno++;
                    break;
                case '+' | '-' | '*'| '/':
                    operator++;
                    break;
                case '0' | '1' | '2'| '3' | '4' | '5' | '6' | '7' | '8' | '9':
                    cifru++;
                    break;
            }
        }
        return ravno > 0 | operator > 0 | cifru > 1;
    }
}

class Tasck17 { //class MathDetectorTest
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector17().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector17().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector17().isMath("Venus vs Earth"));
    }
}