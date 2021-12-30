/*
    Задача - статистика поиска слова
    Поисковые системы накапливают большое количество данных. Пример таких данных - слово, и как часто ищут это слово.
    Напиши иммутабельный класс, который сможет хранить слово, сколько раз запрашивали это слово,
и сможет выводить эту информацию в понятном виде.

    Задача
    Напиши класс GooWordStat.
    У класса должен быть публичный конструктор, принимающий два параметра:
        word типа String - слово, для которого мы хотим получить статистику;
        freq типа int - сколько раз искали это слово.
    Конструктор должен сохранять эти параметры в приватные поля с такими же именами.
    Для этих полей создай публичные геттеры. Сеттеров не создавай, это иммутабельные классы.

    Переопредели метод toString(), чтобы он возвращал строку вида Word is [<WORD>], search freq is <FREQ>.
        Вместо <WORD> используй значение поля word.
        Вместо <FREQ> подставь строку в зависимости от значения поля freq:
            если поле freq меньше 1000 - подставь строку LOW;
            если поле freq больше или равно 1000 и меньше 100000 - подставь строку MEDIUM;
            если поле freq больше или равно 100000 и меньше 10000000 - подставь строку HIGH;
            если поле freq больше или равно 10000000 - подставь строку EXTRA HIGH.

Примеры тестов
вызов new GooWordStat("human", 10).toString() возвращает Word is [human], search freq is LOW;
вызов new GooWordStat("mars", 10000).toString() возвращает Word is [mars], search freq is MEDIUM;
вызов new GooWordStat("space", 9965499).toString() возвращает Word is [space], search freq is HIGH;
вызов new GooWordStat("life", 564785654).toString() возвращает Word is [life], search freq is EXTRA HIGH.
 */

class GooWordStat02 { //class GooWordStat
    private final String word;
    private final int freq;

    public GooWordStat02(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    private String result() {
        if (freq < 1000) {
            return "LOW";
        } else if (freq >= 1000 & freq < 100000) {
            return  "MEDIUM";
        } else if (freq >= 100000 & freq < 10000000) {
            return  "HIGH";
        } else if (freq >= 10000000) {
            return  "EXTRA HIGH";
        }
        return "";
    }

    @Override
    public String toString() {
        return "Word is [" + word + "], search freq is " + result();
    }
}

class Tasck02 { //class GooWordStatTest
    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat02("human", 10));

        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat02("mars", 10000));

        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat02("space", 9965499));

        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat02("life", 564785654));
    }
}