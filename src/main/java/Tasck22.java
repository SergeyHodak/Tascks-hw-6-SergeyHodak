/*
    Задача - определить водянистость текста
Водянистостью будем называть отношение числа пробелов в тексте к общему количеству символов в тексте.
    Задача
    Напиши класс WaterCounter. В этом классе создай метод public double count(String text). Он принимает строку,
    и возвращает водянистость - отношение количества пробелов в тексте к общему количеству символов в тексте.

Никак не округляй возвращаемый результат.

Примеры тестов
вызов кода new WaterCounter().count("Moon invaders") возвращает 0.07692307692307693;
вызов кода new WaterCounter().count("NoWater") возвращает 0.
 */

class WaterCounter22 {
    public double count(String text) {
        double probelov = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {probelov++;}
        }
        if (probelov == 0) {return 0;}
        return probelov / text.length() ;
    }
}

class Tasck22 { //class WaterCounterTest
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter22().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter22().count("NoWater"));
    }
}