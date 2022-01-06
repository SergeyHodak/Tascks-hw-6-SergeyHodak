/*
    Задача - склеить объекты в строку
Во время отладки программы полезно бывает вывести значения разных объектов в консоль.
При этом не хочется задумываться о типе объектов.

Ты нашел класс, который делает именно это. Методу этого класса на вход дается массив объектов типа Object,
он склеивает их в строку (неявно вызывается метод toString() у каждого объекта), и возвращается полученная строка.

Проблема та же, что и раньше - это делается в цикле, через конкатенацию строк.

    Задача
    Перепиши метод join(Object[] objects) класса ObjectWorker так, чтобы избежать конкатенации строк в цикле,
    и использовать вместо этого класс StringBuilder.

Примеры тестов
выполнение кода
Object[] data = {"Hello", 20L, 3.14f, true};

System.out.println(new ObjectWorker().join(data));
выводит в консоль Hello 20 3.14 true.
 */

//class ObjectWorker {
//    public String join(Object[] objects) {
//        String result = "";
//
//        for(int i = 0; i < objects.length; i++) {
//            result += objects[i];
//
//            if (i != objects.length - 1) {
//                result += " ";
//            }
//        }
//
//        return result;
//    }
//}

class ObjectWorker28 {
    public String join(Object[] objects) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < objects.length; i++) {
            result.append(objects[i]);

            if (i != objects.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}

class Tasck28 { //class ObjectWorkerTest
    public static void main(String[] args) {
        Object[] data = {"Hello", 20L, 3.14f, true};

        //Hello 20 3.14 true
        System.out.println(new ObjectWorker28().join(data));
    }
}