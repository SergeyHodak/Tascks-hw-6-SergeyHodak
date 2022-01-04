/*
    Задача - посчитать количество палиндромов
    Палиндром - это слово, которое читается одинаково в обе стороны. Например, слово "казак" - палиндром.
    Задача
    Напиши класс PalindromeCounter. В классе создай метод public int count(String phrase). Метод принимает строку,
    которая состоит из слов, разделенных одним пробелом, и возвращает количество палиндромов в этой строке.

Примеры тестов
вызов new PalindromeCounter().count("Level done!") возвращает 1;
вызов new PalindromeCounter().count("No palindromes") возвращает 0.
 */

class PalindromeCounter11 {
    public int count(String phrase) {
        String[] text = (new String(phrase)).toLowerCase().split(" ");
        int result = 0;
        for (String a: text) {
            char[] c = a.toCharArray();
            StringBuilder b = new StringBuilder();
            for (int i = c.length-1; i >= 0; i--) {
                b.append(c[i]);
            }

            if (a.contentEquals(b)) {
                result++;
            }
        }
        return result;
    }
}

class Tasck11 { //class PalindromeCounterTest
    public static void main(String[] args) {
        PalindromeCounter11 counter = new PalindromeCounter11();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}