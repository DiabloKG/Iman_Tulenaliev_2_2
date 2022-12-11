import java.awt.*;

public class Horse extends Animal {
    private String colorManes;

    public Horse(Integer age, String name, String colorManes) {
        super(age, name);
        this.colorManes = colorManes;
    }

    @Override
    public void print() {
        System.out.println("Имя: " + getName() +
                "\n Возраст: " + getAge() +
                "\n Цвет гривы: " + this.colorManes);
    }
}
