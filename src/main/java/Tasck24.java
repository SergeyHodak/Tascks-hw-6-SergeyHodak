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

class NameCounter24 {  //мое первое решение (модернизировано 11.01.2022)
    public int count(String text) {
        String[] data = text.split(" "); //создан список слов из строки по разделителю пробел
        int result = 0; //счеткик правильных форм слова которое относится к типу ИМЯ
        for (String a: data) {  //пробежка по словам
            if (a.length() > 1) { //если длина слова боьше 1
                int big = 0; // счетчик больших букв
                for (int i = 0; i < a.length(); i++) { //пробежка буквам слова
                    //System.out.println(String.valueOf(a.charAt(i)) + " и " + Character.isUpperCase(a.charAt(i)));
                    if (Character.isUpperCase(a.charAt(i))) { // если эта буква относился к буквам в верхнем регистре
                        big++; //зафиксировать что найдена буква в верхнем регистре
                    }
                }
                if (big == 1) { //ели больших букв в слове равно 1
                    result++; // зафиксировать это как искомое слово
                }
            }
        }
        return result; //отдать результат
    }
}

class Tasck24 { //class NameCounterTest
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter24().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter24().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter24().count("SPACE IS GREAT"));
    }
}

//class NameCounter24 { //класс // решение @Anna Goy 11.01.2022 (с моим исправленным исловием иф)
//    public int count(String text) { //метод
//        int count = 0; //счетчик
//        for (String word : text.split(" ")) { //пробежка по словам из строки text
//            String start = word.substring(0, 1).toUpperCase(); //новая строка = первая буква в верхнем регистре
//            String withoutStart= word.substring(1).toLowerCase(); //новая строка = остальные буквы в нижнем регистре
//            String result = start + withoutStart; //новая строка в виде правильного Именного слова
//            if ((word.length() > 1) & (word.equals(result))) { //если (длина слова > 1) и (слово равно правильному именованию)
//                count++; //повышаем счетчик
//            }
//        }
//        return count; //отдаем результат счетчика.
//    }
//}