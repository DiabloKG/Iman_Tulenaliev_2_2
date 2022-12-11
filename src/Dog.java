public class Dog extends Animal {
    private String commands;

    public Dog(Integer age, String name, String commands) {
        super(age, name);
        this.commands = commands;
    }

    @Override
    public void print() {
        System.out.println("Имя: " + getName() +
                "\n Возраст: " + getAge() +
                "\n Команды: " + this.commands);
    }
}
