/*
    Задание - пишем запрос к Goo
"Корпорация Goo ищет талантливого программиста для разработки поисковой системы".
Написание системы нужно начать c нескольких вспомогательных иммутабельных классов.

    Задача
    Напиши класс, описывающий запрос к поисковой системе. Класс должен называться GooQuery.
    У класса должен быть публичный конструктор, принимающий два параметра:
        language типа String - на каком языке искать указанный текст;
        text типа String - какой именно текст нужно искать.
    Конструктор должен сохранять эти параметры в приватные поля с такими же именами.
    Для этих полей создай публичные геттеры. Сеттеров не создавай, это иммутабельные классы.

    Переопредели метод toString(), чтобы он возвращал строку вида Searching [<TEXT>], using language: <LANGUAGE>.
Вместо <TEXT> и <LANGUAGE> используй значения полей text и language соответственно.

Примеры тестов
вызов new GooQuery("en", "capital").toString() возвращает Searching [capital], using language: en;
вызов new GooQuery("en", "capital").getLanguage() возвращает en";
вызов new GooQuery("en", "capital").getText() возвращает capital.

 */

class GooQuery01 { //class GooQuery
    private final String language;
    private final String text;

    public GooQuery01(String language, String text) {
        this.language = language;
        this.text = text;
    }

    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Searching [" + this.text + "], using language: " + this.language;
    }
}

class Tasck01 { //class GooQueryTest
    public static void main(String[] args) {
        GooQuery01 query = new GooQuery01("en", "capital");

        //en
        System.out.println(query.getLanguage());

        //capital
        System.out.println(query.getText());

        //Searching [capital], using language: en
        System.out.println(query);
    }
}