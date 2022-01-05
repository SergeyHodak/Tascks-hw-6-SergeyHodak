/*
    Задача - состоит ли текст исключительно из цифр
Иногда при поиске встречаются такие тексты, которые состоят исключительно из цифр и пробелов.
Это скорей всего ошибка парсинга, или ошибка кодировки, и такой текст не нужно показывать в результатах поиска.
    Задача
    Напиши класс DigitText. В этом классе создай метод public boolean detect(String text).
    Он принимает строку и возвращает true в случае, если строка состоит исключительно из цифр и пробелов.

Примеры тестов
выполнение кода new DigitText().detect("23 50") возвращает true;
выполнение кода new DigitText().detect("Year 1990") возвращает false.
 */

class DigitText15 {
    public boolean detect(String text) {
        return text.matches("[0-9 ]+");
    }
}

class Tasck15 { //class DigitTextTest
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText15().detect("23 50"));

        //false
        System.out.println(new DigitText15().detect("Year 1990"));
    }
}