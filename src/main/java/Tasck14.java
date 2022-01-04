/*
    Задача - есть ли чуствительные данные
Перед тем как показывать найденную страницу пользователю, поисковая система должна убедиться, что там нет никаких чуствительных данных.

Чуствительными данными считаются слова: pass, key, login, email в любом регистре.

Задача
Напиши класс SensitiveDataSearcher. У этого класса создай метод public boolean isSensitiveDataPresent(String phrase). Он принимает строку, и возвращает true, если в строке есть чуствительные данные.

Примеры тестов
вызов new SensitiveDataSearcher().isSensitiveDataPresent("Hello world") возвращает false;
вызов new SensitiveDataSearcher().isSensitiveDataPresent("Pass: swordfish") возвращает true.
 */

class Tasck14 { //class SensitiveDataSearcherTest
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}