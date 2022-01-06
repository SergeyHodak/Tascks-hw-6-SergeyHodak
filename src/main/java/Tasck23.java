/*
    Задача - есть ли в тексте email
Email считается найденным, если есть строка вида xx@xx, где вместо x - любой символ, кроме пробела.
    Задача
    Напиши класс EmailDetector. В этом классе создай метод public boolean isPresent(String text). Он принимает строку
    и возвращает true лишь в том случае, если в ней есть email согласно описанному алгоритму.

Примеры тестов
выполнение кода new EmailDetector().isPresent("This email is no-reply@goo.com") возвращает true;
выполнение кода new EmailDetector().isPresent("No email present, but @ there") возвращает false.
 */

class EmailDetector23 {
    public boolean isPresent(String text) {
        if (text.contains("@")) {
            if (text.charAt((text.indexOf("@"))-1) == ' ') {
                return false;
            }
            if (text.charAt((text.indexOf("@"))+1) == ' ') {
                return false;
            }
            if (text.charAt((text.indexOf("@"))-2) == ' ') {
                return false;
            }
            if (text.charAt((text.indexOf("@"))+2) == ' ') {
                return false;
            }
            return true;
        }
        return false;
    }
}

class Tasck23 { //class EmailDetectorTest
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector23().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector23().isPresent("No email present, but @ there"));
    }
}