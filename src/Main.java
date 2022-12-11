public class Main {
    public static void main(String[] args) {
        createObject("Dog");
        createObject("Horse");
        createObject("Hamster");
    }

    public static String createObject(String className) {
        if (className == "Dog") {
            Dog dog = new Dog(2, "Шарик", "Сидеть");
            dog.print();
        }
        if (className == "Horse") {
            Horse horse = new Horse(3, "Пегас", "Черный");
            horse.print();
        }
        if (className == "Hamster") {
            Hamster hamster = new Hamster(1, "Хомя", "Прозрачный");
            hamster.print();
        }
        return className;

    }
}
