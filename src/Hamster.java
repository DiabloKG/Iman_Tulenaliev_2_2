public class Hamster extends Animal {
    private String colorBall;

    public Hamster(Integer age, String name, String colorBall) {
        super(age, name);
        this.colorBall = colorBall;
    }

    @Override
    public void print() {
        System.out.println("Имя: " + getName() +
                "\n Возраст: " + getAge() +
                "\n Цвет шара: " + this.colorBall);
    }
}
