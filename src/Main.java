public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Employee("Окунев Владимир", "Кондитер"),
                new Employee("Карасев Павел", "Преподаватель"),
                new Visitor("Маликова Диана", 18),
                new Visitor("Стрелецкий Артем", 34)
        };

        // вывод информации о людях в магазине
        for (Person person : people) {
            person.printInfo();
        }
    }
}