/*
    Задача - убрать лишние пробелы
    Тебе нужно написать программу, которая будет удалять лишние двойные пробелы.
    Также программа должна удалять все пробелы в начале и в конце строки.

    Задача
    Напиши класс DoubleSpaceCleaner. У этого класса создай метод public String clean(String phrase).
Метод принимает на вход строку, и возращает ее же, только без двойных пробелов (между каждым словом
должен остаться ровно один пробел). Также метод должен удалить все пробелы в начале и в конце строки.

Примеры тестов
вызов new DoubleSpaceCleaner().clean("Hello World") возвращает Hello World;
вызов new DoubleSpaceCleaner().clean(" Hello World ") возвращает Hello World.
 */

//class DoubleSpaceCleaner07 { // мое первое рабочее решение
//    public String clean(String phrase) {
//        String result = new String(phrase);
//        for (int i = 0; i < (result.length())/2; i++) {
//            result = result.replace("  ", " ");
//        }
//        result = result.trim();
//        return result;
//    }
//}

//class DoubleSpaceCleaner07 {  //не верное решение спрашивающего человека
//    public String clean(String phrase){
//        phrase = phrase.replaceAll("  "," "); //-заменила двойные на однойные пробелы
//        String phrase2 = phrase.trim(); //-обрезала пробелы по краям
//        return phrase2;
//    }
//}

class DoubleSpaceCleaner07 {
    public String clean(String phrase){
        return phrase.replaceAll("\\s+", " ").trim();
    }
}

class Tasck07 { //class DoubleSpaceCleanerTest
    public static void main(String[] args) {
        DoubleSpaceCleaner07 cleaner = new DoubleSpaceCleaner07();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}