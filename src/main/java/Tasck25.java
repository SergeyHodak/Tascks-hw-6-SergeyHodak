/*
    Задача - сделать рефакторинг сложения цифр в строку
Есть класс, который склеивает массив чисел в строку. Он работает правильно, но медленно, потому что в цикле
добавляет к строке число. Постоянно выделяется оперативная память, и если давать на вход большие (десятки тысяч данных)
массивы чисел, то программа ощутимо замедлится.
    Задача
    Перепиши существующий код класса NumberJoiner с использованием класса StringBuilder, чтобы избавиться от
    конкатенации строк в цикле. В остальном программа должна работать точно так же.

Примеры тестов
выполнение кода new NumberJoiner().join(new int[] {10, 20, 30}) возвращает строку 102030;
 */

//class NumberJoiner25 {
//    public String join(int[] numbers) {
//        String result = "";
//        for(int number: numbers) {
//            result += number;
//        }
//        return result;
//    }
//}

class NumberJoiner25 {
    public String join(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for(int number: numbers) {
            result.append(number);
        }
        return result.toString();
    }
}

class Tasck25 { //class NumberJoinerTest
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner25().join(new int[] {10, 20, 30}));
    }
}