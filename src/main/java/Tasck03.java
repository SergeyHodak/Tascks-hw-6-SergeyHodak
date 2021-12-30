/*
    Задача - результат поиска
    Результат работы поисковой системы - массив ссылок (URL). Когда мы что-то ищем в поисковике, именно
эти ссылки показываются как результат поиска.
    У каждой ссылки есть домен - адрес сайта, где располагается ссылка. Домен идет сразу после протокола
(http:// или https://) и до первого знака /.
    Тебе нужно написать иммутабельный класс для представления отдельного результата поиска, который будет
хранить ссылку. Также тебе нужно написать в этом классе метод, который будет парсить URL, и выделять оттуда домен.

    Задача
    Напиши класс GooSearchResult.
    У класса должен быть публичный конструктор, принимающий один параметр:
        url типа String - URL страницы с искомой информацией;
    Конструктор должен сохранить этот параметр в приватное поле с таким же именем.
    Создай для этого поля публичный геттер. Сеттер не создавай, это иммутабельный класс.

    Напиши в этом классе метод parseDomain(), который будет выделять домен из поля url.

Примеры тестов
вызов new GooSearchResult("https://test.com").parseDomain() возвращает test.com;
вызов new GooSearchResult("http://apple.in.mars").parseDomain() возвращает apple.in.mars.
 */

class GooSearchResult{
    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        String res = url.replace("https://", "");
        String resu = res.replace("http://", "");
        char[] chArray = resu.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char a: chArray) {
            if (a == '/') {break;}
            result.append(a);
        }
        return result.toString();
    }
}

class Tasck03 { //class GooSearchResultTest
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());

        //mountain.alps.com
        System.out.println(new GooSearchResult("http://mountain.alps.com/resorts").parseDomain());
    }
}