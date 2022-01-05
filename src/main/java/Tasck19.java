/*
    Задача - выделить все цифры из строки
    Напиши класс DigitExtracter. В этом классе создай метод public int[] extract(String text). Метод принимает строку,
    и возвращает массив всех цифр, которые есть в этой строке, в том же порядке, в котором они встречаются.

Примеры тестов
Выполнение кода:

DigitExtracter digitExtracter = new DigitExtracter();

int[] extracted = digitExtracter.extract("april 5, year 2000");

System.out.println(Arrays.toString(extracted));
выводит в консоль [5, 2, 0, 0, 0].
 */

import java.util.Arrays;

class Tasck19 { //class DigitExtracterTest
    public static void main(String[] args) {
        DigitExtracter19 digitExtracter = new DigitExtracter19();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter19 {
    public int[] extract(String text) {
        char[] data = text.toCharArray();
        int calk = 0;
        int[] result = new int[text.length()];
        for (char a: data) {
            if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6'
                    || a == '7' || a == '8' || a == '9') {
                result[calk] = Character.getNumericValue(a);
                calk++;
            }
        }
        return Arrays.copyOf(result, calk);
    }
}