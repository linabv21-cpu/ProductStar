import java.util.ArrayList;

public class Person {

        private String name;
        private int age;
        private ArrayList<Person> children;  // Список детей

        public Person(String name, int age) {
            this.name = name;  //  Присваиваем имя
            this.age = age;   // Присваиваем возраст
            this.children = new ArrayList<>();  //  Создаем список
        }

        // Добавить ребёнка
        public void addChildren(Person child) {
            children.add(child);
        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;  //
        }

        public ArrayList<Person> getChildren() {
            return children;  //
        }
    }

