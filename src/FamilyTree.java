
    public class FamilyTree {


        // Рекурсивный метод для вывода дерева
        public static void printTree(Person person, int level) {
            // если человек null сваливаем
            if (person == null) {
                return;
            }

            // Выводим имя с отступом (чем больше level, тем больше отступ)
            for (int i = 0; i < level; i++) {
                System.out.print("  ");  // 2 пробела на уровень
            }
            System.out.println(person.getName());

            // Рекурсивно выводим всех детей
            for (Person child : person.getChildren()) {  //  Получаем детей
                printTree(child, level + 1);  //  Увеличиваем уровень
            }
        }

        // Поиск человека по имени
        public static Person findPerson(Person root, String nameToFind) {

            if (root == null) {
                return null;
            }

            // Если нашли - возвращаем
            if (root.getName().equals(nameToFind)) {  //  Сравниваем имена
                return root;
            }

            // Ищем среди детей
            for (Person child : root.getChildren()) {
                Person found = findPerson(child, nameToFind);  // Рекурсивный поиск
                if (found != null) {
                    return found;
                }
            }

            return null;  // Не найден
        }
    }

