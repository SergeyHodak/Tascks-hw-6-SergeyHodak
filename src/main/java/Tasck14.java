/*
    Задача - есть ли чуствительные данные
Чуствительными данными считаются слова: pass, key, login, email в любом регистре.
    Задача
    Напиши класс SensitiveDataSearcher. У этого класса создай метод public boolean isSensitiveDataPresent(String phrase).
    Он принимает строку, и возвращает true, если в строке есть чуствительные данные.

Примеры тестов
вызов new SensitiveDataSearcher().isSensitiveDataPresent("Hello world") возвращает false;
вызов new SensitiveDataSearcher().isSensitiveDataPresent("Pass: swordfish") возвращает true.
 */

class SensitiveDataSearcher14 {
    public boolean isSensitiveDataPresent(String phrase) {
        String[] data = new String[] {"pass", "key", "login", "email"};
        String phras = new String(phrase.toLowerCase());
        for (String a: data) {
            if (phras.contains(a)) {
                return true;
            }
        }
        return false;
    }
}

class Tasck14 { //class SensitiveDataSearcherTest
    public static void main(String[] args) {
        SensitiveDataSearcher14 searcher = new SensitiveDataSearcher14();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}