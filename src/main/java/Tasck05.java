/*
    Задача - нарезать строку на слова
    Напиши класс WordSplitter. В этом классе создай метод public String[] split(String phrase).
    Метод принимает на вход строку, разделяет ее на слова, и возвращает массив строк. Каждая строка - отдельное слово.

Словом считается любая последовательность символов, кроме пробелов.

Гарантируется, что входная строка содержит лишь символы английского алфавита, цифры и пробелы.

Примеры тестов
вызов new WordSplitter().split("Hello      world") возвращает [hello, world];
вызов new WordSplitter().split("This is Sparta") возвращает [this, is, sparta];
 */

import java.util.Arrays;
import java.util.Locale;

class WordSplitter05 {
    public String[] split(String phrase) { //модернизорован 11.01.2022

//        String result = new String(phrase);
//        for (int i = 0; i < 3; i++) {
//            result = result.replace("  ", " ");
//        }
//        result = result.toLowerCase();
//        return result.split(" ");
        return phrase.toLowerCase().strip().split("\\s+");
    }
}

//class WordSplitter05 { //Oksana Holubenko 10.01.2022
//    public String[] split(String phrase) { //метод
//        String[] arrline = phrase.split(" "); //делим строку на элементы по 1 пробелу
//        String result = null; //создана строка с значением null
//        for (String readarr : arrline) { //пробежка по словам
//            if (readarr.length() > 0) { // если слово содержит символов больше нуля
//                result = readarr; // результат = слово
//                result += result; // к этому слову в результат суммируем еще раз это слово
//            }
//        }
//        return arrline; // возвращаем не измененный первоначально созданный массив слов поделенный по 1 пробелу
//    }
//}

//class WordSplitter05 { //Oleg bukshanevych 12.01.2022
//    public String[] split(String phrase){ //публичный метод, принимает строку, отдает массив из строк
//        phrase = phrase.strip(); //обработка входной строки методом стрип. - удаляет и пробелы, и другие невидимые символы, в начале и конце строки но не внутри
//        String[] result = new String[countSpaces(phrase)]; //новый массив из строк. размером который отдается с дополнительного метода countSpaces()
//
//        for(int i = 0; i < result.length; i ++){ //пробежка по созданному массиву
//            result[i] = phrase.replaceAll("[s ]+[^s ]+",""); //присвоить в позицию массива, первое слово (рекурсивное выражение)
//            phrase = phrase.replaceFirst("[^s ]+[s ]+",""); //вырезать из строки, первое слово и пробелы после него (рекурсивное выражение)
//        }
//        return result; //отдать результат
//    }
//    private int countSpaces(String target){  //дополнительный приватный метод, возвращаемый количество слов в строке
//        int count = 0; //счетчик
//        while(!target.isBlank()){ //цикл вайл, с условием: строка имеет символы кроме пробелов
//            target = target.replaceFirst("[^s ]+",""); //вырезает первое вхождения символов до первого пробела. (рекурсивное выражение)
//            count ++; //повысить счетчик
//        }
//        return count; // отдать результат счетчика
//    }
//}


class Tasck05 { //class WordSplitterTest
    public static void main(String[] args) {
        WordSplitter05 wordSplitter05 = new WordSplitter05();

        String[] words = wordSplitter05.split("  Hello      world  ");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}