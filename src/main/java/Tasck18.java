/*
    Задача - посчитать среднюю длину слова в строке
Чтобы определить, не является ли текст поисковым спамом, бывает полезно оценить такой параметр,
как средняя длина слова в тексте. Дальше можно сравнить этот показатель с аналогичным показателем
для других текстов, и в случае большого отклонения - присмотреться к тексту ближе.
    Задача
    Напиши класс AvgWordLength. В этом классе напиши метод public double count(String phrase). Метод принимает строку,
    состояющую из слов, разделенных ровно одним пробелом, и возвращает среднюю длину слова в этой строке.

Примеры тестов
выполнение кода new AvgWordLength().count("Launch Rocket") возвращает 6;
выполнение кода new AvgWordLength().count("Life is strange thing") возвращает 4.5.
 */

class AvgWordLength18 {
    public double count(String phrase) {
        String[] text =  phrase.split(" ");
        double result = 0;
        for (String a: text) {
            result += a.length();
        }
        return result / text.length;
    }
}

class Tasck18 { //class AvgWordLengthTest
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength18().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength18().count("Life is strange thing"));
    }
}