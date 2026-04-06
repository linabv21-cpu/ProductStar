import java.util.Stack;

public class HTMLValidator {
    // Метод проверяет правильность HTML-разметки
    public static boolean isValid(String html) {
        // 2. Создаём стек для хранения открывающих тегов
        Stack<String> stack = new Stack<>();

        // Удаляем пробелы и переносы строк для упрощения
        html = html.replaceAll("\\s+", " ");

        int i = 0;
        while (i < html.length()) {
            // Ищем открывающую скобку тега
            if (html.charAt(i) == '<') {
                int closeIndex = html.indexOf('>', i);

                if (closeIndex == -1) {
                    return false;
                }
                // Извлекаем тег (всё между < и >)
                String tag = html.substring(i + 1, closeIndex);
                // Проверяем, закрывающий ли это тег
                if (tag.startsWith("/")) {
                    // Закрывающий тег: </div>
                    String tagName = tag.substring(1);
                    // Проверяем, соответствует ли он последнему открытому
                    if (stack.isEmpty() || !stack.pop().equals(tagName)) {
                        return false;
                    }
                } else {
                    //Открывающий тэг div
                    String tagName = tag.split("[\\s/]")[0];
                    stack.push(tagName);
                }
                i = closeIndex + 1;
            } else {
                i++;// Пропускаем текст между тегами

            }
        }


        // 4. В конце проверяем, что все теги закрыты
        return stack.isEmpty(); // ← Если пуст = всё правильно!
    }

}


