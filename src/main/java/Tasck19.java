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

//class DigitExtracter19 { //мое первое решение
//    public int[] extract(String text) {
//        char[] data = text.toCharArray();
//        int calk = 0;
//        int[] result = new int[text.length()];
//        for (char a: data) {
//            if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6'
//                    || a == '7' || a == '8' || a == '9') {
//                result[calk++] = Character.getNumericValue(a);
//            }
//        }
//        return Arrays.copyOf(result, calk);
//    }
//}


//class DigitExtracter19 { //Anna Goy 10.01.2022
//    public int[] extract(String text){
//        char[] data = text.toCharArray(); // созали из строки массив чаров
//        char[] digits = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // создали массив чар из цифр
//        int[] shotArray = new int[0]; // массив для вывода
//        for (char element : data) { // пробежка по элементам массива data
//            if (!contains(digits, element)) { // если элемент равен цифре
//                shotArray.append(element); // делаем запись в массив для вывода по шагателю
//            }
//        }
//        String[] resultArray = Arrays.copyOf(shotArray, index); // обрезаем массив
//        int[] numArr = Arrays.stream(resultArray).mapToInt(Integer::parseInt).toArray(); // этой строкой строку переводешь в инты?
//        return numArr;
//    }
//    private boolean contains(char[] all, char words) {
//        for (char str : all)  //пробежка по цифровому массиву
//            if (str == words) { //если цифра равна элементу из еще не изправленного массива чар строки text
//                return true;
//            }
//        return false;
//    }
//}


//class DigitExtracter19 { //Anna Goy 10.01.2022
//    public int[] extract(String text){
//        StringBuilder sb = new StringBuilder();
//        for(char c : text.toCharArray()) {
//            if (Character.isDigit(c)) {
//                System.out.println(c + " <-"); // эта строка ни разу не исполняется
//                sb.append(c);
//            }
//        }
//
//        // далее мое решение трансформаций
//        String transform = sb.toString();
//        char[] numbers = transform.toCharArray();
//        int[] result = new int[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            result[i] = Character.getNumericValue(numbers[i]);
//        }
//        return result;
//    }
//}


class DigitExtracter19 { //мое усовершенствованное решение после помощи Anna Goy
    public int[] extract(String text) {
        char[] data = text.toCharArray();
        int calk = 0;
        int[] result = new int[text.length()];
        for (char a: data) {
            if (Character.isDigit(a)) {
                result[calk++] = Character.getNumericValue(a);
            }
        }
        return Arrays.copyOf(result, calk);
    }
}