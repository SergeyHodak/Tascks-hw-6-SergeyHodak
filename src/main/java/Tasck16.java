/*
    Задача - создать краткое описание
Когда поисковая система Goo нашла длинный текст, и его нужно показать пользователю
на странице найденных результатов, то такой текст нужно обрезать.

Текст обрезается по следующему алгоритму:
    если длина текста 15 или меньше символов - текст оставляется как есть;
    если длина текста 16 и больше символов - то берутся первые 15 символов.
    Если следующий символ после первых 15 символов не является пробелом - к результату еще добавляются три точки ...
    (потому что мы разрезали какое-то слово).

    Задача
    Напиши класс SummaryCreator. В этом классе напиши метод public String create(String text).
    Метод принимает строку, и возвращает ее краткий вариант согласно алгоритма, описанного в теории.

Примеры тестов
вызов new SummaryCreator().create("Mars") возвращает Mars;
вызов new SummaryCreator().create("Java is very popular language") возвращает Java is very po....
 */

class SummaryCreator16 {
    public String create(String text) {
        String result = new String(text);
        if (text.length() > 15) {
            if (result.charAt(15) == ' ') {
                return result.substring(0, 15);
            }
            return result.substring(0, 15) + "...";
        }
        return result;
    }
}

class Tasck16 {
    public static void main(String[] args) { //class SummaryCreatorTest
        SummaryCreator16 summaryCreator = new SummaryCreator16();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}