/*
    Задача - получить строку из массива байт
Строки передаются по сети Интернет в виде байтового потока (точно так же, как и любые другие данные).
Поэтому, если мы хотим что-то искать в тексте, который получили из сети Интернет, то нам нужно вначале
полученный массив байт перевести в строку.
    Задача
    Напиши класс StringByteWorker. В этом классе создай метод public String process(byte[] bytes). Метод принимает
    на вход массив байт, делает из этого массива строку, приводит ее в нижний регистр, и возвращает эту строку.

Примеры тестов
выполнение кода new StringByteWorker().process(new byte[] {74, 97, 86, 97}) возвращает строку java
Стартовый код

class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}
 */

class StringByteWorker09 {
    public String process(byte[] bytes) {
        return (new String(bytes)).toLowerCase();
    }
}

class Tasck09 { //class StringByteWorkerTest
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker09().process(startBytes));
    }
}