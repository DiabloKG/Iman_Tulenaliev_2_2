public class Animal implements Printable {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Animal(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void print() {

    }
}
