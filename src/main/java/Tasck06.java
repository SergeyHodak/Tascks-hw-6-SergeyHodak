/*
    Задача - посчитать количество знаков пунктуации
    Напиши класс PunctuationMarkCounter. В этом классе создай метод public int count(String phrase).
    Он принимает строку, и возвращает количество знаков пунктуации в этой строке.

Знаками пунктуации считаются следующие: ., ,, !, :, ;.

Примеры тестов
вызов new PunctuationMarkCounter().count("Hello, world!") возвращает 2;
вызов new PunctuationMarkCounter().count("This is Sparta!") возвращает 1;
вызов new PunctuationMarkCounter().count("End.") возвращает 1.
 */

//class PunctuationMarkCounter06 {
//    public int count(String phrase) {
//        char[] resultt = phrase.toCharArray();
//        int result = 0;
//        char[] i = {'.', ',', '!', ':', ';'};
//        for (char a: i) {
//            int b = 0;
//            for (int j = 0; j < resultt.length; j++) {
//                if (a == resultt[j]) {
//                    b++;
//                }
//            }
//            result += b;
//        }
//        return result;
//    }
//}

class PunctuationMarkCounter06 {
    public int count(String phrase){
        int periodCount = 0;  //счетчик для точки '.'
        int commaCount = 0; //счетчик для запитой ','
        int semicolonCount = 0; //счетчик для точки с запитой ';'
        int colonCount = 0; //счетчик для двоеточия ':'
        int exclamationCount = 0; //счетчик для восклицательного знака '!'
        int total = 0; // по идее должно вернуть общую сумму всех счетчиков
        for(int i = 0; i < phrase.length(); i++) {  //пробежка по переданной строке в метод
            System.out.println("мы проверяем какой сейчас символ " + phrase.charAt(i));
            switch(phrase.charAt(i)) {
                case '.':
                    System.out.println("Эта позиция равно точке, повысим счетчик periodCount на единицу");
                    periodCount++;
                    break;
                case ',':
                    System.out.println("Эта позиция равно запитой, повысим счетчик commaCount на единицу");
                    commaCount++;
                    break;
                case ';':
                    System.out.println("Эта позиция равно точки с запитой, повысим счетчик semicolonCount на единицу");
                    semicolonCount++;
                    break;
                case ':':
                    System.out.println("Эта позиция равно двоеточия, повысим счетчик colonCount на единицу");
                    colonCount++;
                    break;
                case '!':
                    System.out.println("Эта позиция равно восклицательного знака, повысим счетчик exclamationCount на единицу");
                    exclamationCount++;
                    break;
            }
            total += 1; // ВОТ И СТРОКА ОШИБКИ. здесь ты каждый проход цикла фор добавляешь к результату единицу
            /*
                так как ты используешь здесь, для каждого символа отдельный счетчик, я бы здесь удалил эту строчку
                total += 1;
                и изменил бы ретурн с
                return total;
                на
                return (periodCount + commaCount + semicolonCount + colonCount + exclamationCount);
                а также удалил бы строку
                int total = 0;
             */

        }
        System.out.println("твой тотал возвращает в итоге цифру из того из сколько символов вообще состоит строка = " + total);
        System.out.println("а должен возвращать сколько спец символов а не всех символов = " + (periodCount + commaCount + semicolonCount + colonCount + exclamationCount));
        System.out.println("#####################################################################################################");
        return total;
    }
}

class Tasck06 { //class PunctuationMarkCounterTest
    public static void main(String[] args) {
        PunctuationMarkCounter06 counter = new PunctuationMarkCounter06();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}