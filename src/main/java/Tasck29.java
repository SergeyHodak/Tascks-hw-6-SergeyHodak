/*
    Задача - рефакторинг кода выделения имен
Есть массив строк, каждая строка - это имя и фамилия, через пробел. Метод String parse(String[] names) принимает массив
таких строк, выделяет из каждой лишь имя, и возвращает строку, которая состоит только из имен, разделенных запятой и пробелом.

Проблема такая же, есть конкатенация строк в цикле, что приведет к проблемам на больших данных.

    Задача
    Сделай рефакторинг класса NameParser, перепиши метод String parse(String[] names), чтобы избавиться от конкатенации
    строк в цикле. Используй вместо конкатенации класс StringBuilder.

Важно!. Сохрани код решения текущей задачи, он пригодится тебе при решении следующей задачи.

Примеры тестов
Выполнение кода

String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

System.out.println(new NameParser().parse(names));
выводит в консоль John, Bill, Nigua.
 */

//class NameParser {
//    public String parse(String[] names) {
//        String result = "";
//
//        for(int i = 0; i < names.length; i++) {
//            String firstName = names[i].split(" ")[0];
//
//            result += firstName;
//            if (i != names.length - 1) {
//                result += ", ";
//            }
//        }
//
//        return result;
//    }
//}

class NameParser29 {
    public String parse(String[] names) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];

            result.append(firstName);
            if (i != names.length - 1) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}

class Tasck29 { //class NameParserTest
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser29().parse(names));
    }
}