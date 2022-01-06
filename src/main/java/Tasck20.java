/*
    Задача - каких символов больше
Одним из критериев оформленности является правильная расстановка больших букв (фраза должна начинаться с большой буквы,
но если весь текст набран большими буквами - это скорей всего проблемный текст).

Напиши программу, которая принимает строку, и возвращает строку по следующим критериям:

если количество маленьких букв в строке больше чем количество больших букв - возвращается Small;
если количество больших букв больше чем количество маленьких - возвращается Big;
если количество больших и маленьких букв равно - возвращается Same.
Пробелы в тексте игнорируй.

    Задача
    Напиши класс BigOrSmall. В этом классе создай метод public String calculate(String text).
    Метод принимает строку, и возвращает строку согласно критериям выше.

Примеры тестов
выполнение кода new BigOrSmall().calculate("Java") возвращает Small;
выполнение кода new BigOrSmall().calculate("JAVA") возвращает Big;
выполнение кода new BigOrSmall().calculate("jAvA") возвращает Same.
 */

class BigOrSmall20 {
    public String calculate(String text) {
        String data = text.replaceAll("\\s+", "");
        int small = 0;
        int big = 0;
        String litl = "abcdefghijklmnopqrstuvwxyz";
        String bigg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < data.length(); i++) {
            if (litl.contains(String.valueOf(data.charAt(i)))) {
                small++;
            }
            if (bigg.contains(String.valueOf(data.charAt(i)))) {
                big++;
            }
        }
        return small > big ? "Small" : big > small ? "Big" : "Same";
    }
}

class Tasck20 { //class BigOrSmallTest
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall20().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall20().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall20().calculate("jAvA"));
    }
}