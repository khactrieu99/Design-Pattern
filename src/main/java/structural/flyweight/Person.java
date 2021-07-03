package structural.flyweight;

/**
 * @author trieutk
 */
public class Person {
    private String name;
    private int age;
    private Family family;

    public Person(String name, int age, Family family) {
        this.name = name;
        this.age = age;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
