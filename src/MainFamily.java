
        public class MainFamily {
        public static void main(String[] args) {
            // Создаём людей
            Person grandpa = new Person("Дедушка", 70);
            Person father = new Person("Отец", 45);
            Person mother = new Person("Мама", 43);
            Person son = new Person("Сын", 20);
            Person daughter = new Person("Дочь", 18);

            // Строим дерево
            grandpa.addChildren(father);      // Дедушка - Отец
            father.addChildren(son);          // Отец - Сын
            father.addChildren(daughter);     // Отец - Дочь

            // Выводим дерево
            System.out.println("=== Семейное древо ===");
            FamilyTree.printTree(grandpa, 0);

            // Ищем человека
            System.out.println("\n=== Поиск ===");
            Person found = FamilyTree.findPerson(grandpa, "Сын");
            if (found != null) {
                System.out.println("Найден: " + found.getName() + ", " + found.getAge() + " лет");
            } else {
                System.out.println("Не найден!");
            }
        }
    }

