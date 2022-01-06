/*
    Задача - посчитать количество имен собственных
Именем собственным считается слово, в котором есть хотя бы две буквы.
Первая буква должна быть большой, все остальные - маленькими.
    Задача
    Напиши класс NameCounter. В этом классе создай метод public int count(String text).
    Он возвращает количество имен собственных согласно алгоритма, описанного выше.

Примеры тестов
выполнение кода new NameCounter().count("Mars is great planet") возвращает 1;
выполнение кода new NameCounter().count("Moon is near Earth") возвращает 2;
выполнение кода new NameCounter().count("SPACE IS GREAT") возвращает 0.
 */

class NameCounter24 {
    public int count(String text) {
        String[] data = text.split(" ");
        String bigg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int result = 0;
        for (String a: data) {
            if (a.length() > 1) {
                int big = 0;
                for (int i = 0; i < a.length(); i++) {
                    if (bigg.contains(String.valueOf(a.charAt(i)))) {
                        big++;
                    }
                }
                if (big == 1) {
                    result++;
                }
            }
        }
        return result;
    }
}

class NameCounterTest { //class NameCounterTest
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter24().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter24().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter24().count("SPACE IS GREAT"));
    }
}