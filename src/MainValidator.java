public class MainValidator {
    public static void main(String[] args) {
        // Тест 1: Правильный HTML
        String test1 = "<div><p>Текст</p></div>";
        System.out.println("Тест 1: " + test1);
        System.out.println("Результат: " + HTMLValidator.isValid(test1));
        System.out.println("Ожидаемо: true\n");

        // Тест 2: Неправильная вложенность
        String test2 = "<div><p>Текст</div></p>";
        System.out.println("Тест 2: " + test2);
        System.out.println("Результат: " + HTMLValidator.isValid(test2));
        System.out.println("Ожидаемо: false\n");

        // Тест 3: Тег не закрыт
        String test3 = "<div>Текст";
        System.out.println("Тест 3: " + test3);
        System.out.println("Результат: " + HTMLValidator.isValid(test3));
        System.out.println("Ожидаемо: false\n");

        // Тест 4: Несколько уровней вложенности
        String test4 = "<div><span><p>Текст</p></span></div>";
        System.out.println("Тест 4: " + test4);
        System.out.println("Результат: " + HTMLValidator.isValid(test4));
        System.out.println("Ожидаемо: true\n");

        // Тест 5: Пустая строка
        String test5 = "";
        System.out.println("Тест 5: " + test5);
        System.out.println("Результат: " + HTMLValidator.isValid(test5));
        System.out.println("Ожидаемо: true\n");


    }
}
