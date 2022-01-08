/*
    Задача - посчитать количество уникальных символов
    Напиши класс UniqueCharCounter. В этом классе создай метод public int count(String phrase), который принимает
    строку и возвращает количество уникальных символов в этой строке.

    Строка состоит лишь из цифр, символов английского алфавита, и пробелов.

Примеры тестов
вызов new UniqueCharCounter().count("123") возвращает 3;
вызов new UniqueCharCounter().count("ab100") возвращает 4;
вызов new UniqueCharCounter().count("Java") возвращает 3.
 */

//class UniqueCharCounter12 { // мое первое решение, модернизировано
//    public int count(String phrase) {
//        char[] text = phrase.toCharArray();
//        char[] test = new char[phrase.length()];
//        int i = 0;
//        int c = 0;
//        for (char a: text) {
//            if (!String.valueOf(test).contains(String.valueOf(a))) {
//                test[i] = a;
//                i++;
//            } else {
//                c++;
//                i++;
//            }
//        }
//        return (test.length)-c;
//    }
//}

//class UniqueCharCounter12 { //Anna Goy 08.01.2022
//    public int count(String phrase) {
//        phrase = phrase.toLowerCase();
//        int count = 0;
//        //String[] wordArray = phrase.split(" ");
//        for (int i = 0; i < phrase.length(); i++) {  //пробежка посимволам
//            //for (int k = 0; k < wordArray.length; k++) { //не нужна еще одна пробежка по символам
//            if (phrase[i] != phrase[k]) { //иф нужно переделать
//                count++;
//            }
//            //return count;
//            //}
//            //return count;
//        }
//        return count;
//    }
//}


class UniqueCharCounter12 { //Anna Goy 08.01.2022
    public int count(String phrase) {
        char[] characters = phrase.toCharArray();
        int countOfUniqueChars = phrase.length();
        for (int i = 0; i < characters.length; i++) {
            //System.out.println(i + " " + phrase.indexOf(characters[i]) + " " + characters[i]);
            //то есть иф сравнивает индекс первого вхождения символа в строку с шагом
            if (i != phrase.indexOf(characters[i])) {
                countOfUniqueChars--;
            }
        }
        return countOfUniqueChars;
    }
}

class Tasck12 { //class UniqueCharCounterTest
    public static void main(String[] args) {
        UniqueCharCounter12 charCounter = new UniqueCharCounter12();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}